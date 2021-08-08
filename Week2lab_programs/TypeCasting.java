package lab_programs;

public class TypeCasting {
	public static void main(String[] args) {
		byte b=10;
		int i=b;// will accept - automatic type promotion
		//byte c=i; will not accept - because lower type cannot be put in higher
		byte d=(byte)i;
		byte x=10;
		byte y=20;
		//byte sum=x*y; product of 2 bytes results in a sum
	}
}
