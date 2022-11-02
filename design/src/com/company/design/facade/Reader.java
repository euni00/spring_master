package com.company.design.facade;

public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        /* String msg = String.fomat("Reader %s 로 연결합니다.", filename);
        System.out.println(msg); */
        System.out.println("FieReader Connected");
    }

    public void fileDisconnect() {
        System.out.println("FileReader disConnected");
    }

    public String fileRead() {
        return "content";
    }

}
