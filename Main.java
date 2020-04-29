package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeSet;

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

        Workspace.StringComparator2 myComparator = new Workspace.StringComparator2();
        myList.sort(myComparator);

       System.out.println(myList);
    }
}