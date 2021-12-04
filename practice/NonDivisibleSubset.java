package practice;
import java.util.*;

class Results {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     *  7 4
		19 10 12 10 24 25 22
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
    // Write your code here
    	int N = s.size();
    	Object[] a = s.toArray();
    	int r[] = new int[a.length];
    	int f[] = new int[k];
    	
    	for(int i=0;i<N;i++) {
    		r[i] = (int)a[i]%k;
    		//System.out.println(r[i]);
    		f[r[i]]++;
    	}
    	/*for(int j:f) {
    		System.out.println(j);
    	}*/
    	//Correction for even k's
    	if(k%2==0) {
    		f[k/2] = Math.min(f[k/2], 1);
    	}
    	
    	int res = Math.min(f[0], 1);
    	//System.out.println(res);
    	for(int l=1;l<=k/2;l++) {
    		//System.out.print(f[l] + " ");
    		res += Math.max(f[l], f[k-l]);
    		//System.out.println(res);
    	}
    	
    	return res;
    }

}

public class NonDivisibleSubset {
	public static void main(String[] args) {
		System.out.println("Please enter the inputs");
		int n;
		int k;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		List <Integer>al = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			al.add(scan.nextInt());
		}
		
		System.out.println(Results.nonDivisibleSubset(k, al));
	}
}
