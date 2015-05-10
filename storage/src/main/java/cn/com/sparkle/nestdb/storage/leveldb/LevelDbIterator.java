package cn.com.sparkle.nestdb.storage.leveldb;

import cn.com.sparkle.nestdb.storage.StorageIterator;



public class LevelDbIterator implements StorageIterator {
	private long nativePoint = 0;

	public LevelDbIterator(long nativePoint) {
		this.nativePoint = nativePoint;
	}

	@Override
	public boolean hasNext() {
		return _hasNext(nativePoint);
	}

	@Override
	public Entry next() {
		return _next(nativePoint);
	}

	@Override
	public void remove() {
		_remove(nativePoint);
	}
	
	@Override
	public void close() {
		_close(nativePoint);
	}
	private native boolean _hasNext(long nativePoint);
	private native Entry _next(long nativePoint);
	private native void _remove(long nativePoint);
	private native void _close(long nativePoint);
	
	
}
