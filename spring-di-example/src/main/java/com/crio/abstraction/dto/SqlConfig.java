package com.crio.abstraction.dto;


public class SqlConfig {

    private int port;
    private int maxConn;
    private int maxThreads;

    public SqlConfig(int port, int maxConn, int maxThreads) {
        this.port = port;
        this.maxConn = maxConn;
        this.maxThreads = maxThreads;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getMaxConn() {
        return maxConn;
    }

    public void setMaxConn(int maxConn) {
        this.maxConn = maxConn;
    }

    public int getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
    }
}
