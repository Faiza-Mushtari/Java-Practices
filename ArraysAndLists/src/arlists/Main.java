package arlists;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        System.out.println(integerList);

        System.out.println("First element: " + integerList.get(0));

        //1. for-each loop
        for(int currentList:integerList){
            System.out.println(currentList);
        }

        //2. using conventional for loop
        for(int i=0;i<integerList.size();i++){
            System.out.println(integerList.get(i));
        }

        //removing an indexed item
        integerList.remove(2);
        System.out.println("After removing: " + integerList);

        //if index is unknown
        int index = integerList.indexOf(20);
        integerList.remove(index);

        System.out.println("After removing: " + integerList);

        //iterator is an object that goes through every element in the arraylist
        Iterator iterator = integerList.iterator();

        while(iterator.hasNext()){
            System.out.println("Printing with iterator: "+iterator.next());
        }

        System.out.println(integerList.indexOf(10));
        System.out.println(integerList.contains(20));
        System.out.println(integerList.contains(30));

        //use of comparator
        //sorting integer list
//        System.out.println("Before sort: " + integerList);
//
//        Collections.sort(integerList, new SortComparator());
//
//        System.out.println("After sort: " + integerList);

        //sorting string list
        List<String> stringList = new ArrayList<>();
        stringList.add("Evan");
        stringList.add("Tina");
        stringList.add("Rakhi");

        System.out.println("Before sort: " + stringList);

        Collections.sort(stringList, new SortComparator());

        System.out.println("After sort: " + stringList);
    }
}
