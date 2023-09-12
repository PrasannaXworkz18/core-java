class Zoo{

  int id;
  String name;
  String location;
  int noOfEmployes;
  int yearOfHistory;

         public Zoo(int id , String name , String location , int noOfEmployes , int yearOfHistory){
			 
			this.id = id ;
			this.name =name;
			this.location =location ;
			this.noOfEmployes =noOfEmployes;
			this.yearOfHistory =yearOfHistory;
		                                                                                                                                     }
																																			 
    public void getdisplay(){
		
		System.out.println("The Airport Id is:  " + this.id);
		System.out.println("The Airport Name is:  " +this. name);
		System.out.println("The Airport Location is:  " + this.location);
		System.out.println("The Number Of Employes Worked In Airport:  " + this.noOfEmployes);
		System.out.println("Year Of History For That Zoo:  " +this. yearOfHistory);
	
	                                   }

}