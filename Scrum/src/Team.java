import java.util.*;
public class Team
{
	public String ProductOwner, ScrumMaster, Customer;
	int velocity;
	List<String> Members = new ArrayList<String>();
	public void setProductOwner(String ProductOwner)
	{
		this.ProductOwner=ProductOwner;
	}
	public void setScrumMaster(String ScrumMaster)
	{
		this.ScrumMaster=ScrumMaster;
	}
	public void setMember(String Member)
	{
		Members.add(Member);
	}
	//System.out.println(Members);
	public void setCustomer(String Customer)
	{
		this.Customer=Customer;
	}
	public void setVelocity(int velocity)
	{
		this.velocity=velocity;
	}
}
