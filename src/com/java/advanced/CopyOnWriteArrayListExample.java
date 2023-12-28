package com.java.advanced;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
//    	ArrayList<String> list = new ArrayList<String>();
    	List<String> list = new CopyOnWriteArrayList<String>();
        list.add("Apple");
        list.add("Sachin");
        list.add("USA");
        list.add("Asia");
        list.add("Texas");
        
        // get the iterator
        Iterator<String> it = list.iterator();
        System.out.println("list is:"+list);
        //manipulate list while iterating
        while(it.hasNext()){
//            System.out.println("list is:"+list);
            String str = it.next();
//            System.out.println(str);
            
            if(str.equals("Sachin"))list.remove(4);
            
            if(str.equals("Asia"))list.add("3 found");
            
            //below code don't throw ConcurrentModificationException
//            //because it doesn't change modCount variable of list
            if(str.equals("USA")) list.set(1, "Grapes");
        }
        System.out.println("list is:"+list);
    }
}
