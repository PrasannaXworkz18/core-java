class PatientExecutor{

    public static void main(String args[]){
		
    Patient reference = new Patient();
	reference.setPatientId(1);
	reference.setName("Prakash");
	reference.setAge(40);
	reference.setLocation("Rajajinagar");
	reference.setPhNo(56792370234l);

    Hospital hospital = new Hospital();
	hospital.patient =reference;
	hospital.managedBy="infosis";

    System.out.println("Hospital Managed By: "+hospital.managedBy);
	System.out.println("Patient Id: "+hospital.patient.getPatientId());
	System.out.println("Patient Name: "+hospital.patient.getName());
	System.out.println("Patient Age: "+hospital.patient.getAge());
	System.out.println("Patient Location: "+hospital.patient.getLocation());
	System.out.println("Patient Number: "+hospital.patient.getPhNo());




		
	}

}