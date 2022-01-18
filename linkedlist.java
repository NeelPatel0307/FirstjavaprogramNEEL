package com.company;

import javax.swing.text.html.HTMLDocument;
;
import java.util.*;
public class linkedlist {


    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator <String> itr = al.iterator();
while(itr.hasNext())
        System.out.println(itr.next());


al.removeFirstOccurrence("Ravi");

        System.out.println(al);

        al.removeFirstOccurrence("Ravi");
        System.out.println(al);

        al.add("Neel");
        al.add("Hello");
        System.out.println(al);



        al.addFirst("Hiiiiiii");
        System.out.println(al);

        al.addLast("Hiiiiiii");
        System.out.println(al);

        LinkedList<String> al1=new LinkedList<String>();
        al1.add("Mac");
        al1.add("Hp");
        System.out.println(al1);


        al1.addAll(al);
        System.out.println(al1);


        al1.clear();

        System.out.println(al1);





    }
}
