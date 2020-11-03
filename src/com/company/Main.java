package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] A={-7,-3,2,3,11};
        int[] result = new int[A.length];
        for (int i = 0; i <A.length ; i++) {
            result[i] = A[i] * A[i];
        }
        Arrays.sort(result);
        for (int i = 0; i <A.length ; i++) {
            System.out.println(result[i]);
        }

    }
}
