/** A public class representing the name and gender of a person
 * @author David Nguyen
 * @version 2022/11/21
 */
public class Person{
	private String name;
	private String gender;
	

	public Person(String name, String gender){
		this.name = name;
		this.gender = gender;
		
	}
	/** 
	 * Return the name 
	 * @return the name 
	 */
	public String getName(){
		return name;
	}

	/** 
	 * Return the gender 
	 * @return the name gender
	 */
	public String getGender(){
		return gender;
	}

	
}