package com.company;
import java.util.*;
public class alllist {


    public static void main(String[] args) {

       ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //System.out.println(list);


       /* System.out.println("REMOVING OPERATION");

        list.remove(2);

        System.out.println(list);

        System.out.println("REMOVING OPERATION");*/


Iterator itr = list.iterator();
//for (String element : list)


        //System.out.println(element);

while(itr.hasNext())
    System.out.println(itr.next());


    }
}
