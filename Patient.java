class Patient{

   private int patientId;
   private String name;
   private int age;
   private String location;
   private long phNo;   

    public void Patient(){
		
	}

  public void setPatientId(int patientId){
	  this.patientId=patientId;
  }

  public int getPatientId(){
	  return patientId;
  }

  public void setName(String name){
	  this.name=name;
  }

   public String getName(){
	   return name;
   }

  public void setAge(int age){
	  this.age=age;
  }

   public int getAge(){
	   return age;
   }

   public void setLocation(String location){
	   this.location=location;
   }
   
   public String getLocation(){
	   return location;
   }
   
   public void setPhNo(long phNo){
	   this.phNo=phNo;
   }
   
   public long getPhNo(){
	   return phNo;
   }

}