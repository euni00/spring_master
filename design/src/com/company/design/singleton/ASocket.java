package com.company.design.singleton;

public class ASocket {

        private SocketClient socketClient;

        public ASocket() {  // 생성자
            this.socketClient = SocketClient.getInstance();
            // this.socketClient = new SocketClient();
        }

        public SocketClient getSocketClient() {  // 메소드 생성
            return this.socketClient;
        }
}
