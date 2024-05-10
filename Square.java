/** A public class implement the square shape
 * @author David Nguyen
 * @since 1.0
 */

public class Square implements Shape {
	/**Printing out the method of Square
	 * This method is overridden here from class {@link Shape}
	 * to implement the square specifically
	 * @see Shape#draw()
	 * 
	 */
	@Override
	public void draw(){
		System.out.println("Square:draw()");
	}
}