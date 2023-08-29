class FastrackTester{

        public static void main(String args[]){
			
			Fastrack reference = new Fastrack();
			reference.fastrackID=1;
			reference.material="Silicon";
			reference.color="Black";
			reference.warranty=1;
			reference.size=2;
			reference.type="Smart Watch";
			
			reference.targettingGrowth();
			System.out.println("Fastrack ID is  " +reference.fastrackID);
			System.out.println(" Material Used is  " + reference.material);
			System.out.println("Color is  " + reference.color);
			System.out.println("Warranty is  " + reference.warranty);
			System.out.println("Dimension is   " + reference.size);
			System.out.println("Type Of Material is  " + reference.type);
			
		    System.out.println("------------------------------------------------------");
			
			Fastrack reference1= new Fastrack();
			reference1.fastrackID=2;
			reference1.material="Stainless";
			reference1.color="Grey";
			reference1.warranty=2;
			reference1.size=3;
			reference1.type="Digital Watch";
			
			reference1.targettingGrowth();
			System.out.println("Fastrack ID is  " +reference1.fastrackID);
			System.out.println(" Material Used is  " + reference1.material);
			System.out.println("Color is  " + reference1.color);
			System.out.println("Warranty is  " + reference1.warranty);
			System.out.println("Dimension is   " + reference1.size);
			System.out.println("Type Of Material is  " + reference1.type);
			
		    System.out.println("------------------------------------------------------");
			
			Fastrack reference2 = new Fastrack();
			reference2.fastrackID=3;
			reference2.material="Polister";
			reference2.color="Blue";
			reference2.warranty=2;
			reference2.size=15;
			reference2.type="Bag";
			
			reference2.targettingGrowth();
			System.out.println("Fastrack ID is  " +reference2.fastrackID);
			System.out.println(" Material Used is  " + reference2.material);
			System.out.println("Color is  " + reference2.color);
			System.out.println("Warranty is  " + reference2.warranty);
			System.out.println("Dimension is   " + reference2.size);
			System.out.println("Type Of Material is  " + reference2.type);
			
		    System.out.println("------------------------------------------------------");
			
			Fastrack reference3 = new Fastrack();
			reference3.fastrackID=4;
			reference3.material="Solid";
			reference3.color="White";
			reference3.warranty=1;
			reference3.size=30;
			reference3.type="Ear Buds";
			
			reference3.targettingGrowth();
			System.out.println("Fastrack ID is  " +reference3.fastrackID);
			System.out.println(" Material Used is  " + reference3.material);
			System.out.println("Color is  " + reference3.color);
			System.out.println("Warranty is  " + reference3.warranty);
			System.out.println("Dimension is   " + reference3.size);
			System.out.println("Type Of Material is  " + reference3.type);
			
		    System.out.println("------------------------------------------------------");
			
			Fastrack reference4 = new Fastrack();
			reference4.fastrackID=4;
			reference4.material="Rubber";
			reference4.color="Red";
			reference4.warranty=3;
			reference4.size=2;
			reference4.type="Smart Watch";
			
			reference4.targettingGrowth();
			System.out.println("Fastrack ID is  " +reference4.fastrackID);
			System.out.println(" Material Used is  " + reference4.material);
			System.out.println("Color is  " + reference4.color);
			System.out.println("Warranty is  " + reference4.warranty);
			System.out.println("Dimension is   " + reference4.size);
			System.out.println("Type Of Material is  " + reference4.type);
			
		    System.out.println("------------------------------------------------------");
		}
		
}