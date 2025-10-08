package com.file;

import java.io.File;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Arifi\\java\\text001\\src\\com\\aaa");
//        //先创建文件aaa
//        file.mkdirs();
//        //再创建文件aaa\\bbb
//        File file2 = new File(file, "ccc.txt");
//        boolean newFile = file2.createNewFile();
//        if (newFile) {
//            System.out.println("文件创建成功");
//        } else {
//            System.out.println("文件创建失败");
//        }
        //遍历文件夹，找txt类型的文件，不考虑子文件
        boolean b = haveTxt(file);
        System.out.println(b);

    }
    public static boolean haveTxt (File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile() && f.getName().endsWith(".txt")){
                return true;
            }
        }
        return false;
    }
}
