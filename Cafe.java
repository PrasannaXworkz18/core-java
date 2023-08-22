class Cafe {

    public static double search(String foodName){
		
		double price=0.0;
		
		System.out.println("invoking search");
		
		if (foodName == "Pizza"){
		price = 110.00;	
		return price;
		}
		if (foodName == "Carrot Alwa"){
		price = 250.00;
		return price;
		}
		if (foodName == "Veg Biriyani"){
		price = 199.00;
        return price;		
		}
		System.out.println("search ended");
		return price;
	                                                             }
														 
                 
				 
				 public static double search(String foodName , int quantity){
		
		double price=0.0;
		
		System.out.println("invoking search");
		
		if (foodName == "Pizza"){
		price = 110.00 * quantity;	
		
		}
		if (foodName == "Carrot Alwa"){
		price = 250.00 * quantity;
		
		}
		if (foodName == "Veg Biriyani"){
		price = 199.00 * quantity;
        	
		}
		System.out.println("search ended");
		return price;
	                                                             }
														 
}