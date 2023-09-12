class AmusementParkTester{

   public static void main(String args[]){
	   
	   AmusementPark amusementPark = new AmusementPark(1,"Cedar Point","9 am To 9pm","Ohio","Airoplane");
	   amusementPark.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   
	   AmusementPark amusementPark1= new AmusementPark(2,"Six Flags Magic Mountain","8 am To 8:30pm","Callifornia","Airoplane");
	   amusementPark1.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   AmusementPark amusementPark2= new AmusementPark(3,"Island Of Adventure","7 am To 8pm","Florida","Airoplane");
	   amusementPark2.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   AmusementPark amusementPark3= new AmusementPark(4,"9:30 aisney Land Park","8am  To 7pm","Callifornia","Airoplane");
	   amusementPark3.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   AmusementPark amusementPark4= new AmusementPark(5,"Magic Kingdom Park","10 am To 10pm","Florida","Airoplane");
	   amusementPark4.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   
   }


}