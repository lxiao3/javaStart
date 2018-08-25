package com.lxiao.io.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        Socket socket = null;
        InputStream input = null;
        OutputStream out = null;
        try {
            server = new ServerSocket(8000);
            System.out.println("server listing 8000 : ");
            socket = server.accept();
            input = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = input.read(buffer)) > 0) {
                System.out.print(new String(buffer, 0, len));
            }

            out = socket.getOutputStream();
            out.write("Hello, everyBody".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
