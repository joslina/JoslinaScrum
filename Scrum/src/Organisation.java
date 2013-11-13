public class Organisation
{
	 Project project=new Project();
	 
	 private static Organisation singletonOrganisation = new Organisation( );
	 private Organisation(){ }
	 public static Organisation getInstance()
	 {
		 return singletonOrganisation;
	 }
	 public void setProject(String ProjName)
	 {
		 project.title=ProjName;
	 }
	 public void createTeam(String TeamName)
	 {
		 
	 }
/*
	// File Name: SingletonDemo.java
	public class SingletonDemo {
	   public static void main(String[] args) {
	      Singleton tmp = Singleton.getInstance( );
	      tmp.demoMethod( );
	     */
}