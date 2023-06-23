package com.guru.spring5webapp.designpatterns.creational.factory;

public class DBManager {

    private static DBManager dbManager;
    String ip;

    private DBManager(String ip) {
        this.ip = ip;
    }

    public static DBManager getInstance(String ip) {
        if (dbManager == null) {
            return new DBManager(ip);
        }
        return dbManager;
    }
}
