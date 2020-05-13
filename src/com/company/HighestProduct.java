package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class HighestProduct {
    public int maxp3(ArrayList<Integer> A) {
        if(A.size()<3){
            return 0;
        }
        Collections.sort(A);

        return Math.max(A.get(A.size()-1)*A.get(A.size()-2)*A.get(A.size()-3),A.get(A.size()-1)*A.get(0)*A.get(1));
    }
}
