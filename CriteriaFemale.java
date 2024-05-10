import java.util.ArrayList;
import java.util.List;
/** A public class showing the list of female criteria met
 * @author David Nguyen
 * @version 1.0
 */
public class CriteriaFemale implements Criteria{
	/**Returns the list of people who meet the criteria for gender female
	 * This method is overridden here from class {@link Criteria}
	 * to implement female specific
	 * @see Criteria#meetCriteria(List)
	 * @param persons who is in the list being checked
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> femalePersons = new ArrayList<Person>();

		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}