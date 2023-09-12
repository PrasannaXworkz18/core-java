class Gym{

  int id;
  String name;
  int noOfEquipment;
  String place;
  String typeOfEquipment;
  
    public Gym( int id , String name , int noOfEquipment, String place , String typeOfEquipment){
		
		this.id = id;
		this.name = name;
		this.noOfEquipment = noOfEquipment;
		this.place = place;
		this.typeOfEquipment = typeOfEquipment;
			
	                                                                                                                          }

   public void displayDetails(){
	   
	   System.out.println("Gym Id Is:  " +this.id);
	   System.out.println("Gym Name Is:  " +this.name);
	   System.out.println("Gym noOfEquipment Is:  " +this.noOfEquipment);
	   System.out.println("Gym Place Is:  " +this.place);
	   System.out.println("Gym typeOfEquipment Is:  " +this.typeOfEquipment);
	   
   }
}