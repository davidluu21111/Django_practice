import java.util.ArrayList;
import java.util.List;
/** A public class showing the list of male criteria met
 * @author David Nguyen
 * @version 1.0
 */
public class CriteriaMale implements Criteria{
	/**Returns the list of male people who meet the criteria for gender male
	 * This method is overriden here from class {@link Criteria}
	 * to implement male specific
	 * @see Criteria#meetCriteria(List)
	 * @param persons who is in the list being checked
	 */
	@Override
	
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> malePersons = new ArrayList<Person>();

		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}