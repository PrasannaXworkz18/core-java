class Metro{
	
	int metroId;
	int noOfCompartment;
	String source;
	String destination;
	
	public Metro(int metroId , int noOfCompartment , String source , String destination ){
    this(); //it is help to communicate with other constructor 
	System.out.println("parameterized constuctor is invoked");
	this.metroId = metroId;          // this helps to avoid conflix between instance and parametrrized constructor having same variable
	this.noOfCompartment = noOfCompartment;
	this.source = source;
	this.destination = destination;
	
	}
	public Metro(){
	//	this(); this is not possible(beacuase same cons inside constructor gives recursion error)
		System.out.println("default con is invoked");
	}
	
	public void displayDeatils(){
		System.out.println("The metroId is:  " +this.metroId);
		System.out.println("noOfCompartment:  " +this.noOfCompartment);
		System.out.println("source:  " +this.source);
		System.out.println("destination:  " +this.destination);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}