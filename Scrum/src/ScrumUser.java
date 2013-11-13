public class ScrumUser
{
	public static void main (String []args)
	{
		Organisation dcst_unigoa= Organisation.getInstance();
		Project ems= new Project("Event Management System");
		Team emsTeam= new Team();
		emsTeam.setProductOwner("Ravindra");
		emsTeam.setScrumMaster("Siddhi");
		emsTeam.setMember("Joslina");
		emsTeam.setMember("Monasha");
		emsTeam.setCustomer("Ramrao Wagh");
		dcst_unigoa.setProject(ems, emsTeam);
	}
}