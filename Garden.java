class Garden{

  int id;
  String name;
  String timing;
  String place;
  int noOfGates;
  
    public Garden( int id , String name , String timing , String place , int noOfGates){
		
		this.id = id;
		this.name = name;
		this.timing = timing;
		this.place = place;
		this.noOfGates = noOfGates;
			
	                                                                                                                          }

   public void displayDetails(){
	   
	   System.out.println("Garden Id Is:  " +this.id);
	   System.out.println("Garden Name Is:  " +this.name);
	   System.out.println("Garden Timing Is:  " +this.timing);
	   System.out.println("Garden Place Is:  " +this.place);
	   System.out.println("Number Of Garden Gates Is:  " +this.noOfGates);
	   
   }
}