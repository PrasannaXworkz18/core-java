class CafeTester{

           public static void main(String args[]){
  
  System.out.println("Main Started");
  
 double pricequantity = Cafe.search("Pizza" , 3);
  System.out.println("The Price For Pizzawithquantity " + pricequantity);
  
  pricequantity = Cafe.search("Carrot Alwa" , 3);
  System.out.println("The Price For Carrot Alwawithquantity" + pricequantity);
  
   pricequantity = Cafe.search("Veg Biriyani" , 3);
  System.out.println("The Price For Veg Biriyaniwithquantity" + pricequantity);
  
  System.out.println("Main Ended");

}
}