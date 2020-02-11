package org.sairaa;

import java.util.Map;

public class Comparator implements java.util.Comparator<Map .Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if(o1.getValue()>o2.getValue())
            return -1;
        else if(o1.getValue() == o2.getValue())
            return 0;
        else if(o1.getValue()<o2.getValue())
            return 1;
        return Integer.MIN_VALUE;
    }
}
