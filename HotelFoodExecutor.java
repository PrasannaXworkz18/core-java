class HotelFoodExecutor{

	public static void main(String args []){
		
		HotelFood seperate = new HotelFood();
		 seperate.addMenu("Veg Biriyani");
		 seperate.addMenu("Curd Rice");
		 seperate.addMenu("Jeera Rice");
		 seperate.addMenu("Mutton Biriyani");
		 seperate.addMenu("Chitranna");
		 seperate.addMenu("Chikken papper Dry");
		 seperate.addMenu("Fish Fry");
		 seperate.addMenu("Mutton Sukka");
		 seperate.addMenu("Mutton Fry");
		 seperate.addMenu("tea");
		 
		 seperate.getMenu();
	
	}
}










/*class HotelFoodExecutor{

	public static void main(String args []){
		
		HotelFood seperate = new HotelFood();
		 seperate.addMenu("Veg Biriyani");
		 seperate.addMenu("Curd Rice");
		 seperate.addMenu("Jeera Rice");
		 seperate.addMenu("Mutton Biriyani");
		 seperate.addMenu("Chitranna");
		 seperate.addMenu("Chikken papper Dry");
		 seperate.addMenu("Fish Fry");
		 seperate.addMenu("Mutton Sukka");
		 seperate.addMenu("Mutton Fry");
		 seperate.addMenu("tea");
		 
		 seperate.getMenu();
	
	}
}*/







class HotelFoodExecutor{

public static void main(String args[]){

HotelFood hotel = new HotelFood();

hotel.addFoodName("dose");
hotel.addFoodName("puri");
hotel.addFoodName("idli");
hotel.addFoodName("vada");
hotel.addFoodName("palav");
hotel.addFoodName("pongal");
hotel.addFoodName("bisibelebath");
hotel.addFoodName("Parota");
hotel.addFoodName("biryani");
hotel.addFoodName("Rice");
hotel.addFoodName("Rice");
hotel.getMenu();

boolean is = hotel.deleteByName("dose");

}

}