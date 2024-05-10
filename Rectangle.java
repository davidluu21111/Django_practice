/** A public class implement the rectangle shape
 * @author David Nguyen
 * @since 1.0
 */
public class Rectangle implements Shape {
	/**Printing out the method of Rectangle
	 * This method is overridden here from class {@link Shape}
	 * to implement the rectangle specifically
	 * @see Shape#draw()
	 * 
	 */
	@Override
	public void draw(){
		System.out.println("Rectangle:draw()");
	}
}