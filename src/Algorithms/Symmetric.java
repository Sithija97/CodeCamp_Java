package Algorithms;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.ir.CallNode;

import java.util.Arrays;

public class Symmetric {
    public static void MyFunction() {
         /*      function that takes two or more arrays and returns an array of
        the symmetric difference(△ or ⊕) of the provided arrays.    */

        int A[] = {1, 2, 3};
        int B[] = {2, 3, 4};

        int sizeA, sizeB;

        //getting sizes
        sizeA = A.length;
        sizeB = B.length;

        //created a new array with sum of sizes
        int Sym[] = new int[sizeA + sizeB];

        //copying arrays
        System.arraycopy(A, 0, Sym, 0, sizeA);
        System.arraycopy(B, 0, Sym, sizeA, sizeB);

        System.out.println("1st array size: " + sizeA + " & 2nd array size :" + sizeB);
        System.out.println("Sym size " + Sym.length);
        System.out.println("Sym array is :");

        //prints the resultant array
        System.out.println(Arrays.toString(Sym));

        //getting numbers that are in both arrays
        for (int i = 0; i <= Sym.length-1; i++) {
            for (int j = i +i; j <= Sym.length-1; j++) {
                if (Sym[i] != Sym[j])
                    System.out.print(Sym[j]+" ");
            }

        }
    }
}

