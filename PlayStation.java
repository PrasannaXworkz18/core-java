class PlayStation{

  int id;
  String name;
  int noOfToys;
  int noOfGames;
  String place;
  
    public PlayStation( int id , String name , int noOfToys , int noOfGames , String place){
		
		this.id = id;
		this.name = name;
		this.noOfToys = noOfToys;
		this.noOfGames = noOfGames;
		this.place = place;
			
	                                                                                                                          }

   public void displayDetails(){
	   
	   System.out.println("PlayStation Id Is:  " +this.id);
	   System.out.println("PlayStation Name Is:  " +this.name);
	   System.out.println("PlayStation Total Toys Is:  " +this.noOfToys);
	   System.out.println("PlayStation Total Games Is:  " +this.noOfGames);
	   System.out.println("PlayStation Place Is:  " +this.place);
	   
   }
}