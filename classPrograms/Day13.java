package classPrograms;

public class Day13 {
	public static void main(String[] args) {
		Bottle violetBottle=new Bottle(new Colour("violet"),new Liquid("Juice"));
		//violetBottle.colour=new Colour();
		
		Bottle blueBottle=new Bottle(new Colour("blue"),new Liquid("water"));
		//blueBottle.colour=new Colour();
		
		System.out.println(violetBottle.colour.colour);
		System.out.println(blueBottle.colour.colour);
		System.out.println(violetBottle.liquid.liquid);
		System.out.println(blueBottle.liquid.liquid);
	}
}

class Bottle{
	Colour colour;//instance variable
	Liquid liquid;
	Bottle(Colour colour,Liquid liquid){
		this.colour=colour;
		this.liquid = liquid;
	}
}
class Colour{
	String colour;
	Colour(String colour){
		this.colour=colour;
	}
}
class Liquid{
	String liquid;
	Liquid(String liquid){
		this.liquid=liquid;
	}
}
