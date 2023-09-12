public class BusStand{

  private int busStandId;
  private String name;
  private String location;
  private int noOfPlatform;
  private int totalBuses;  

   public void setBusStandId(int busStandId){
	   this.busStandId=busStandId;
   }
   
   public int getBusStandId(){
	   return busStandId;
   }
   
   public void setName(String name){
	   this.name=name;
   }
   
   public String getName(){
	   return name;
   }
   
   public void setLoaction(String location){
	   this.location=location;
   }
   
   public String getLocation(){
	   return location;
   }
   
   public void setNoOfPlatform(int noOfPlatform){
	   this.noOfPlatform=noOfPlatform;
   }
   
   public int getNoOfPlatform(){
	   return noOfPlatform;
   }
   
   public void setTotalBuses(int totalBuses){
	   this.totalBuses=totalBuses;
   }
   
   public int getTotalBuses(){
	   return totalBuses;
   }

}