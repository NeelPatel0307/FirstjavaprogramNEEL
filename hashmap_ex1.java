package com.company;

import java.util.HashMap;


public class hashmap_ex1 {
    public static void main(String[] args) {
        HashMap<Integer,String> al = new HashMap<Integer,String>();

        al.put(1,"NEEL");
        al.put(2,"HELLO");
        al.put(3,"HIII");
        System.out.println("simple example");
        System.out.println(al);

        System.out.println("contain example");
        System.out.println(al.containsKey(1));


        System.out.println("REMOVE example");
        al.remove(1,"NEEL");
        System.out.println(al);


        System.out.println("ADD example");
        al.put(1,"NEEL");
        System.out.println(al);

        System.out.println("for finding any particular key or object example");
        System.out.println(al.get(1));

        System.out.println("REPLACING ELEMENT example");
        al.replace(3,"ZZZ");
        System.out.println(al);

        System.out.println("CLEAR all elements example");
        al.clear();
        System.out.println(al);




    }
}
