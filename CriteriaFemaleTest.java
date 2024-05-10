import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CriteriaFemaleTest {
	public CriteriaFemale female= new CriteriaFemale();
	@Test
	void testmeetCriteria() {
		List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("David", "Male"));
        persons.add(new Person("Cathy", "female"));
        persons.add(new Person("vathy", "female"));

        List<Person> femaleChosen = female.meetCriteria(persons);
        
        assertEquals(2, femaleChosen.size());
        assertEquals(1, femaleChosen.size());
        assertEquals(3, femaleChosen.size());
	}

}

