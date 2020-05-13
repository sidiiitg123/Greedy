package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Candy {

    public int candy(ArrayList<Integer> A) {
        if(A.size()==0){
            return 0;
        }
        int total = 0;
        Integer[] result=new Integer[A.size()];
        Arrays.fill(result,1);

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > A.get(i - 1)) {
                result[i]=result[i-1]+1;
            }
        }
        for (int i = A.size() - 2; i >= 0; i--) {
            if (A.get(i) > A.get(i + 1)) {
                int value = Math.max(result[i], result[i+1]+1) ;
                result[i]=value;
            }
        }
        for (int i = 0; i < A.size(); i++) {
            total += result[i];
        }
        return total;
    }
}
