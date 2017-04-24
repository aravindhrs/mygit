/*package com.mongodb.test;

import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.model.MongoUser;

public class JavaMongoDB {
	public static void main(String[] args) {
		//MongoClient mongoClient  = new MongoClient("localhost", 27017);
		//MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://mongoadmin:mongoadmin@localhost:27017"));
		 MongoClient mongoClient = new MongoClient(asList(new ServerAddress("localhost"), new ServerAddress("localhost:27018")),
                 singletonList(MongoCredential.createCredential("username",
                                                                "admin",
                                                                "bad".toCharArray())),
                 MongoClientOptions.builder().serverSelectionTimeout(1000).build());
		System.out.println(mongoClient.isLocked());
		DB db = mongoClient.getDB("MongoDBJava");
		List<String> databaseNames = mongoClient.getDatabaseNames();
		
		System.out.println("databaseNames:"+databaseNames);
		//mongoClient.getDB("admin").command("ping");
		//MongoClientOptions.builder().serverSelectionTimeout(1000).build());
		DBCollection collection;
		if (!db.collectionExists("MongoUsers1")) {
			BasicDBObject options = new BasicDBObject();
		    //BasicDBObject options = new BasicDBObject("capped", true);
		    //options.append("size", 4096);
		    //options.append("max", 5);
		    collection = db.createCollection("MongoUsers1", options);
		} else {
		    collection = db.getCollection("MongoUsers1");
		}
		System.out.println("------"+collection.getDB());
        System.out.println("Collection created successfully");
		Set<String> collections = db.getCollectionNames();
		System.out.println(collections);
		System.out.println(mongoClient.toString());
		mongoClient.close();
	}
}
*/