package classPrograms;

public class GeneralizationDemo2 {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		brush.paint=new RedPaint();
		brush.paint=new BluePaint();
		//Paint paint=new Paint();
	}
}
class PaintBrush{
	Paint paint;
}
//Superclass paint is a common nouns and is abstract in nature
//abstract class objects cannot be created
//but still abstract classes can have constructors
//Creation of constructors for superclass is compulsory
abstract class Paint{
	public Paint() {
		System.out.println("Paint class cons called.....");
	}
}
class RedPaint extends Paint{
	public RedPaint() {
		System.out.println("red paint construcor called...");
	}
}
class BluePaint extends Paint{
	public BluePaint() {
		System.out.println("blue paint constructor called...");
	}
}
