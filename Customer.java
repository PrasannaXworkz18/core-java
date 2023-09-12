//Encapsulation--by using private

class Customer{

   private int customerId;
   private String customerName;
   private String address;
   private long  phoneNo;
   private String email;
   private String dob;
   private String gender;

     //setter and getter method
	 
     public void setCustomerId(int customerId){
		 this.customerId=customerId;
                                                                  	 }

     public int getCustomerId(){
		return customerId;
	                                         }
											 
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}									 
											 
				public String getCustomerName(){
					return customerName;
				}					

    public void setAddress(String address){
		this.address=address;
	}				
	
	public String getAddress(){
		return address;
	}
				
     public void setPhoneNo(long phoneNo){
		this.phoneNo=phoneNo;
	}				
	
	public long getPhoneNo(){
		return phoneNo;
	}
	
     public void setEmail(String email){
		this.email=email;
	}				
	
	public String getEmail(){
		return email;
	}
	
	public void setDob(String dob){
		this.dob=dob;
	}
			
	public String getDob(){
		return dob;
	}						
	
   public void setGender(String gender){
	   this.gender=gender;
   }	
   
   public String getGender(){
	   return gender;
   }
											 

                         }