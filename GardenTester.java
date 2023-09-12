class GardenTester{

   public static void main(String args[]){
	   
	   Garden garden = new Garden(1,"Padmanavabha Garden","9 am To 9pm","Mysore",3);
	   garden.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   
	   Garden garden1= new Garden(2,"Sri Garden","8 am To 8:30pm","Kodagu",2);
	   garden1.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   Garden garden2= new Garden(3,"Jenny Garden","7 am To 8pm","Beluru",3);
	   garden2.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   Garden garden3= new Garden(4,"Iyyan Garden","9:30 am To 7pm","RR Nagar",2);
	   garden3.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   Garden garden4= new Garden(5,"Vasuki Garden","10 am To 10pm","BTM Layout",1);
	   garden4.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   
   }


}