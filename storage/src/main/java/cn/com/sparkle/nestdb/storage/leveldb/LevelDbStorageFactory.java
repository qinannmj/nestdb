package cn.com.sparkle.nestdb.storage.leveldb;

import cn.com.sparkle.nestdb.storage.Storage;
import cn.com.sparkle.nestdb.storage.StorageFactory;

public class LevelDbStorageFactory implements StorageFactory{

	@Override
	public Storage build(String dir) {
		Storage s = new Leveldb();
		s.open(dir);
		return s;
	}
	
}
