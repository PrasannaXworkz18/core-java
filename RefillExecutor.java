class RefillExecutor{

   public static void main(String args[]){
	   
	   Refill reference = new Refill();
	   reference.setRefillId(1);
	   reference.setRefillColor("Black");
	   reference.setRefillBrand("Apsara");
	   reference.setRefillLengthInCm(15);
	   
	   Pen pen = new Pen();
	   pen.refill=reference;
	   pen.managedBy="Apsara";
	   
	   System.out.println("Pen Is Managed By: "+pen.managedBy);
	   System.out.println("Refill Id: "+pen.refill.getRefillId());
	   System.out.println("Refill Color: "+pen.refill.getRefillColor());
	   System.out.println("Refill Brand: "+pen.refill.getRefillBrand());
	   System.out.println("Refill Length In Cm: "+pen.refill.getRefillLengthInCm());
	   
   }






















}