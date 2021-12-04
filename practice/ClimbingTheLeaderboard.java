package practice;

import java.util.*;
//Set<String> uniqueGas = new HashSet<String>(gasList);
public class ClimbingTheLeaderboard {
	
	public static void rankplayer(List<Integer>scores,int[]player) {
		for(int i:player) {
			//System.out.println(i);
			int sp = i;
			int bigger = i;
			int smaller = i;
			//System.out.println(scores.toString());
			for(int j:scores) {
				//System.out.println(j);
				if(sp<j) {
					bigger = j;
				}
				int ssi = scores.indexOf(j);
				int lower = ssi;
				if(lower>1) {
					lower = ssi-1;
				}
				if(sp>j && sp<scores.get(lower)) {
					smaller = j;
				}
			}
			int bi = scores.indexOf(bigger);
			int si = scores.indexOf(smaller);
			if(bi == -1) {
				scores.add(0, i);
			}
			if(si == -1 && bi!=-1) {
				scores.add(i);
			}
			if(bi>-1 && si>-1) {
				scores.add(si, i);
			}
			//System.out.println("For the score "+ i + " "+bi + " "+ si);
			//System.out.println(scores.toString());
			/*Set<Integer> uniques = new HashSet<Integer>(scores);
			Integer u[] = uniques.toArray(new Integer[uniques.size()]);
			int k = 0;
			for(int a=0;a<u.length;a++) {
				System.out.println(u[a]);
				if(player[k] == u[a]) {
					System.out.println(a);
				}
				if(k<u.length)k++;
			}
			*/
			//System.out.println(scores.toString());
			Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
			int count=0;
			for(int p:scores) {
				for(int q:scores) {
					if(p==q) {
						count+=1;
					}
				}
				//System.out.println(p + ","+count);
				if(count>=2) {
					hm.put(p,count);
				}
				count = 0;
			}
			int rankminus = 0;
			 for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
		          int n =  entry.getKey();
		          int c = entry.getValue();
		          //System.out.println("Number and counts are"+n  + " " + c);
		          if(i<n) {
		        	  rankminus += (c/c);
		          }
		    }
			 System.out.println(scores.toString());
			 if(hm.containsKey(i)) {
				 System.out.println("Rankminus: "+rankminus);
				 System.out.println(scores.indexOf(i)+1-rankminus);
			 }
			 else {
				 System.out.println("Rankminus: "+rankminus);
				 System.out.println(scores.indexOf(i)+1-rankminus);
			 }
			 
			int r = scores.indexOf(i);
			scores.remove(r);
		
	}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the ranked and scores");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		List <Integer> scores = new ArrayList<Integer>();
		for(int i=0;i<s;i++) {
			scores.add(scan.nextInt());
		}
		int p = scan.nextInt();
		int player[] = new int[p];
		for(int i=0;i<p;i++) {
			player[i] = scan.nextInt();
			//System.out.println(i);
		}
		rankplayer(scores,player);
	}
}
