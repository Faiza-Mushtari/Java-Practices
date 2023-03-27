package arlists;

import java.util.Comparator;

//for integer list
//public class SortComparator implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        //return o1.compareTo(o2); //normal sort
//        return o2.compareTo(o1); //reverse order sort
//    }
//}

//for string list
public class SortComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //return o1.compareTo(o2); //normal sort
        return o2.compareTo(o1); //reverse order sort
    }
}

