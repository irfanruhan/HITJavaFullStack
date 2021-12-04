package practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackHR {
	public static void main(String[] args) {
		System.out.println("Please enter the strings");
		Stack<Character> s = new Stack<Character>();
		Scanner scan = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		String temp;
		ArrayList<Boolean> b = new ArrayList<Boolean>();
		//int n = 0;
		while(scan.hasNext()) {
			temp = scan.nextLine();
			al.add(temp);
		}
		scan.close();
		for(String ss:al) {
			char cc[] = ss.toCharArray();
			for(char c:cc) {
				if(c == ')') {
					s.push(c);
					if(s.contains('(')) {
						s.pop();
						s.pop();
					}
				}
				else if(c == '}') {
					s.push(c);
					if(s.contains('{')) {
						s.pop();
						s.pop();
					}
				}
				else if(c == ']') {
					s.push(c);
					if(s.contains('[')) {
						s.pop();
						s.pop();
					}
				}
				else {
					s.push(c);
				}
			}
			if(s.isEmpty()) {
				b.add(true);
			}
			else {
				b.add(false);
			}
			s.removeAllElements();
		}
		//int j = 0;
		for(boolean bi:b) {
			//System.out.println(j + ": " + bi);
			System.out.println(bi);
			//j++;
		}
	}
}
