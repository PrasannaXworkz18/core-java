class KitchenExecutor{

   public static void main(String args[]){
	   
	   Kitchen reference = new Kitchen();
	   reference.setHotelId(1);
	   reference.setHotelName("Hotel Sagar");
	   reference.setOwnerName("Sagar  Das");
	   reference.setLocation("Rajajinagar");

       Hotel hotel = new Hotel();
       hotel.kitchen=reference;
       hotel.managedBy="Aahara Department";

       System.out.println("Hotel Managed By: "+hotel.managedBy);
       System.out.println("Hotel Name: "+hotel.kitchen.getHotelName());
	   System.out.println("Owner Name: "+hotel.kitchen.getOwnerName());
	   System.out.println("Location: "+hotel.kitchen.getLocation());
	   
   }

}