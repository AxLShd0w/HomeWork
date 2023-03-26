package com.ua.HomeWork.l19;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new LinkedHashSet<>();
        Set<Integer> s3 = new TreeSet<>();
        for(int i = 0; i < 1000; i ++){
            int random = new Random().nextInt(1,50);
            s1.add(random);
            s2.add(random);
            s3.add(random);
        }
        System.out.println("HashSet is : " + s1);
        System.out.println("LinkedHashSet is : " + s2);
        System.out.println("TreeSet is : " + s3);
    }
}
