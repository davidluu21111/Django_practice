
/** this public class to represent the types of shapes
 * @author David Nguyen
 * @since 1.0
 */
public class ShapeFactory{
	
	/**Return the object of type shape 
	 * @return the object of type shape
	 * @param shapeType is a type of shape 
	 *@return null if shapeType is null
	 */
	public Shape1 getShape(String shapeType){
		if(shapeType==null){
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle1();
		}
		else if (shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle1();
		}
		else if (shapeType.equalsIgnoreCase("SQUARE")){
			return new Square1();
		}
		return null;
	}
}