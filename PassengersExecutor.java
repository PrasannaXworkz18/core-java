class PassengersExecutor{

    public static void main(String args[]){
		
		Passengers reference = new Passengers();
		reference.setPassengerName("Roshan");
		reference.setTicketPrice(80);
		reference.setGender("Male");
		reference.setAge(22);
		
		Train train = new Train();
		train.passengers = reference;
		train.managedBy="Indian Railway";
		
		System.out.println("Managed By: "+train.managedBy);
		System.out.println("Passenger Name: "+train.passengers.getPassengerName());
		System.out.println("Ticket Price: "+train.passengers.getTicketPrice());
		System.out.println("Gender: "+train.passengers.getGender());
		System.out.println("Age: "+train.passengers.getAge());
		
		}

}