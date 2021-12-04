package practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class javaregex {
	public static void main(String[] args){
		System.out.println("Please enter the IP Addresses to be validated");
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
	/*
	 *        [01]?\\d{1,2}  -> for 0 to 199
	 *        2[0-4]\\d      -> for 200 to 249
	 *        25[0-5]        -> for 250 to 255
	 */
	String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern = num+"."+num+"."+num+"."+num;
}