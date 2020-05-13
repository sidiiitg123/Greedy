package com.company;

import java.util.List;

public class GasStation {


    public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
        if(A==null|| B==null||A.size()==0||B.size()==0||A.size()!=B.size()){
            return -1;
        }
        int subremain=0,total=0,startindex=0;
        for(int i=0;i<A.size();i++){
          int remain=  A.get(i)-B.get(i);
          if(subremain>=0){
              subremain+=remain;
          }else{
              subremain=remain;
              startindex=i;
          }
          total+=remain;
        }
        if(total>=0){
            return startindex;
        }
        return -1;
    }
}
