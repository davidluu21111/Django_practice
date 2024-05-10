/** A public class implement the circle shape
 * @author David Nguyen
 * @since 1.0
 */
public class Circle1 implements Shape1 {

	/**Printing out the method of Circle
	 * This method is overriden here from class {@link Shape1}
	 * to implement the circle specifically
	 * @see Shape1#draw()
	 * 
	 */
	@Override
	public void draw(){
		System.out.println("Inside Circle: draw() method.");
	}
}