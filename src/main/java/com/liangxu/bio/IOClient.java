package com.liangxu.bio;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

public class IOClient {

    public static void main(String[] args) {
        // TODO 创建多个线程，模拟多个客户端连接服务端
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 3333);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world 1").getBytes());
                        Thread.sleep(5000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();


      new Thread(() -> {
        try {
          Socket socket = new Socket("127.0.0.1", 3333);
          while (true) {
            try {
              socket.getOutputStream().write((new Date() + ": hello world 2 ").getBytes());
              Thread.sleep(10000);
            } catch (Exception e) {
            }
          }
        } catch (IOException e) {
        }
      }).start();


      new Thread(() -> {
        try {
          Socket socket = new Socket("127.0.0.1", 3333);
          while (true) {
            try {
              socket.getOutputStream().write((new Date() + ": hello world 3 ").getBytes());
              Thread.sleep(15000);
            } catch (Exception e) {
            }
          }
        } catch (IOException e) {
        }
      }).start();

    }

}