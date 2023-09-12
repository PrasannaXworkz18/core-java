class BankTester{
	
	public static void main(String args[]){
		
		Bank bank = new Bank();
		
		bank.setBankId(1);
		bank.setName("SBI");
		bank.setBranchName("Hattiguppe");
		bank.setManagerName("Sri Hari");
		bank.setIfscCode("IFSC0003456");
		bank.setEmail("SBI@gmail.in");
		
		System.out.println("The Bank Id Is:  " + bank.getBankId());
		System.out.println("The Bank Name Is:  " + bank.getName());
		System.out.println("Branch Name Is:  "  + bank.getBranchName());
		System.out.println("Manager Name Is:  " + bank.getManagerName());
		System.out.println("IFSC Code Is:  " + bank.getIfscCode());
		System.out.println("The Bank Email Is: " + bank.getEmail());
	}
	
	
	
	
	
	
}