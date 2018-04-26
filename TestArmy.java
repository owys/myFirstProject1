public class TestArmy {
	public static void main(String[]args)
	{
		Army A1 = new Army(5 , "SaudiArabia");
		
		Solider s1 = new Solider(1 , "K" , "General" , 53);
		Solider s2 = new Solider(2 , "D" , "Colonel" , 76);
		A1.addSolider(s1);
		A1.addSolider(s2);
		
		
			A1.getBravestSolider().displaySoliderInfo();
			System.out.println("--------------------------");
			System.out.println(A1.countSoliders("General"));
			System.out.println("--------------------------");
			System.out.println(A1.splitSoliders(A1.arrSolider, A1.arrSolider));
			
			
			
			
		
		
		
		
	}
}
