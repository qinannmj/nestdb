package cn.com.sparkle.nestdb.storage;

import java.util.Iterator;

public interface Storage {
	
	public long open(String dir);
	public void close();
	public void write(byte[] key,byte[] value,long logSeqId);
	public void get(byte[] key,long timeout);
	public Iterator<Entry> scan(byte[] lt,byte[] gt);
	public Iterator<Entry> snapshot();
	public long byteSize();
	 
	public final static class Entry{
		private byte[] key;
		private byte[] value;
		
		public Entry(byte[] key, byte[] value) {
			super();
			this.key = key;
			this.value = value;
		}
		public byte[] getKey() {
			return key;
		}
		public void setKey(byte[] key) {
			this.key = key;
		}
		public byte[] getValue() {
			return value;
		}
		public void setValue(byte[] value) {
			this.value = value;
		}
	}
}
	
