class SimExecutor{

    public static void main(String args[]){
		
		Sim reference = new Sim();
		reference.setSimId(1);
		reference.setSimName("Airtel");
		reference.setSimNumber(6363747107l);
		reference.setSimBelongsTo("India");
		
		Cellphone cell = new Cellphone();
		cell.sim=reference;
		cell.managedBy="Telecom";
		
		System.out.println("Managed By: "+cell.managedBy);
		System.out.println("Sim Id: "+cell.sim.getSimId());
		System.out.println("Sim Id: "+cell.sim.getSimName());
		System.out.println("Sim Id: "+cell.sim.getSimNumber());
		System.out.println("Sim Id: "+cell.sim.getSimBelongsTo());
	}

}