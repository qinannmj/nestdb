package cn.com.sparkle.nestdb.storage;

import java.util.Iterator;

public interface StorageIterator extends Iterator<StorageIterator.Entry>{
	/*
	 * The iterator must be closed after it has been used
	 */
	public void close();
	
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
