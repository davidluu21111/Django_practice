import java.util.ArrayList;
import java.util.List;
/** Implementation of male and female class
 * @author David Nguyen
 * @version 2022/11/21
 */
public class CriteriaPatternDemo {
	/**main method
	 *@param args the command line arguments.
	 */
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert","Male" ));
		persons.add(new Person("John", "Male" ));
		persons.add(new Person("Laura", "Female"));
		persons.add(new Person("Diana", "Female"));
		persons.add(new Person("Mike", "Male"));
		persons.add(new Person("Bobby", "Male"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		
		
		
		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));
		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));
	}
	/** Printing the Person corresponding to their name and gender from the list
	 * @param persons who is in the list being checked
	 */
	public static void printPersons(List<Person> persons){
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " +
			person.getGender()    + " ]"); } } }