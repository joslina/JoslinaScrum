public class ScrumUser
{
	public static void main (String []args)
	{
		Organisation dcst_unigoa= Organisation.getInstance();
		Project ems= new Project("Event Management System");
		Team emsTeam= new Team();
		Sprint projSprints = new Sprint();
		Story newStory= new Story("As a customer", "I want to get the booking details", "So that I know the deatils about the event", 10, 9);
		Sprint.setSprint(10);//10 days, 5 sprints
		projSprints.addStory(newStory);
		emsTeam.setProductOwner("Ravindra");
		emsTeam.setScrumMaster("Siddhi");
		emsTeam.setMember("Joslina");
		emsTeam.setMember("Monasha");
		emsTeam.setCustomer("Ramrao Wagh");
		dcst_unigoa.setProject(ems, emsTeam);
	}
}