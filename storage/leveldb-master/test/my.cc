//============================================================================
// Name        : test.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <assert.h>
#include <stddef.h>
#include <string.h>
#include <string>
#include <stdio.h>
#include "leveldb/db.h"
using namespace std;



int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	std::string s = "fsdfdsf";
	//test(s);
	leveldb::DB* db;
	leveldb::Options options;

	options.create_if_missing = true;

	leveldb::Status status = leveldb::DB::Open(options, "ldb", &db);
	if(status.ok()){
		leveldb::WriteOptions wo;
		wo.sync = true;
		leveldb::ReadOptions ro;
//		db->Put(wo,"aa","bb");
		delete db;
		cout << "write finished!"<< endl;
	}else{
		cout << status.ToString() << endl;
	}

	return 0;
}

