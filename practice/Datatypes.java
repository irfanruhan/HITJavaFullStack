package practice;

public class Datatypes {
	public static void main(String[] args) {
		int t = Integer.parseInt(args[0]);
		for(int i=0;i<t;i++) {
			int k=1;
			try {
				long x = Long.parseLong(args[k]);
				System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                long min = -9223372036854775808L;
                long max = 9223372036854775807L;
                if(x>=min  && x<=max)System.out.println("* long");
			}
			catch(Exception e) {
				long x = Long.parseLong(args[k]);
				System.out.println(x + "can't be fitted anywhere.");
			}
			k++;
		}
	}
}
