package com.company.design.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        /* String msg = String.fomat("Reader %s 로 연결합니다.", filename);
        System.out.println(msg); */
        System.out.println("FileWriter Connected");
    }

    public void fileDisconnect(String content) {
        System.out.println("FileWriter disConnected");
    }

    public void fileWrite(String content) {
        System.out.println("write : " + content);
    }
}
