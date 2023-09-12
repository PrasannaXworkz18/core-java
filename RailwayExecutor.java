class RailwayExecutor{

   public static void main (String args[]){
	   
	   Railway railway = new Railway();
	   
	   railway.setRailwayId(1);
	   railway.setName("KSR");
	   railway.setNoOfTicketCounter(4);
	   railway.setLocation("banglore");
	   railway.setNoOfWorkers(40);
	   railway.setNoOfPlatform(10);
	   
	   System.out.println("The Railway Id Is:  " + railway.getRailwayId());
	   System.out.println("The Railway Station Name is:  " +railway.getName());
	   System.out.println("Number Of Ticket Conters:  " + railway.getNoOfTicketCounter());
	   System.out.println("Location:  " + railway.getLocation());
	   System.out.println("Number Of Workers:  " + railway.getNoOfWorkers());
	   System.out.println("Number Of Platform:  " + railway.getNoOfPlatform());
   }

}

















