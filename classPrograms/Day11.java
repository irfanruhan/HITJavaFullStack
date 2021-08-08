package classPrograms;

public class Day11 {
	public static void main(String[] args) {
		//Static fields can be directly accessed, you dont need to create a instance
		//of the class, because JVM instatiates all static fields and static methods.
		//Static fields/variables are shared by multiple instances of the class.
		
		TrainingRoom0.toilet="default toilet...";
		System.out.println(TrainingRoom0.toilet);
		
		TrainingRoom0 room1=new TrainingRoom0();
		room1.projector="sanyo";
		TrainingRoom0.toilet="western";
		
		TrainingRoom0 room2=new TrainingRoom0();
		//room2.projector="huwai";
		//room2.toilet="indian";
		
		System.out.println(room1.projector+":"+TrainingRoom0.toilet);
		System.out.println(room2.projector+":"+TrainingRoom0.toilet);		
	}
}
class TrainingRoom0{
	String projector;//instance variable
	static String toilet;//class variable..
}

