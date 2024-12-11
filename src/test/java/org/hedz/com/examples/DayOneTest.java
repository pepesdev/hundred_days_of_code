package org.hedz.com.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOneTest {

    @Test
    public void should_reversed_sort_test(){
        List<String> names = Arrays.asList("Jose","Berenice","Melani");
        Comparator<String> comparatorLength = ((o1, o2) -> o2.length() - o1.length());
        names.sort(comparatorLength);
        assertEquals(names.get(0),"Berenice" );
        assertEquals(names.get(1),"Melani");
        assertEquals(names.get(2),"Jose");
    }
}
