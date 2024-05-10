/** A public class implement the circle shape
 * @author David Nguyen
 * @since 1.0
 */
public class Circle implements Shape {
	/**Printing out the method of Circle
	 * This method is overriden here from class {@link Shape}
	 * to implement the circle specifically
	 * @see Shape#draw()
	 * 
	 */
	@Override
	public void draw(){
		System.out.println("Circle:draw()");
	}
}