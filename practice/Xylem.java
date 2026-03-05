package edu.jecrc.sdt_java.practice;

public class Xylem {

    public boolean check(int num) {

        int last = num % 10;
        int first = 0;
        int meanSum = 0;

        int temp = num / 10;

        while (temp > 9) {
            meanSum += temp % 10;
            temp /= 10; 
        }

        first = temp;

        return (first + last) == meanSum;
    }
}
