package practice;

import java.util.*;

class GEEKAndCoPrime{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long M = scan.nextLong();
		Solution ss = new Solution();
		System.out.println(ss.sum(N, M));
	}
}

//For Runtime Error Probs -> Implement Recursion
 


 /*                               // NON Iterative Solution
class Solution{
    long sum(long N, long M){
   		long s = (N<M)?M:N;
   		long l = 1;
   		long ans = -1;
   		if(N!=M) {
   			for(long i=1;i<=s;i++){
   		        if((N%i==0)&&(M%i==0)){
   		        l = i;
   		        //System.out.println(i);
   		        long q1 = N/i;
   		        long q2 = M/i;
   		        ans = (q1+q2);
   		        if(Solution.gcd(q1,q2)==1) {
   		        	//System.out.println(q1 + " "+q2+" "+ans);
   		        	return ans;
   		        }
   		    }
   		}
   		}
   		else{
   		       return 2; 
   		    }
   		return -1;
   		
    }
    
    static long gcd(long a, long b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }
}
*/




// Iterative Solution

/*class Solution{

    long sum(long N, long M){
   		long ans =0;
   		if((N%6==1 || N%6==-1)&&(M%6==1 || M%6==-1)) {
   			if(N==M) {
   				ans = 2;
   			}
   			else{
   				ans = N+M;
   			}
   			return ans;
   		}
   		
   		long s = (N>M)?M:N;
   		long i=1;
   		N=N/i;
   		M=M/i;
   		if(i<=s) {
   			i++;
   		}
   		sum(N,M);
   		
   		return -1;
    }
}
*/

//    Actual Solution

class Solution{
    long sum(long N, long M){
   		long g = Solution.gcd(N, M);
   		long q1 = N/g;
	    long q2 = M/g;
	    return q1+q2;
    }
    
    static long gcd(long a, long b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }
}


