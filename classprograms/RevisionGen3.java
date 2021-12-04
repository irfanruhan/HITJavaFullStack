package classprograms;
//code reusability(Commonly taught concept in college)
public class RevisionGen3 {
	public static void main(String[] args) {
		B bObj=new B();
		System.out.println("B obj...:"+bObj.i);
		bObj.met();
		
		((A)new B()).met();
		//System.out.println("A obj...:"+aObj.i);
		//aObj.met();
		
		C cObj=new C();
		System.out.println("C obj...:"+cObj.i);
		cObj.met();
	}
}
class A{
	public int i=10;//private variables are not available outside the class
	public void met() {
		System.out.println(" A class method....");
	}
}
class B extends A{
	int i = 20;
	@Override
	public void met() {
		// TODO Auto-generated method stub
		System.out.println(" B class method....");
	}
}
class C extends A{
	
}