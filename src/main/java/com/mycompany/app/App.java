package com.mycompany.app;


import com.mongodb.MongoClient;
import com.mongodb.MongoException;
public class App {
    public static void main(String[] args) {
        MongoClient mongoClient = null;
        mongoClient.getDatabaseNames().forEach(System.out::println);
        try {
            mongoClient = new MongoClient( "127.0.0.1" , 27017 );
 
            System.out.println("Connected to MongoDB!");
        } catch (MongoException e) {
            e.printStackTrace();
        } finally {
            if(mongoClient!=null)
                mongoClient.close();
        }


    }

}

