package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static BigInteger factorial(int n){
        BigInteger f = BigInteger.ONE;
        for(int i=n;i>=1;i--) {
        	f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    
    public static void extraLongFactorials(int n) {
    // Write your code here
    System.out.println(factorial(n));
    }

}

public class Bigfactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}