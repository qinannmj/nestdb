/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class cn_com_sparkle_nestdb_storage_leveldb_Leveldb */

#ifndef _Included_cn_com_sparkle_nestdb_storage_leveldb_Leveldb
#define _Included_cn_com_sparkle_nestdb_storage_leveldb_Leveldb
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     cn_com_sparkle_nestdb_storage_leveldb_Leveldb
 * Method:    open
 * Signature: (Ljava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_cn_com_sparkle_nestdb_storage_leveldb_Leveldb_open
  (JNIEnv *, jobject, jstring);

/*
 * Class:     cn_com_sparkle_nestdb_storage_leveldb_Leveldb
 * Method:    close
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_cn_com_sparkle_nestdb_storage_leveldb_Leveldb_close
  (JNIEnv *, jobject);

/*
 * Class:     cn_com_sparkle_nestdb_storage_leveldb_Leveldb
 * Method:    write
 * Signature: ([B[BJ)V
 */
JNIEXPORT void JNICALL Java_cn_com_sparkle_nestdb_storage_leveldb_Leveldb_write
  (JNIEnv *, jobject, jbyteArray, jbyteArray, jlong);

/*
 * Class:     cn_com_sparkle_nestdb_storage_leveldb_Leveldb
 * Method:    get
 * Signature: ([BJ)V
 */
JNIEXPORT void JNICALL Java_cn_com_sparkle_nestdb_storage_leveldb_Leveldb_get
  (JNIEnv *, jobject, jbyteArray, jlong);

/*
 * Class:     cn_com_sparkle_nestdb_storage_leveldb_Leveldb
 * Method:    scan
 * Signature: ([B[B)Ljava/util/Iterator;
 */
JNIEXPORT jobject JNICALL Java_cn_com_sparkle_nestdb_storage_leveldb_Leveldb_scan
  (JNIEnv *, jobject, jbyteArray, jbyteArray);

/*
 * Class:     cn_com_sparkle_nestdb_storage_leveldb_Leveldb
 * Method:    snapshot
 * Signature: ()Ljava/util/Iterator;
 */
JNIEXPORT jobject JNICALL Java_cn_com_sparkle_nestdb_storage_leveldb_Leveldb_snapshot
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif