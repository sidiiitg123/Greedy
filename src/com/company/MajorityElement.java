package com.company;

import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {
    public int majorityElement(final List<Integer> A) {

        Map<Integer,Integer> mymap=new HashMap<>();

        for(int i:A){
            if(mymap.containsKey(i)){
               mymap.put(i,mymap.get(i)+1);
            }else{
                mymap.put(i,1);
            }
        }
        int number=0,count=Integer.MIN_VALUE;
        for(int i:mymap.keySet()){
            int max=mymap.get(i);
            if(count<max){
                count=max;
                number=i;
            }
        }
        return number;
    }
}
