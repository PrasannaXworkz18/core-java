class ZomotoTester{

public static void main(String args[]){
	
  double price=0.0;
  
  System.out.println("Main Started");
  
  price = Zomato.search("Pizza");
  System.out.println("The Price For Pizza  " + price);
  
  price = Zomato.search("Carrot Alwa");
  System.out.println("The Price For Carrot Alwa" + price);
  
   price = Zomato.search("Veg Biriyani");
  System.out.println("The Price For Veg Biriyani" + price);
  
  System.out.println("Main Ended");

}

           public static void main(String args[]){
	
  double price=0.0;
  
  System.out.println("Main Started");
  
  price = Zomato.search("Pizza*quantity");
  System.out.println("The Price For Pizzawithquantity " + price);
  
  price = Zomato.search("Carrot Alwa*quantity");
  System.out.println("The Price For Carrot Alwawithquantity" + price);
  
   price = Zomato.search("Veg Biriyani*quantity");
  System.out.println("The Price For Veg Biriyaniwithquantity" + price);
  
  System.out.println("Main Ended");

}



}