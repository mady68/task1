package com.itmady;
import java.lang.Math;

import java.util.Scanner;

public class Kth {

    public static void main(String[] args) {
        // input K position//
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Kth position of sequence (0<=K<=2^63):");
        long k = in.nextLong();
        //if (k >= 0 && k <= Math.pow(2, 63))


            // modify K, because we begin count from 0//
            long Km = k + 1;

            int n = 0;  // start number of digits;
            long Sn = 0; // start summ of all digits;

            // check it out, when Summ of digits is bigger than K position//
            while (Sn < Km) {
                n = n + 1; // counter for number of digits;
                Sn = (Sn + 9 * n * (long) Math.pow(10, (n - 1)));

            }
            System.out.println("The Maximum boundary Summ: ");
            System.out.println(Sn);
            System.out.printf("The n boundary is : %d", n);
            System.out.println();
            //System.out.println(Sn - Km);
            long p = ((long) Math.pow(10, n) - 1 - (Sn - Km) / n);
            System.out.println("The number p, which has the Kth digit itself:");
            System.out.println(p);

            System.out.println("The remainder; when first position is 1:");  //for find out how much position we must get back//
            long r = (Sn - Km) % n;
            System.out.println(r);

            // find the the Kth digit inside the p number;
            long d;
            d = p;
            if (r > 0) {
                while (r > 0) {
                    d = d / 10;
                    r = r - 1;
                }
            }
            d = d % 10;

            System.out.println("The Kth position digit is:");
            System.out.println(d);

        }

    }





