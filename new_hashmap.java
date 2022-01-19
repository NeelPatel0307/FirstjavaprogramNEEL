package com.company;
import java.util.*;

class Student {
    int id;
    String name;
    String surname;

    public Student(int id, String name, String surmane) {

        this.id = id;
        this.name = name;
        this.surname = surname;

    }
}


public class new_hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> al = new HashMap<Integer,String>();

        Student b1 = new   Student(11,"neel","patel");
        Student b2 = new   Student(12,"hiii","patel");

        al.put(11,"b1");
        al.put(12,"b2");

        System.out.println(al);
    }
}






