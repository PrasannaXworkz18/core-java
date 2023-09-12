class PostOfficeTester{
	
	public static void main(String args[]){
		
		PostOffice postoffice = new PostOffice(1,"SBI","Hattiguppe","Sri Hari","IFSC0003456","SBI@gmail.in");
		
		postoffice.setPostofficeId(1);
		postoffice.setName("SBI");
		postoffice.setBranchName("Hattiguppe");
		postoffice.setManagerName("Sri Hari");
		postoffice.setIfscCode("IFSC0003456");
		postoffice.setEmail("SBI@gmail.in");
		
		System.out.println("The postoffice Id Is:  " + postoffice.getPostofficeId());
		System.out.println("The postoffice Name Is:  " + postoffice.getName());
		System.out.println("Branch Name Is:  "  + postoffice.getBranchName());
		System.out.println("Manager Name Is:  " + postoffice.getManagerName());
		System.out.println("IFSC Code Is:  " + postoffice.getIfscCode());
		System.out.println("The postoffice Email Is: " + postoffice.getEmail());
	}
	
}