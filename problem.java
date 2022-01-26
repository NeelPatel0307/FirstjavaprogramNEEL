package com.example.demo;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class problem {




        public static void main(String[] args) {
            List<String> abc = new ArrayList<String>();
            List<Date> hello = new ArrayList<Date>();

            abc.add("JAN-2022");
            abc.add("JAN-2021");
            abc.add("DEC-2021");
            abc.add("APR-2021");

            try {

                for (String abc1 : abc) {

                    Date date;

                    date = new SimpleDateFormat("MMM-yyyy", Locale.ENGLISH)
                            .parse(abc1);
                    hello.add(date);

                }

                hello.sort(new Comparator<Date>() {

                    public int compare(Date arg0, Date arg1) {

                        return arg0.compareTo(arg1);
                    }
                });


                for (Date date1 : hello) {
                    System.out.println("Sorted : " + new SimpleDateFormat("MMM-yyyy", Locale.ENGLISH).format(date1));
                }

            } catch (ParseException e) {

                e.printStackTrace();

            }
        }
    }

