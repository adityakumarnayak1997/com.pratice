package com.pratice;

import java.util.*;
public class hashMap {
   public static void main(String args[]) {
      int a[] = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
      Set<Integer> s = new HashSet<Integer>();
      try {
         for(int i = 0; i < 8; i++) {
            s.add(a[i]);
         }
         System.out.println(s);
         TreeSet<Integer> sorted = new TreeSet<Integer>(s);
         System.out.println("Sorted list = ");
         System.out.println(sorted);
      } 
      catch(Exception e) {}
   }
}