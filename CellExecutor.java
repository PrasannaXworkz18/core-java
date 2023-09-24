class CellExecutor{
	
	public static void main(String args[]){
		
	Cell reference = new Cell();
     reference.setType("Analog");	
	 reference.setPrice(1200);	
	 reference.setColor("Black");	
	 reference.setCompanyName("BeatXP");	
	 reference.setShopName("Tarun Times");	
	
	Watch watch = new Watch();
	watch.cell=reference;
	watch.managedBy="BeatXP";
	
	System.out.println("managedBy: "+watch.managedBy);
	System.out.println("type of watch:  "+ watch.cell.getType());
	System.out.println("Price of watch:  "+ watch.cell.getPrice());
	System.out.println("Color of the watch:  "+ watch.cell.getColor());
	System.out.println("Company of watch:  "+ watch.cell.getCompanyName());
	System.out.println("Shop Name of watch:  "+ watch.cell.getShopName());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
}