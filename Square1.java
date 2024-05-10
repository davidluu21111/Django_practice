/** A public class implement the square shape
 * @author David Nguyen
 * @since 1.0
 */
public class Square1 implements Shape1 {
	/**Printing out the method of Square
	 * This method is overridden here from class {@link Shape1}
	 * to implement the square specifically
	 * @see Shape1#draw()
	 * 
	 */
	@Override
	public void draw(){
		System.out.println("Inside Square: draw() method.");
	}
}