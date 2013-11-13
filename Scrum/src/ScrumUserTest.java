import org.junit.AfterClass;
import org.junit.Test;


public class ScrumUserTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}
	@Test
	public void testMain() {
	}
	public void testScrumUserOperation() throws Exception
	{
		Organisation dcst_unigoa= Organisation.getInstance();
		Project ems= new Project("Event Management System");
		Team emsTeam= new Team();
		Sprint projSprints = new Sprint();
		
		Story story1= new Story("As a customer", "I want to get the booking details", "So that I know the deatils about the event", 10, 9);
		story1.setTask("Set interface", 3);
		story1.setTask("Database connection", 2);
		story1.setTask("Business Logic", 4);
		Story story2= new Story("As a professional", "I want to get the details of the event", "So that I can come on time", 10, 8);
		story2.setTask("Set interface", 3);
		story2.setTask("Database connection", 2);
		Story story3= new Story("As a customer", "I want to select an affordable food package", "So that the expences are minimized", 5, 7);
		story3.setTask("Set interface", 1);
		story3.setTask("Database connection", 2);
		Story story4= new Story("As a customer", "I want to do the payment of the event", "", 10, 10);
		story4.setTask("Set interface", 3);
		story4.setTask("Database connection", 2);
		Story story5= new Story("As an event manager", "I want to keep track of yearly statistics", "", 7, 4);
		story5.setTask("Set interface", 3);
		story5.setTask("Database connection", 2);
		Sprint.setSprint(10);//10 days
		projSprints.addStory(story1);
		projSprints.addStory(story2);
		projSprints.addStory(story3);
		projSprints.addStory(story4);
		projSprints.addStory(story5);
		emsTeam.setProductOwner("Ravindra");
		emsTeam.setScrumMaster("Siddhi");
		emsTeam.setMember("Joslina");
		emsTeam.setMember("Monasha");
		emsTeam.setCustomer("Ramrao Wagh");
		emsTeam.setVelocity(50);
		dcst_unigoa.setProject(ems, emsTeam);
	}
}
