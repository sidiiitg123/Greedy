package com.company;

import java.util.ArrayList;

public class Bulbs {
    public int bulbs(ArrayList<Integer> A) {
        int state = 0;
        int count = 0;
        for(int i=0; i<A.size(); i++){
            if(state == A.get(i)){
                count++;
                state = 1 - state;
            }
        }

        return count;
    }
}
