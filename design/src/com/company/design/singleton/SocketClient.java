package com.company.design.singleton;

import java.net.Socket;

public class SocketClient {

    private static SocketClient socketClient = null;  // Singleton -> 자기 자신을 객체로 가지고 있어야함

    private SocketClient() {  // 기본 생성자
        // 같은 Singleton 방식이 아니였다면
        // private -> public
    }

    public static SocketClient getInstance() {
        // 메소드 제공, static -> 어떠한 클래스에서도 바로 SocketClient.getInstance에 접근가능.
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
