class SoilExecutor{

    public static void main(String args[]){
		
		Soil reference = new Soil();
		reference.setId(1);
		reference.setSoilType("Clay");
		reference.setColor("Brown");
		
		Plant plant = new Plant();
		plant.soil=reference;
		
		System.out.println("Id: "+plant.soil.getId());
		System.out.println("Soil Type: "+plant.soil.getSoilType());
		System.out.println("Soil Color: "+plant.soil.getColor());
		
	}

























}