package arlists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        //iterator is an object that goes through every element in the arraylist
        Iterator iterator = integerList.iterator();

        while(iterator.hasNext()){
            System.out.println("Printing with iterator: "+iterator.next());
        }

        System.out.println(integerList.indexOf(10));
        System.out.println(integerList.contains(20));
        System.out.println(integerList.contains(30));
    }
}
