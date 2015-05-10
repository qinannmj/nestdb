package cn.com.sparkle.nestdb.storage;

public interface StorageFactory {
	public Storage build(String dir);
}
