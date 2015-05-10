package cn.com.sparkle.nestdb.storage.leveldb;

import cn.com.sparkle.nestdb.storage.Storage;
import cn.com.sparkle.nestdb.storage.StorageIterator;

public class Leveldb implements Storage {
	private long nativeDbPoint = 0;
	private volatile long byteSize = 0;

	@Override
	public synchronized long open(String dir) {
		if (nativeDbPoint == 0) {
			Status s = _open(dir);
			this.nativeDbPoint = s.dbPoint;
			this.byteSize = s.byteSize;
			return s.logId;
		} else {
			throw new RuntimeException("This db instance has opend.");
		}
	}

	@Override
	public synchronized void close() {
		if (nativeDbPoint != 0) {
			_close(nativeDbPoint);
			nativeDbPoint = 0;
		}
	}

	@Override
	public synchronized void write(byte[] key, byte[] value, long logSeqId) {
		byteSize += _write(nativeDbPoint, key, value, logSeqId);
	}

	@Override
	public byte[] get(byte[] key, long timeout) {
		return _get(nativeDbPoint, key, timeout);

	}

	@Override
	public StorageIterator scan(byte[] lt, byte[] gt) {
		long iterPoint = _scan(nativeDbPoint, lt, gt);
		return new LevelDbIterator(iterPoint);
	}

	@Override
	public StorageIterator snapshot() {
		return _snapshot(nativeDbPoint);
	}

	@Override
	public long byteSize() {
		return this.byteSize;
	}
	private class Status {
		private long dbPoint;
		private long logId;
		private long byteSize;
		@SuppressWarnings("unused")
		public Status(long dbPoint, long logId, long byteSize) {
			super();
			this.dbPoint = dbPoint;
			this.logId = logId;
			this.byteSize = byteSize;
		}
	}

	private native void _close(long dbPoint);

	private native Status _open(String dir);

	private native byte[] _get(long dbPoint, byte[] key, long timeout);

	//return the byte size of the current db
	private native long _write(long dbPoint, byte[] key, byte[] value, long logSeqId);

	private native long _scan(long dbPoint, byte[] lt, byte[] gt);

	private native StorageIterator _snapshot(long dbPoint);
}
