public class Organisation
{
	Team team=new Team();
	private static Organisation singletonOrganisation = new Organisation( );
	private Organisation(){}
	public static Organisation getInstance()
	{
	 return singletonOrganisation;
	}
	Project orgProject;
	Team projTeam;
	public void setProject(Project ems, Team emsTeam)
	{
		orgProject=ems;
		projTeam=emsTeam;
	}
}