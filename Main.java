package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<String> myList = new ArrayList<>();

        String firstTask = new String("danil.rar");
        String secondTask = new String("anchukov.doc");
        String thirdTask = new String("argument.rar");
        String Task4 = new String("danil.png");
        String Task5 = new String("fkn.png");
        String Task6 = new String("zdesNet.doc");
        String Task7 = new String("nikakogo.exe");
        String Task8 = new String("skritogoPoslaniya.exe");

        myList.add(firstTask);
        myList.add(secondTask);
        myList.add(thirdTask);
        myList.add(Task4);
        myList.add(Task5);
        myList.add(Task6);
        myList.add(Task7);
        myList.add(Task8);

        StringComparator1 myComparator1 = new StringComparator1();
        myList.sort(myComparator1);
        System.out.println(myList);

        StringComparator2 myComparator2 = new StringComparator2();
        myList.sort(myComparator2);
        System.out.println(myList);

        StringComparator3 myComparator3 = new StringComparator3();
        myList.sort(myComparator3);
        System.out.println(myList);

        StringComparator4 myComparator4 = new StringComparator4();
        myList.sort(myComparator4);
        System.out.println(myList);
    }
}