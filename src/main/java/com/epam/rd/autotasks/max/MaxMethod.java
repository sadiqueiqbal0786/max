package com.epam.rd.autotasks.max;
import java.util.*;

public class MaxMethod {
    public static int max(int[] values) {
      /*  Scanner s=new Scanner(System.in);

        for(int i=0;i<values.length;i++){
            if(values.length==1){
                return values[i];
            }
            int m=values[0];
            if (values[i]<Integer.MIN_VALUE ){
                return Integer.MIN_VALUE;
            } else if (values[i]>Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if(m<=values[i]){
                m=values[i];
                return m;
            }

        }*/
         int max_value=0;//jugaad
        Arrays.sort(values);
        max_value=values[values.length-1];
        return  max_value;
      // throw new UnsupportedOperationException();

    }
}
