public class Army {
//owais 1.0.1
	private String SoliderCountryName;
	protected Solider[] arrSolider;
	protected int SoliderCount;
	
	public Army(int size , String SoliderCountryName)
	{
		this.SoliderCountryName = SoliderCountryName;
		SoliderCount = 0;
		arrSolider = new Solider[size];
	}
	
	
	
	public int countSoliders(String r)
	{
		int Soliders = 0;
		for (int i = 0; i < SoliderCount; i++)
		{
			if (arrSolider[i].getRank().equals(r))
			{
				Soliders++;
			}
		}
		return Soliders;
	}
	
	public Solider getBravestSolider()
	{
		int maxAwards = 0;
		int index = 0;
		
		for (int i = 0; i < SoliderCount; i++)
		{
			if (arrSolider[i].getAwards() > maxAwards)
			{
				maxAwards = arrSolider[i].getAwards();
				index = i;
			}
		}
		return arrSolider[index];
	}
	
	public Solider[] getArchiveSoliders()
	{
		int index = 0;
		Solider[] arrSolider2 = new Solider[arrSolider.length];
		
		for (int i = 0; i < SoliderCount; i++)
		{
			if (arrSolider[i].getAwards() > 50)
			{
				arrSolider2[index] = arrSolider[i];
				index++;
			}
		}
		return arrSolider2;
	}
	
	public int splitSoliders(Solider[] highRank , Solider[] lowRank)
	{
		int index = 0;
		int index2 = 0;
		
		for (int i = 0; i < SoliderCount; i++)
		{
			if (arrSolider[i].getRank().equals("General") || arrSolider[i].getRank().equals("Colonel") || arrSolider[i].getRank().equals("Major"))
			{
				highRank[index] = arrSolider[i];
				index++;
			}
			else 
			{
				lowRank[index2] = arrSolider[i];
				index2++;
			}
		}
		return index;
	}

}
