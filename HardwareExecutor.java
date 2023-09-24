class HardwareExecutor{

    public static void main(String args[]){
		
		Hardware reference = new Hardware();
		reference.setHardwareId(1);
		reference.setHardwareComponents("Mouse,Hard Disk,Monitar,CPU...");
		reference.setCompany("HP");
		reference.setHardwareIn("Laptop");

        Software software = new Software();
		software.hardware=reference;
		software.managedBy="Oracle";
   
        System.out.println("managed By: "+software.managedBy);
		System.out.println("Hardware Id: " +software.hardware.getHardwareId());
		System.out.println("Components: " +software.hardware.getHardwareComponents());
		System.out.println("Hardware Company: " +software.hardware.getCompany());
		System.out.println("Device: " +software.hardware.getHardwareIn());
		
	}

}