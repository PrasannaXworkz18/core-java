class StateExecutor{

   public static void main(String args[]){
	   
	   State reference = new State();
	   reference.setStateName("Karnataka");
	   reference.setNameOfCm("Siddaramayya");
	   reference.setCapitalName("Bengaluru");
	   reference.setNoOfDistrict(30);
	   
	   Country country = new Country();
	   country.state=reference;
	   country.managedBy="Govt Of Karnataka";

       System.out.println("Managed By: "+country.managedBy);
       System.out.println("State Name: "+country.state.getStateName());
       System.out.println("Name Of CM: "+country.state.getNameOfCm());
       System.out.println("Name Of Capital: "+country.state.getCapitalName());
       System.out.println("No Of District: "+country.state.getNoOfDistrict());	   
	   
   }

}