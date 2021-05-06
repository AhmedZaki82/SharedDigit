package com.company;

public class Main {

    public static void main(String[] args) {

        hasShredDigit(12, 12);
    }

    public static boolean hasShredDigit(int firstN, int secondN) {

        if ((firstN < 10 || firstN > 99) || (secondN < 10 || secondN < 99)) {

            return false;
        }

        int second = firstN % 10;
        int first = firstN / 10;

        int f = 0;
        int s = 0;


        while (secondN > 0) {

            f = secondN % 10;
            s = secondN / 10;
            secondN /= 10;

            if (second == f || second == s || first == f || first == s) {

                System.out.println("There is a shared digit.");


                return true;
            }

        }

        System.out.println("There is non.");

        return false;
    }
}
