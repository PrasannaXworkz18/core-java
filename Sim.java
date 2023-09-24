class Sim{

  private int simId;
  private String simName;
  private long simNumber;
  private String simBelongsTo;

  public void Sim(){
	  
  }

  public void setSimId(int simId){
	  this.simId=simId;
  }

  public int getSimId(){
	  return simId;
  }

  public void setSimName(String simName){
	  this.simName=simName;
  }

   public String getSimName(){
	   return simName;
   }
   
   public void setSimNumber(long simNumber){
	   this.simNumber=simNumber;
   }
   
   public long getSimNumber(){
	   return simNumber;
   }
   
   public void setSimBelongsTo(String simBelongsTo){
	   this.simBelongsTo=simBelongsTo;
   }
   
   public String getSimBelongsTo(){
	   return simBelongsTo;
   }

}