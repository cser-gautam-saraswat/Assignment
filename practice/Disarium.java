package edu.jecrc.sdt_java.practice;

public class Disarium {

    public boolean check(int num) {

        int temp = num;
        int length = String.valueOf(num).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            length--;
            temp /= 10;
        }

        return sum == num;
    }
}
