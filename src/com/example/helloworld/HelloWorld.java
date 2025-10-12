package com.example.helloworld;

import java.net.SocketOption;
import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");

       Map<String, Integer> result = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(result);


    }

}

