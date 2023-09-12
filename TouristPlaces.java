class TouristPlaces{

  int id;
  String name;
  String timing;
  String place;
  String vehicle;
  
    public TouristPlaces( int id , String name , String timing , String place , String vehicle){
		
		this.id = id;
		this.name = name;
		this.timing = timing;
		this.place = place;
		this.vehicle = vehicle;
			
	                                                                                                                          }

   public void displayDetails(){
	   
	   System.out.println("TouristPlaces Id Is:  " + id);
	   System.out.println("TouristPlaces Name Is:  " + name);
	   System.out.println("TouristPlaces Timing Is:  " + timing);
	   System.out.println("TouristPlaces Is:  " + place);
	   System.out.println("Availability Of Vehicle Is:  " + vehicle);
	   
   }
}