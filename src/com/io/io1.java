package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class io1 {
    public static void main(String[] args) throws IOException {
        //建立程序到文件的桥梁
        FileOutputStream fos = new FileOutputStream("D:\\Arifi\\java\\text001\\src\\com\\aaa\\ccc.txt");
        //通过桥梁添加内容
        fos.write(97);
        //关闭桥梁

        fos.close();
    }
}
