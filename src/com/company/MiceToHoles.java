package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class MiceToHoles {

    public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
        int max=Integer.MIN_VALUE;

        Collections.sort(A);
        Collections.sort(B);

        for(int i=0;i<A.size();i++){
            max=Math.max(max,Math.abs(A.get(i)-B.get(i)));
        }
        return max;
    }
}
