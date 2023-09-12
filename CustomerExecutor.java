class CustomerExecutor{

    public static void main (String args[]){
		
		Customer customer = new Customer();
		
		customer.setCustomerId(1);
		customer.setCustomerName("Prasanna");
		customer.setAddress("WhiteField");
		customer.setPhoneNo(6363747107L);
		customer.setEmail("nayakprasanna264@gmail.com");
		customer.setDob("11/11/2001");
		customer.setGender("Male");
		
       System.out.println("The Customer Id Is:  " + customer.getCustomerId());
       System.out.println("The Customer Name Is:  " + customer.getCustomerName());
       System.out.println("The Customer Address Is:  " + customer.getAddress());
       System.out.println("The Customer Phone Number Is:  " + customer.getPhoneNo());
	   System.out.println("The Customer Email Is:  " + customer.getEmail());
	   System.out.println("The Customer DOB Is:  " + customer.getDob());
	   System.out.println("The Customer Gender Is:  " + customer.getGender());

	   
	}



}
