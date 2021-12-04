package practice;
import java.util.*;

public class MapsPracticeHR {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Map<String, Integer> m = new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			m.put(name, phone);
			
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(m.get(s)==null) {
				System.out.println("Not found");
			}
			else{
				System.out.println(s+"="+m.get(s));
			}
		}
	}
}
