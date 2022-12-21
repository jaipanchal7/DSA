package com.jai.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndLamdaExpression {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,68,9,8,10,43,17);
        System.out.println(list);

        System.out.println(list.stream().filter(n->n%2==0).collect(Collectors.toList()));

        List<Integer> st = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(st);

        Stream<Integer> st1 = list.stream();
        st1.filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(st1); // gives address of st1

        list.stream().filter(n->n%2==0).sorted().forEach(n-> System.out.println(n)); // line by line

        list.stream().filter(n->n%2==0).sorted().forEach(n-> System.out.print(n+" "));

    }
}
