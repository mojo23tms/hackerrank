package org.kirich;

import java.util.Scanner;

/**
 * <p>We use the integers <i><b>a,b</b></i> and <i><b>n</b></i> to create the following series:</p>
 * <code>(a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ..., (a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b)</code>
 *
 * <p>You are given <b><i>q</i></b> queries in the form of <b><i>a, b</i></b> and <b><i>n</i></b>.
 * For each query, print the series corresponding to the given <b><i>a, b</i></b> and <b><i>n</i></b> values as a single line of <b><i>n</i></b> space-separated integers.</p>
 * <h4>Input Format</h4>
 *
 * <p>The first line contains an integer, , denoting the number of queries.
 * Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
 * </p>
 *
 * <h4>Constraints</h4>
 * <ul>
 *     <li><b>0 <= <i>q</i> <= 500</b></li>
 *     <li><b>0 <= <i>a,b</i> <= 50</b></li>
 *     <li><b>1 <= <i>n</i> <= 15</b></li>
 * </ul>
 *
 * <h4>Output Format</h4>
 *
 * <p>For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.</p>
 *
 * <h4>Sample Input</h4>
 * <p>
 * {@snippet :
 *  2
 *  0 2 10
 *  5 3 5}
 * Sample Output
 * <p>
 * {@snippet :
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98}
 *
 * <h3>Explanation</h3>
 * <p>
 * We have two queries:
 * <p>
 * We use , , and  to produce some series :
 * <p>
 * ... and so on.
 * <p>
 * Once we hit , we print the first ten terms as a single line of space-separated integers.
 * <p>
 * We use , , and  to produce some series :
 * <p>
 * We then print each element of our series as a single line of space-separated values
 */
public class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a, b, n;

        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();

            int init = a + (int) Math.pow(2, 0) * b;
            int curr;
            int prev = 0;
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    curr = init;
                } else {
                    curr = (int) Math.pow(2, j) * b;
                }
                int result = curr + prev;
                System.out.print(result + " ");
                prev = result;
            }
            System.out.println();
        }
        in.close();
    }
}
