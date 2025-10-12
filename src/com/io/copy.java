package com.io;

import java.io.*;

public class copy {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\Arifi\\java\\素材\\image");
        File dest = new File("D:\\Arifi\\java\\素材\\image_copy");

        copylist(src, dest);
    }

    private static void copylist(File src, File dest) throws IOException {
        //创建dest的目录，每次拷贝都要先创建目录，之后再进行内容的拷贝，就使用mkdirs()方法
        dest.mkdirs();
        //进入数据源，使用listFiles()方法获取所有的文件和文件夹，存在一个数组里面
        File[] files = src.listFiles();
        //遍历数据源，使用递归的方式进行拷贝
        for (File file : files){
            if(file.isFile()){
                //如果是，则拷贝
                //字节流读取文件，输出流写入文件，输出流参数不要写dest，因为dest是文件夹，而文件名是file.getName()，就是我们新建的文件名
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                byte[] buffer = new byte[1024];
                int len = 0 ;
                while((len = fis.read(buffer))!= -1){
                    fos.write(buffer, 0, len);
                }
                fos.close();
                fis.close();
            }else {
                //如果是文件夹，则递归调用
                copylist(file, new File(dest, file.getName()));

            }
        }


    }
}
