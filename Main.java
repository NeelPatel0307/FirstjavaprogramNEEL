package com.company;
import java.time.LocalDate;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // int [] marks = new int[5]
        //marks [0] = 10 ;
        // marks [1] = 20 ;
        //  marks [2] = 30 ;
        // marks [3] = 40 ;
        //  marks [4] = 50 ;

        // int marks [] = {10,20,30};
        //float marks [] = {10.5f,20.55f,30.11f};
        //String [] students = { "neel" ,"Hi"};

        // System.out.println(students[1]);
        // System.out.println(students.length);

        //   int marks [] = {10,20,30,40,50};


        /*for (int i=0; i<marks.length;i++)
        {

            System.out.println(marks[i]);
        }*/

       /* int[][] marks = new int[2][3];
        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[0][2] = 30;
        marks[1][0] = 40;
        marks[1][1] = 50;
        marks[1][2] = 60;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {

                System.out.print(marks[i][j]);
                System.out.print("  ");
            }

            System.out.println("");


        }*/



        /*int marks [] = {10,20,30,40,50};
        int sum=0;

        for (int element :marks){

            sum = sum + element;

        }


        System.out.println(sum);*/

       /* String name;
        name = new String("NEEL patel");

        int value = name.length();
        System.out.println(value);

        String lowercase =  name.toLowerCase();
        System.out.println(lowercase);

        String uppercase=  name.toUpperCase();
        System.out.println(uppercase);*/


        /*String s = "NEEL";
        String s2 = "patel";
        String s1 = s.concat(s2);
        System.out.println(s1);*/

// Sting comparison
     /*   String s1 = "neel";
        String s2 = "hello";
        String s3 = "neel";
        System.out.println(s1.equals(s3));        //method1
        System.out.println(s1==s3);               //method2
        System.out.println(s1.compareTo(s3)); */   //method3

        /*
        String s1 = "neel";
        System.out.println(s1.substring(1,2));*/

//bufferclass
       // StringBuffer s1 = new StringBuffer("neel");
         //s1.insert(1,"java");
        // s1.append("patel");
        //s1.replace(1,3,"HI");
       // s1.delete(1,3);
       // s1.reverse();
       // s1.capacity();
      //  System.out.println( s1.capacity());

   //     builder class
       // StringBuffer s1 = new StringBuffer("neel");
       // s1.append(1);



//String s1 = "neel";


       // System.out.println(s1.contains("e"));
      //  String date = String.join("/","25", "2017");
       // System.out.println(date);



        //DATE
LocalDate date = LocalDate.now();
LocalDate yesterday =  date.minusDays(1);
LocalDate somedays  = yesterday.plusDays(3);


        System.out.println(date);
        System.out.println(yesterday);
        System.out.println(somedays);


    }
}