package practice;
import java.util.Arrays;
public class AS {
    public static void main(String args[]){
    	int as[][] = new int[3][3];
        //Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(args[0]);
        int k =1;
        for(int p = 0; p<N;p++) {
        	for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                	if(i==1 && j==1) {
                    	as[i][j] = 0;
                    	as[i][j+1]  = Integer.parseInt(args[k]);
                    	//System.out.print(as[i][j] + " ");
                    	//System.out.print("**"+as[i][j] + " " + as[i][j+1]+"**");
                    	j+=1;
                    }
                	/*else if(i==1 && j==2){
                		as[i][j+1] = Integer.parseInt(args[k]);
                	}*/
                	else {
                		as[i][j] = Integer.parseInt(args[k]);
                	}
                	//System.out.print(i+","+j+" ");
                    //System.out.print(as[i][j] + " ");
                	//System.out.print(Integer.parseInt(args[k]));
                	if(k<23)k++;
                }
                //System.out.print(as[i][j] + " ");
                //System.out.println();
            }
        	//System.out.println();
        	
        	int APs[] = new int[101];
        	AS w = new AS();
        	
        	for(int i=0;i<=100;i++) {
        	as[1][1] = i;
        	APs[i] = w.checkAP(as);
        	}
        	
        	//as[1][1] = 5;
        	//int AP = w.checkAP(as);
        	int maxAP = w.largest(APs);
        	//System.out.println("Number of AP's are:"+maxAP);
        	//System.out.println();
        	//System.out.println(Arrays.toString(APs));
        	//System.out.println(as[1][1]);
        	System.out.printf("Case #%d: %d",N,maxAP);
            System.out.println(); 

    }
}

    public int largest(int arr[])
    {
    	int max=arr[0];
        // Traverse array elements from second and
        // compare every element with current max  
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
       
        return max;
    }

	
public int checkAP(int as[][]){
	
	int AP = 0;    
	for(int i=0;i<3;i++) {
		for(int j=0;j<1;j++) {
			if(as[i][j] - as[i][j+1] == as[i][j+1] - as[i][j+2]) {
				//System.out.println(as[i][j] +" "+ as[i][j+1] +" "+ as[i][j+1] +" "+ as[i][j+2]);
				AP+=1;
			}
		}
	}
	
	int p=0,q = 0;
	if(as[p][q] - as[p+1][q+1] == as[p+1][q+1] - as[p+2][q+2]) {
				AP+=1;
				//System.out.println(as[p][q] +" "+ as[p+1][q+1] +" "+ as[p+1][q+1]+" "+as[p+2][q+2]);
	}
		
	if(as[2][2] - as[1][1] == as[1][1] - as[0][0]) {
		AP+=1;
		//System.out.println(as[2][2] +" "+ as[1][1] +" "+ as[1][1]+" "+as[0][2]);
	}
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<1;j++) {
			if(as[j][i] - as[j+1][i] == as[j+1][i] - as[j+2][i]) {
				AP+=1;
				//System.out.println(as[j][i] +" "+ as[j+1][i] +" "+ as[j+1][i] +" "+ as[j+2][i]);
			}
		}
	}
	
	/*for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(as[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println((int)as[1][0]);
	*/
	
	return AP;
}



}
