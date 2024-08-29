package org.kirich;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        boolean isInputPresent = true;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(isInputPresent) {
            try {
                String input = sc.nextLine();
                count++;
                System.out.println(count + " " + input);
            } catch (Exception e) {
                break;
            }
        }
    }
}
