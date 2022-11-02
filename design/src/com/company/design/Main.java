package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.facade.*;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.*;
import com.company.design.decorator.*;
import com.company.design.strategy.*;
import com.company.design.singleton.ASocket;
import com.company.design.singleton.BSocket;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.Encoder;
import com.company.design.strategy.EncodingStrategy;

import java.util.concurrent.atomic.AtomicLong;


public class Main {
    public static void main(String[] args) {

        // Singleton
        /*
        ASocket aSocket = new ASocket();
        BSocket bSocket = new BSocket();

        SocketClient aClient = aSocket.getSocketClient();
        SocketClient bClient = bSocket.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));  // true
        */

        // Adapter
        /*
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        // Cleaner cleaner = new Cleaner();
        // connect(cleaner);
        // Cleaner는 220V에서 상속받음 -> connect는 110V를 요구하는 상황 -> 변환이 필요하다.

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
        */

        // Proxy
        /* Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        */

        // Aop
        /* AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                // 람다식
                ()-> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()-> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());
         */

        // Decorator
        /* ICar audi = new Audi(1000);

        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice(); */

        // Observer
        /* Button button = new Button("버튼");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메시지 전달 : click1");
        button.click("메시지 전달 : click2");
        button.click("메시지 전달 : click3");
        button.click("메시지 전달 : click4");
         */

        // Facade
        // 1) facade X
        /* Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.fileWrite("yeeunlee");

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect("yeeunlee");
        ftpClient.disConnect(); */

        // 2) facade O
        /* SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();

        sftpClient.write();

        sftpClient.read();

        sftpClient.disConnect(); */

        // Strategy
        Encoder encoder = new Encoder();

        // base64
        EncodingStrategy base64 = new Base64Strategy();

        // normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }

    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}