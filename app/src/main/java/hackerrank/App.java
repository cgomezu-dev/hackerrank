/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hackerrank;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) throws IOException  {
        Scanner scanner =  new Scanner(Paths.get("input.txt"));
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();

            try {
                Pattern.compile(s);
                System.out.print("Valid");
            } catch (Exception e) {
                System.out.print("Invalid");
            }

            if (i != n - 1) {
                System.out.println();
            }
        }
    }

}