class LenskartTester{

public static void main(String args[]){
	
	Lenskart lens = new Lenskart();
	lens.city = "Benglore";
	lens.lenskartTotalBranch = 100;
	lens.lenskartStartingPrice = 799;
	lens.discounts = "15%";
	lens.typeProduct = 4;
	
	System.out.println("------------------------------------------------------");
	
	System.out.println("City Name " + lens.city);
	System.out.println("Total Branch " + lens.lenskartTotalBranch);
	System.out.println("Starting price "+ lens.lenskartStartingPrice);
	System.out.println("Discounts "+ lens.discounts);
	System.out.println("Type of products "+ lens.typeProduct);
	
	lens.provideEyesafety();
	
	System.out.println("------------------------------------------------------");
	
	Lenskart lens1 = new Lenskart();
	lens1.city = "MUMBAI";
	lens1.lenskartTotalBranch = 83;
	lens1.lenskartStartingPrice = 799;
	lens1.discounts = "13%";
	lens1.typeProduct = 4;
	
	System.out.println("City Name " + lens1.city);
	System.out.println("Total Branch " + lens1.lenskartTotalBranch);
	System.out.println("Starting price "+ lens1.lenskartStartingPrice);
	System.out.println("Discounts "+ lens1.discounts);
	System.out.println("Type of products "+ lens1.typeProduct);
	
	lens.provideEyesafety();
	
	System.out.println("------------------------------------------------------");
	
	
}

}