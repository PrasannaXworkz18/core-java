class Airport{

  int id;
  String name;
  String location;
  int noOfEmployes;
  int noOfFlights;

         public Airport(int id , String name , String location , int noOfEmployes , int noOfFlights){
			 
			 System.out.println("this is parametrized cons");
			this.id = id ;
			this.name =name;
			this.location =location ;
			this.noOfEmployes =noOfEmployes;
		    this.noOfFlights =noOfFlights;
		                                                                      }
		                                             
   public Airport(){
	   this(1,"Kempegowda International Airport","Banglore",80,25);
	   System.out.println("this is default cons");
   }							

  public Airport(){
	  this.(2,"Krantiveera International Airport","Dehli",100,30);
	   System.out.println("this is default cons");
   }													 
			   
																																			 
    public void getdisplay(){
		
		System.out.println("The Airport Id is:  " +this.id);
		System.out.println("The Airport Name is:  " +this.name);
		System.out.println("The Airport Location is:  " +this.location);
		System.out.println("The Number Of Employes Worked In Airport:  " +this.noOfEmployes);
		System.out.println("Number Of Flights In Airport:  " +this.noOfFlights);
	
	                                   }

}