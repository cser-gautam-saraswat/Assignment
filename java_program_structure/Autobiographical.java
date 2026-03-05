package edu.jecrc.sdt_java.java_program_structure;

public class Autobiographical {

    public boolean check(int num) {

        String str = String.valueOf(num);
        int length = str.length();
        int[] count = new int[length];

        for (int i = 0; i < length; i++) {
            int digit = str.charAt(i) - '0';
            if (digit < length) {
                count[digit]++;
            }
        }

        for (int i = 0; i < length; i++) {
            if (count[i] != (str.charAt(i) - '0')) {
                return false;
            }
        }

        return true;
    }
}