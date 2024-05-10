/** This class presenting and implementing the various kind of shapes
 * such as : Circle,Square,Rectangle
 * @author David Nguyen	
 * @version 1.8.0_311
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	/**Constructor 
	 */
	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	/**Printing out the Circle Shape implementation*/
	public void drawCircle(){
		circle.draw();
	}
	/**Printing out the Rectangle Shape implementation*/
	public void drawRectangle(){
		rectangle.draw();
	}
	/**Printing out the Square Shape implementation*/
	public void drawSquare(){
		square.draw();
	}
}