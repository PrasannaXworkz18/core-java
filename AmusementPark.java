class AmusementPark{

  int id;
  String name;
  String timing;
  String place;
  String vehicle;
  
    public AmusementPark( int id , String name , String timing , String place , String vehicle){
		
		this.id = id;
		this.name = name;
		this.timing = timing;
		this.place = place;
		this.vehicle = vehicle;
			
	                                                                                                                          }

   public void displayDetails(){
	   
	   System.out.println("AmusementPark Id Is:  " +this. id);
	   System.out.println("AmusementPark Name Is:  " + this.name);
	   System.out.println("AmusementPark Timing Is:  " + this.timing);
	   System.out.println("AmusementPark Is:  " + this.place);
	   System.out.println("Availability Of Vehicle Is:  " + this.vehicle);
	   
   }
}