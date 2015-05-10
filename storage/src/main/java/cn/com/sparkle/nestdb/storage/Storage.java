package cn.com.sparkle.nestdb.storage;

public interface Storage {
	
	public long open(String dir);
	public void close();
	public void write(byte[] key,byte[] value,long logSeqId);
	public byte[] get(byte[] key,long timeout);
	public StorageIterator scan(byte[] lt,byte[] gt);
	public StorageIterator snapshot();
	public long byteSize();
	 
	
}
	
