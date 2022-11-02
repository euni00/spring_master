package com.company.design.singleton;

public class BSocket {

    private SocketClient socketClient;

    public BSocket() {
        this.socketClient =  SocketClient.getInstance();
        // this.socketClient = new SocketClient();
    }
    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
