public class Railway{

  private int railwayId;
  private String name;
  private int noOfTicketCounter;
  private String location;
  private int noOfWorkers;
  private int noOfPlatform;

   public void setRailwayId(int railwayId){
	   this.railwayId=railwayId;
                                                            }
   
   public int getRailwayId(){
	   return railwayId;
   }
   
   public void setName(String name){
	   this.name=name;
   }
   
   public String getName(){
	   return name;
   }
   
   public void setNoOfTicketCounter(int noOfTicketCounter){
	   this.noOfTicketCounter=noOfTicketCounter;
   }
   
   public int getNoOfTicketCounter(){
	   return noOfTicketCounter;
   }
   
   public void setLocation(String location){
	   this.location=location;
   }

   public String getLocation(){
	   return location;
   }

  public void setNoOfWorkers(int noOfWorkers){
	  this.noOfWorkers=noOfWorkers;
  }

  public int getNoOfWorkers(){
	  return noOfWorkers;
  }

  public void setNoOfPlatform(int noOfPlatform){
	  this.noOfPlatform=noOfPlatform;
  }

  public int getNoOfPlatform(){
	  return noOfPlatform;
  }

}