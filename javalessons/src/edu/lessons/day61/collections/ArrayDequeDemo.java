package edu.lessons.day61.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[]args)
    {
    ArrayDeque<String>arraydeque=new ArrayDeque<String>();
    arraydeque.push("A");
    arraydeque.push("B");
    arraydeque.push("X");
    arraydeque.push("Z");
    arraydeque.push("D");
    arraydeque.push("X");
    arraydeque.push("Z");
    arraydeque.push("E");
    arraydeque.push("F");
    //System.out.println("before popping yhe stack:"+arraydeque.size());
    //while(arraydeque.peek()!=null)
        //System.out.println(arraydeque.pop()+" "); 
    //System.out.println("after popping the stack: "+arraydeque.size());
    Iterator<String>iterator=arraydeque.iterator();
    while(iterator.hasNext())
    {
    System.out.println("\t"+iterator.next());
    }
    Iterator <String>striterator=arraydeque.descendingIterator();
    while(striterator.hasNext())
    {
        System.out.println("\t"+striterator.next());
    }
    arraydeque.add("H");
    arraydeque.add("I");
    iterator=arraydeque.iterator();
    while(iterator.hasNext())
    {
        System.out.println("\t"+iterator.next());
    }
    //---
    //pollFirst
    //Retrives and removes the first element of this deque,or
    //returns null if this deque is empty
    System.out.println("***************pollFirst"+arraydeque.peekFirst());
    System.out.println(arraydeque);
    System.out.println("***************pollLast"+arraydeque.peekLast());
    System.out.println(arraydeque);
    //---
    //peekFirst
    //Retrives and removes the first element of this deque,or
    //returns null if this deque is empty
    System.out.println("***************peekFirst"+arraydeque.peekFirst());
    System.out.println(arraydeque);
    System.out.println("***************peekLast"+arraydeque.peekLast());
    System.out.println(arraydeque);
    //---
    //removeFirst
    //Retrives and removes the first element of this deque,or
    //returns null if this deque is empty
    System.out.println("***************removeFirst"+arraydeque.removeFirst());
    System.out.println(arraydeque);
    System.out.println("***************removeLast"+arraydeque.removeLast());
    System.out.println(arraydeque);
    //--
    System.out.println("***************removeFirstOccurrence"+arraydeque.removeFirstOccurrence("X"));
    System.out.println(arraydeque);
    System.out.println("***************removeLastOccurrence"+arraydeque.removeLastOccurrence("Z"));
    System.out.println(arraydeque);
    }

}