package cn.com.sparkle.nestdb.storage.leveldb;

import java.util.Iterator;

import cn.com.sparkle.nestdb.storage.Storage;

public class Leveldb implements Storage{

	@Override
	public native long open(String dir);

	@Override
	public native void close();

	@Override
	public native void write(byte[] key, byte[] value, long logSeqId);

	@Override
	public native void get(byte[] key, long timeout);
	@Override
	public native Iterator<Entry> scan(byte[] lt, byte[] gt);
	
	@Override
	public native Iterator<Entry> snapshot();
	
	
}
