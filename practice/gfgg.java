package practice;

//Java program to find minimum time
//to finish all jobs with given
//number of assignees

public class gfgg
{
 // Utility function to get
 // maximum element in job[0..n-1]
 static int getMax(int arr[], int n)
 {
 int result = arr[0];
 for (int i=1; i<n; i++)
     if (arr[i] > result)
         result = arr[i];
     return result;
 }
  
 // Returns true if it is possible to finish jobs[]
 // within given time 'time'
 static boolean isPossible(int time, int K,
                                 int job[], int n)
 {
     // cnt is count of current
     // assignees required for jobs
     int cnt = 1;
      
     // time assigned to current assignee
     int curr_time = 0;
  
     for (int i = 0; i < n;)
     {
         // If time assigned to current assignee
         // exceeds max, increment count of assignees.
         if (curr_time + job[i] > time) {
             curr_time = 0;
             cnt++;
         }
          
         // Else add time of job to current
         // time and move to next job.
         else
         {
             curr_time += job[i];
             i++;
         }
     }
  
     // Returns true if count
     // is smaller than k
     return (cnt <= K);
 }
  
 // Returns minimum time required to
 // finish given array of jobs
 // k --> number of assignees
 // T --> Time required by every assignee to finish 1 unit
 // m --> Number of jobs
 static int findMinTime(int K, int T[], int job[], int n)
 {
	 int comp[] = new int[T.length];
     for(int j=0;j<T.length;j++) {
    	// Set start and end for binary search
         // end provides an upper limit on time
         int end = 0, start = 0;
         for (int i = 0; i < n; ++i)
             end += job[i];
              
         // Initialize answer
         int ans = end;
      
         // Find the job that takes maximum time
         int job_max = getMax(job, n);
      
         // Do binary search for
         // minimum feasible time
         while (start <= end)
         {
             int mid = (start + end) / 2;
      
             // If it is possible to finish jobs in mid time
             if (mid >= job_max && isPossible(mid, K, job, n))
             {
                 // Update answer
                 ans = Math.min(ans, mid);
                  
                 end = mid - 1;
             }

             else
                 start = mid + 1;
         }
      
         comp[j] = ans * T[j];
     }
     int min = comp[0];
     for(int i:comp) {
    	 if(min<i) {
    		 min = i;
    	 }
     }
     return min;
 }
 // Driver program
 public static void main(String arg[])
 {
	 System.out.println("Welcome!");
     int job[] = {2, 3, 1, 2, 5, 8, 4, 3};
     int n = job.length;
     int k = 8; int[]T = {10, 20};
     System.out.println(findMinTime(k, T, job, n));
 }
}
