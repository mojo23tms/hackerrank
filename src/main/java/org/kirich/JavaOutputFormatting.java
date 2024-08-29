package org.kirich;

import java.util.Scanner;

/**
 * <h3>Sample Input:</h3>
 * {@snippet :
 * java 100
 * cpp 65
 * python 50
 * }
 * <p>
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of <b>10</b> alphabetic characters, and each integer will be in the inclusive range from <b>0</b> to <b>999</b>.</p>
 *
 * <h3>Output Format</h3>
 * <p>In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly <b>15</b> characters.
 * The second column contains the integer, expressed in exactly <b>3</b> digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.</p>
 * {@snippet :
 * ================================
 * java           100
 * cpp            065
 * python         050
 * ================================
 *  }
 */

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
            //Complete this line
        }
        System.out.println("================================");

    }
}