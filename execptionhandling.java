package com.company;

public class execptionhandling {
    public static void main(String[] args) {


        try{
            int i;

     i=100/0;


        }

        catch (Exception e){
            System.out.println(e);
        }
finally {
            System.out.println("this code is executed");
        }

    }
}
