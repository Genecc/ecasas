import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;



public class AlumneTest extends TestCase{
	
	Alumne alumne1;
	
	@Before
	protected void setUp() throws Exception {
		alumne1 = new Alumne ("Enric", 21, 2017, 6, 5);
	}
	
	@Test
	public void esMajorEdat() {
		assertTrue("Es major d'edat", alumne1.esMajorEdat());
		assertFalse("No es major d'edat", alumne1.esMajorEdat());
	}
	
	@Test
	public void aprovaM5(){
		assertTrue("Esta aprobat", alumne1.aprovaM5(90));
		assertFalse("Esta suspes", alumne1.aprovaM5(70));
	}
	


}
