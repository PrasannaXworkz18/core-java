class GasExecutor{

   public static void main(String args[]){
	   
	   Gas reference = new Gas();
	   reference.setGasId(1);
	   reference.setName("Bharathi Shankara");
	   reference.setWeigtht(15.6);
	   reference.setDeliveryFrom("NagarBhavi");
	   
	   Cylinder cylinder = new Cylinder();
	   cylinder.gas=reference;
	   cylinder.managedBy="Indian Oil";
	   
	   System.out.println("Gas Is Managed By: "+ cylinder.managedBy);
	   System.out.println("Gas Id: "+ cylinder.gas.getGasId());
	   System.out.println("Gas Name: "+ cylinder.gas.getName());
	   System.out.println("Gas Weigth: "+ cylinder.gas.getWeigth());
	   System.out.println("Gas Delivery From: "+ cylinder.gas.getDeliveryFrom());
   }





















}