import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class ScrumUserTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}
	@Test
	public void testMain() {
		//fail("Not yet implemented");
	}
	public void testScrumUserOperation() throws Exception
	{
		Organisation dcst_unigoa= Organisation.getInstance();
		Project ems= new Project("Event Management System");
		Team emsTeam= new Team();
		Sprint projSprints = new Sprint();
		Story newStory= new Story("As a customer", "I want to get the booking details", "So that I know the deatils about the event", 10, 9);
		Sprint.setSprint(10);//10 days
		projSprints.addStory(newStory);
		emsTeam.setProductOwner("Ravindra");
		emsTeam.setScrumMaster("Siddhi");
		emsTeam.setMember("Joslina");
		emsTeam.setMember("Monasha");
		emsTeam.setCustomer("Ramrao Wagh");
		emsTeam.setVelocity(50);
		dcst_unigoa.setProject(ems, emsTeam);
		}
}
