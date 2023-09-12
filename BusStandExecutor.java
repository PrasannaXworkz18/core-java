class BusStandExecutor{

  public static void main(String args[]){
	  
	  BusStand variable = new BusStand();
	  
	  variable.setBusStandId(1);
	  variable.setName("Vishmanava");
	  variable.setLoaction("BTM Layout");
	  variable.setNoOfPlatform(10);
	  variable.setTotalBuses(100);
	  
	  System.out.println("The Bus Stand Id Is:  " + variable.getBusStandId());
	  System.out.println("The Bus Stand Name Is:  " + variable.getName());
	  System.out.println("Loaction:  " + variable.getLocation());
	  System.out.println("Number Of Platform :  " + variable.getNoOfPlatform());
	  System.out.println("Total Buses:  " + variable.getTotalBuses());
	  
  }














}