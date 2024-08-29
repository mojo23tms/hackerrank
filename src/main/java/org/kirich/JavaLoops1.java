package org.kirich;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h4>Task</h4>
 * <p>Given an integer, <b><i>N</i></b> , print its first <b>10</b> multiples. Each multiple <b><i>N</i></b> (where <b><i>1 <= i <= 10</i></b>) should be printed on a new line in the form: <code>N x i = result</code></p>
 *
 * Input Format
 *
 * A single integer, <b><i>N</i></b>.
 *
 * <h4>Constraints</h4>
 * <ul>
 *     <li>
 *         <p><b><i>1 <= i <= 10</i></b></p>
 *     </li>
 * </ul>
 *
 * <h4>Output Format</h4>
 *
 * Print <b>10</b> lines of output; each line <b><i>i</i></b> (where <b><i>1 <= i <= 10</i></b>) contains the <b><i>result</i></b> of <b><i>N * i</i></b> in the form:
 * <p><code>N x i = result.</code></p>
 *
 * <h4>Sample Input</h4>
 * {@snippet :
 * 2
 * }
 * <h4>Sample Output</h4>
 *
 * {@snippet :
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 * 2 x 4 = 8
 * 2 x 5 = 10
 * 2 x 6 = 12
 * 2 x 7 = 14
 * 2 x 8 = 16
 * 2 x 9 = 18
 * 2 x 10 = 20}
 */

public class JavaLoops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }

        bufferedReader.close();
    }
}
