/** A class will use ShapeFactory to get a Shapeobject
 * It will pass information to ShapeFactory to get the type of object it needs
 * @author David Nguyen
 * @since 1.0
 */
public class FactoryPatternDemo{
	/** main method
	 * @param args command on line
	 */
	public static void main (String[] args){
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		Shape1 shape1 = shapeFactory.getShape("CIRCLE");

		//call draw method of Circle
		shape1.draw();

		//get an object of Rectangle and call its draw method.
		Shape1 shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Rectangle
		shape2.draw();

		//get an object of Square and call its draw method.
		Shape1 shape3 = shapeFactory.getShape("SQUARE");

		// call draw method of Rectangle
		shape3.draw();
	}
	
}