class ChainTester{
	public static void main(String args[]){
		
		//new keyword
		//classname ref = new className();
		
		Chain cha = new Chain();
		cha.chainId = 1;
		cha.chainName = "Cycle chain";
		cha.chainBrand = "Between";
		cha.chainModel = 2021 ;
		cha.chainWeight = 600;
		cha.manYear = 2021;
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("the chain id is " +cha.chainId);
		System.out.println("the chain name is " + cha.chainName);
		System.out.println("the chain brand is " +cha.chainBrand);
		System.out.println("the chain model is " +cha.chainModel);
		System.out.println("the chain weight is " +cha.chainWeight);
		System.out.println("the chain man date is " +cha.manYear);
		
		cha.moveVehicles();
		
		System.out.println("------------------------------------------------------");
		
		Chain cha1 = new Chain();
		cha1.chainId = 8;
		cha1.chainName = "Bike chain";
		cha1.chainBrand = "Victor";
		cha1.chainModel = 2018 ;
		cha1.chainWeight = 1000;
		cha1.manYear = 2018;
		
		System.out.println("the chain id is " +cha1.chainId);
		System.out.println("the chain name is " + cha1.chainName);
		System.out.println("the chain brand is " +cha1.chainBrand);
		System.out.println("the chain model is " +cha1.chainModel);
		System.out.println("the chain weight is " +cha1.chainWeight);
		System.out.println("the chain man year is " +cha1.manYear);
	    cha.moveVehicles();
	    
	System.out.println("------------------------------------------------------");
	
	
	}
	
}
	
	
	
	
