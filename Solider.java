public class Solider {
	
	private int soliderId;
	private String name;
	private String rank;
	private int awards;

	public Solider(int soliderid , String name , String rank , int awards)
	{
		this.soliderId = soliderid;
		this.name = name;
		this.rank = rank;
		this.awards = awards;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSoliderId()
	{
		return soliderId;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public int getAwards()
	{
		return awards;
	}
	
	public void displaySoliderInfo()
	{
		 System.out.println("Id: " + getSoliderId());
		 System.out.println("Name: " + getName());
		 System.out.println("Rank: " + getRank());
		 System.out.println("Awards: " + getAwards());
	}
	
	

}
