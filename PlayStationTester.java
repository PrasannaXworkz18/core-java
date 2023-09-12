class PlayStationTester{

   public static void main(String args[]){
	   
	   PlayStation PlayStation = new PlayStation(1,"Padmanavabha PlayStation",30, 10,"Mysore");
	   PlayStation.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   
	   PlayStation PlayStation1= new PlayStation(2,"Sri PlayStation",25,8,"Kodagu");
	   PlayStation1.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   PlayStation PlayStation2= new PlayStation(3,"Jenny PlayStation",15,10,"Beluru");
	   PlayStation2.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   PlayStation PlayStation3= new PlayStation(4,"Iyyan PlayStation",8,8,"RR Nagar");
	   PlayStation3.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   	   
	   PlayStation PlayStation4= new PlayStation(5,"Vasuki PlayStation",13,11,"BTM Layout");
	   PlayStation4.displayDetails();
	   System.out.println("--------------------------------------------------------");
	   
   }


}