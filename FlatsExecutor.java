class FlatsExecutor{

    public static void main(String args[]){
		
    Flats reference = new Flats();
    reference.setFlatId(1);	
	reference.setName("Hoysala");	
	reference.setLocation("Bannigatta");	
	reference.setFlatNumber(46);	
		
    Apartment apartment = new Apartment();
    apartment.flats=reference;
	apartment.managedBy="Bren Developers";	
	
	System.out.println("Flat  Is Managed By: "+apartment.managedBy);
	System.out.println("Flat Id: "+apartment.flats.getFlatId());
	System.out.println("Flat Name: "+apartment.flats.getName());
	System.out.println("Flat Location: "+apartment.flats.getLocation());
	System.out.println("Flat Number: "+apartment.flats.getFlatNumber());

		
	}

}