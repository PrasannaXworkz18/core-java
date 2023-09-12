class TouristPlacesTester{

   public static void main(String args[]){
	   
	   TouristPlaces TouristPlaces = new TouristPlaces(1,"Zoo","9 am To 9pm","Mysore","Bus");
	   TouristPlaces.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   
	   TouristPlaces TouristPlaces1= new TouristPlaces(2,"Kuduremukha","8 am To 8:30pm","Chikmagaluru","Own");
	   TouristPlaces1.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   TouristPlaces TouristPlaces2= new TouristPlaces(3,"Temples","7 am To 8pm","Beluru","Bus Or Own");
	   TouristPlaces2.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   TouristPlaces TouristPlaces3= new TouristPlaces(4,"Taj Mahal","9:30 am To 7pm","Agra","Anything");
	   TouristPlaces3.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   TouristPlaces TouristPlaces4= new TouristPlaces(5,"Baaga Beach","10 am To 10pm","Gao","Train Or Airoplane");
	   TouristPlaces4.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   
   }


}