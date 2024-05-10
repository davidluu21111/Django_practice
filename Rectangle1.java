/** A public class implement the square shape
 * @author David Nguyen
 * @since 1.0
 */
public class Rectangle1 implements Shape1 {
	/**Printing out the method of Rectangle
	 * This method is overriden here from class {@link Shape1}
	 * to implement the rectangle specifically
	 * @see Shape1#draw()
	 * 
	 */
	@Override
	public void draw(){
		System.out.println("Inside Rectangle: draw() method.");
	}
}