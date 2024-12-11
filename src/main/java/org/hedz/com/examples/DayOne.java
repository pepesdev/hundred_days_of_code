package org.hedz.com.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DayOne {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jose","Berenice","Melani");
        Comparator<String> comparatorLength = ((o1, o2) -> o1.length() - o2.length());
        names.sort(comparatorLength);
        System.out.println(names);

    }
}