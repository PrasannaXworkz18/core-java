class CleintsExecutor{

    public static void main(String args[]){
		
		Cleints reference = new Cleints();
		reference.setCleintsId(1);
		reference.setName("Sakura Harino");
		reference.setCleintsLocation("California");
		reference.setCleintsNumber(7570978634l);
		
		Companies companies = new Companies();
		companies.cleints=reference;
		companies.managedBy="Deloits";
		
		System.out.println("Company Managed By: "+companies.managedBy);
		System.out.println("Cleint Id: "+companies.cleints.getCleintsId());
		System.out.println("Cleint Name: "+companies.cleints.getName());
		System.out.println("Cleints Location: "+companies.cleints.getCleintsLocation());
		System.out.println("Cleint Number: "+companies.cleints.getCleintsNumber());
	}




}