class Cell{

     private String type;
	 private int price;
	 private String color;
	 private String companyName;
	 private String shopName;

   public Cell(){
	   
   }

   public void setType(String type){
	   this.type=type;
   }

  public String getType(){
	  return type;
  }

  public void setPrice(int price){
	  this.price=price;
  }

  public int getPrice(){
	  return price;
  }

  public void setColor(String color){
	  this.color=color;
  }

  public String getColor(){
	  return color;
  }

  public void setCompanyName(String companyName){
	  this.companyName=companyName;
  }
  
  public String getCompanyName(){
	  return companyName;
  }
  
  public void setShopName(String shopName){
	  this.shopName=shopName;
  }
  
  public String getShopName(){
	  return shopName;
  }

}