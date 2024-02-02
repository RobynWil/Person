import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{
	Person R;
	Person J;
	Person M;
	Person Y;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		R = new Person("Romeo", "Mon", 15);
		J = new Person("Juliet", "Cap", 13);
		M = new Person("Count", "Dukoo", 54);
		Y = new Person("Yo", "Da", 973);
	}

	@Test
	void testToString()
	{
		assertEquals("Person: Romeo Mon, 15", R.toString());
		assertEquals("Person: Juliet Cap, 13", J.toString());
	}

	
	@Test
	void testMakePerson()
	{
		assertThrows(UnderAgeException.class, 
				()-> {
					R.makePerson(J);
				});
		assertThrows(UnderAgeException.class, 
				()-> {
					M.makePerson(J);
				});
		
		
		Person child;
		try
		{
			child = M.makePerson(Y);
			assertEquals(M.getfName(), child.getfName());
			assertEquals(Y.getlName(), child.getlName());
			assertEquals(0, child.getAge());
			
		} catch (UnderAgeException e)
		{
			e.printStackTrace();
			fail("Threw exception");
		}
		
		
		
	}
}
