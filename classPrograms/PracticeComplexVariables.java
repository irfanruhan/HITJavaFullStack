package classPrograms;

public class PracticeComplexVariables {
		public static void main(String[] args) {
			
			//Human.initialization(1000);
			
			Humane shoiab=new Humane("aaa");//this is at object level
			Humane shoiab2=new Humane(100000);//this is at object level
			//Humane.initialization(100);//this is at class level
			//shoiab.business();
			shoiab2.business();
		}
	}
	class Humane{
		//A constructor is smillar to a method, but the name should be class name with return or void
		//this constructor is called when the object of Human class is created..
		static int honey;
		Humane(){
			
		}
		Humane(int honey){
			Humane.honey=honey;
			System.out.println("human cons called...");
		}
		Humane(String s){
			
		}
		static void initialization(int honey) {
			Humane.honey=honey;
			System.out.println("initialization code called...");
		}
		
		public void business() {
			System.out.println("honey honey honey...:"+Humane.honey);
		}
	}
	

