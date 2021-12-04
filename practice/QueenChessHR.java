package practice;
import java.util.*;
public class QueenChessHR {
	public static void main(String[] args) {
		int n = 5;
		int k = 3;
		int r_q = 4;
		int c_q = 3; 
		ArrayList<List<Integer> > obstacles = new ArrayList<List<Integer> >();
		List<Integer> list1= new ArrayList<Integer>();
    list1.add(5);
    list1.add(5);
	obstacles.add(list1);
	
	List<Integer> list2= new ArrayList<Integer>();
    list2.add(4);
    list2.add(2);
	obstacles.add(list2);
	
	List<Integer> list3= new ArrayList<Integer>();
    list3.add(2);
    list3.add(3);
	obstacles.add(list3);
	
	int[][] ob = new int[k][2];
	int it=0;
	int l =0;
	for(List<Integer> list:obstacles) {
		for(int i:list) {
			//System.out.println(it + " "+ l);
			ob[it][l] = i;
			l++;
		}
		l=0;
		it++;
	}
	
	int max_r = n;
	int max_c = n;
	int min_r = 1;
	int min_c = 1;
	
	int pr = Math.abs((max_r - r_q));
	int nr = Math.abs((min_r - r_q));
	int pc = Math.abs((max_c - c_q));
	int nc = Math.abs((min_c - c_q));
	
	//Diagonal Sizes
	int dul = Math.min(pr, nc);//Diagonal Upper Left -> Positive Negative
	int dur = Math.min(pr, pc);//Diagonal Upper Left -> Positive Negative
	int dll = Math.min(nr, nc);//Diagonal Upper Left -> Positive Negative
	int dlr = Math.min(nr, pc);//Diagonal Upper Left -> Positive Negative
	
	System.out.println(dul);
	System.out.println(dur);
	System.out.println(dll);
	System.out.println(dlr);
	
	int [][]adul = new int[dul][2];
	int [][]adur = new int[dur][2];
	int [][]adll = new int[dll][2];
	int [][]adlr = new int[dlr][2];
	
	
	int size = dul+dur+dll+dlr+pr+nr+pc+nc;
	System.out.println("Total Size "+ size);
	
	int i1  = 1;
	for(int i=0;i<adul.length;i++) {
		adul[i][0] = r_q;
		adul[i][1] = c_q;
		adul[i][0] += i1;
		adul[i][1] -= i1;
		i1++;
		//System.out.println(adul[i][0] + " " +adul[i][1]);
	}
	int i2 = 1;
	for(int i=0;i<adur.length;i++) {
		adur[i][0] = r_q;
		adur[i][1] = c_q;
		adur[i][0] += i2;
		adur[i][1] += i2;
		i2++;
		//System.out.println(adur[i][0] + " " +adur[i][1]);
	}
	int i3 = 1;
	for(int i=0;i<adll.length;i++) {
		adll[i][0] = r_q;
		adll[i][1] = c_q;
		adll[i][0] -= i3;
		adll[i][1] -= i3;
		i3++;
		//System.out.println(adll[i][0] + " " +adll[i][1]);
	}
	int i4 = 1;
	for(int i=0;i<adlr.length;i++) {
		adlr[i][0] = r_q;
		adlr[i][1] = c_q;
		adlr[i][0] -= i4;
		adlr[i][1] += i4;
		i4++;
		//System.out.println(adlr[i][0] + " " +adlr[i][1]);
	}
	
	
	for(int i=0;i<ob.length;i++) {
		int r = ob[i][0];
		int c = ob[i][1];
		if(r>r_q && c>c_q) {
			//UR
			size = size - (dur - Math.abs(r - r_q)+1);
			System.out.println((dur - Math.abs(r - r_q)+1));
		}
		else if(r>r_q && c<c_q) {
			//UL
			size = size - (dul - Math.abs(r - r_q)+1);
			System.out.println((dul - Math.abs(r - r_q)+1));
		}
		else if(r<r_q && c<c_q) {
			//LL
			size = size - (dll - Math.abs(r - r_q)+1);
			System.out.println((dll - Math.abs(r - r_q)+1));
		}
		else if(r<r_q && c>c_q) {
			//LR
			size = size - (dlr - Math.abs(r - r_q)+1);
			System.out.println((dlr - Math.abs(r - r_q)+1));
		}
		else if(r==4 && c>=c_q) {
			//UP
			size = size - (pc - Math.abs(r - r_q)+1);
			System.out.println((pc - Math.abs(r - r_q)+1));
		}
		else if(r==4 && c<=c_q) {
			//DOWN
			size = size - (nc - Math.abs(r - r_q)+1);
			System.out.println((nc - Math.abs(r - r_q)+1));
		}
		else if(c==4 && r<=r_q) {
			//LEFT
			size = size - (nr - Math.abs(r - r_q)+1);
			System.out.println((nr - Math.abs(r - r_q)+1));
		}
		else if(c==4 && r>=r_q) {
			//RIGHT
			size = size - (pr - Math.abs(r - r_q)+1);
			System.out.println((pr - Math.abs(r - r_q)+1));
		}
		
	}
	
	System.out.println("The total number of squares are " + size);
	
	}
}
