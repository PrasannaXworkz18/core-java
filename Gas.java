class Gas{

   private int gasId;
   private String name;
   private double weigth;
   private String deliveryFrom;

   public void Gas(){
	   
   }

   public void setGasId(int gasId){
	   this.gasId=gasId;
   }

   public int getGasId(){
	   return gasId;
   }

  public void setName(String name){
	  this.name=name;
  }

   public String getName(){
	   return name;
   }
   
   public void setWeigtht(double weigth){
	   this.weigth=weigth;
   }
   
   public double getWeigth(){
	   return weigth;
   }
   
   public void setDeliveryFrom(String deliveryFrom){
	   this.deliveryFrom=deliveryFrom;
   }
   
   public String getDeliveryFrom(){
	   return deliveryFrom;
   }

}