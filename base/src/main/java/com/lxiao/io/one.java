package com.lxiao.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class one {
    // IO 同步阻塞
    public static void main(String[] args) throws IOException {
        File file = new File("./haha.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("我们都是好孩子，最最天真的孩子".getBytes());
        fileOutputStream.close();
    }
}
