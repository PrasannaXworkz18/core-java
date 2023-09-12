class PatientExecutor{

   public static void main (String args[]){
	   
	   Patient patient = new Patient();
	   patient.setPatientId(1);
	   patient.setName("Vijaya");
	   patient.setAge(27);
	   patient.setDiseaseName("Typhoid");
	   patient.setWardNo(12);
	   patient.setAdmittedDate("7-6-2012");
	   patient.setHospitalName("Manipal");
	   patient.setPatientAddress("Mysore");
	   patient.setGender("Male");
	   patient.setConsultantDoctor("Niranjan");
	   
      System.out.println("The Patien Id Is:  " + patient.getPatientId());
	  System.out.println("The Patien Name Is:  " + patient.getName());
	  System.out.println("Age Is:  " + patient.getAge());
	  System.out.println("Disease Name Is:  " + patient.getDiseaseName());
	  System.out.println("Ward Number:  " + patient.getWardNo());
	  System.out.println("Admitted Date:  " + patient.getAdmittedDate());
	  System.out.println("Hospital Name Is:  " + patient.getHospitalName());
	  System.out.println("Patient Address Is: " + patient.getPatientAddress());
	  System.out.println("Gender:  " + patient.getGender());
	  System.out.println("Consultant Doctor Is:  " + patient.getConsultantDoctor());
	  System.out.println("");
   }















}