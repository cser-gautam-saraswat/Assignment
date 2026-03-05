package edu.jecrc.sdt_java.java_program_structure;

public class Spy {

    public boolean check(int num) {

        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return sum == product;
    }
}