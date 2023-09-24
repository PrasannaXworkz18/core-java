class FishExecutor{

  public static void main(String args[]){
	  
  Fish reference = new Fish();
  reference.setFishName("Jalebi");
  reference.setPrice(999);
  reference.setColor("Red");
  reference.setWeightInKg(1.5);
  
  
  Water water =new Water();
  water.fish=reference;
  water.managedBy="Cauvery Nigama";

   System.out.println("Managed By:  "+water.managedBy);
   System.out.println("Fish Name Is:  "+water.fish.getFishName());
   System.out.println("Fish Price Is:  "+water.fish.getPrice());
   System.out.println("Fish Color Is:  "+water.fish.getColor());
   System.out.println("Fish Weight In Kg Is:  "+water.fish.getWeightInKg());
   
	  }

}