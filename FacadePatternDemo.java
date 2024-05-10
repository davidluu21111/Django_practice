/** The public class to draw out the various types of shapes
 * @author David Nguyen
 * @version 1.8.0_311
 */

public class FacadePatternDemo{
	/**draw out Circle,Square,Rectangle
	 * @param args command on line
	 */
	public static void main (String [] args){
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}