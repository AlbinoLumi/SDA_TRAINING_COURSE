package com.DesignPatters.Singleton;

public class DbConfig {

    private int port;
    private String ip;
    private String password;
    private String username;

    private static DbConfig dbConfig; //lazyloading
    private DbConfig(){

    }

    public  static DbConfig getDbConfig(){
        if(dbConfig == null)
        {
            synchronized (DbConfig.class) { //eshte per multithreads
                if(dbConfig == null) {

                    dbConfig = new DbConfig();
                }
            }
        }
        return dbConfig;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
