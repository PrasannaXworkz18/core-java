class Hotel{
static String hotelMenu[] = {"Dosa","Idly","Chitranna","Mosranna","Pulav","Pongal","bath","Upma","Parata","Roti","Dal","Dhum Biriyani","Vada","Kheer",
"Chicken rice","Ghee rice","Aloo parata","Dal kichadi","Panner","Sbji","Chicken Sukka","Hyderabadi Biriyani","Kalmi Kabab","Tandoori Roti","Romal Roti",
"HyderabadiRoti","Pot Biriyani","Masala Rice","Zeera Rice","Curd Rice","Mutton Biriyani","Mutton Curry","Egg Curry","Chicken Roll","Egg Roll","Omlet",
"BreadOmlet","Shewarma","Set Dosa","HlafBoiled","NatiStyleChicken","PepperDry","Boti","Pakoda","Soup","Beeda","FishFry","Fishcurry","FishSambar","WhiteRice"};

static int price[] = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500};

public static void main (String arg[]) {

System.out.println("main started----------------");
System.out.println("The food list");
/*System.out.println(hotelMenu[0]+"price---"+price[0]);
System.out.println(hotelMenu[1]+"price---"+price[1]); 
System.out.println(hotelMenu[2]+"price---"+price[2]); 
System.out.println(hotelMenu[3]+"price---"+price[3]); 
System.out.println(hotelMenu[4]+"price---"+price[4]); 
System.out.println(hotelMenu[5]+"price---"+price[5]); 
System.out.println(hotelMenu[6]+"price---"+price[6]); 
System.out.println(hotelMenu[7]+"price---"+price[7]); 
System.out.println(hotelMenu[8]+"price---"+price[8]); 
System.out.println(hotelMenu[9]+"price---"+price[9]); 
System.out.println(hotelMenu[10]+"price---"+price[10]); 
System.out.println(hotelMenu[11]+"price---"+price[11]); 
System.out.println(hotelMenu[12]+"price---"+price[12]); 
System.out.println(hotelMenu[13]+"price---"+price[13]); 
System.out.println(hotelMenu[14]+"price---"+price[14]); 
System.out.println(hotelMenu[15]+"price---"+price[15]); 
System.out.println(hotelMenu[16]+"price---"+price[16]); 
System.out.println(hotelMenu[17]+"price---"+price[17]); 
System.out.println(hotelMenu[18]+"price---"+price[18]); 
System.out.println(hotelMenu[19]+"price---"+price[19]); 
System.out.println(hotelMenu[20]+"price---"+price[20]); 
System.out.println(hotelMenu[21]+"price---"+price[21]); 
System.out.println(hotelMenu[22]+"price---"+price[22]); 
System.out.println(hotelMenu[23]+"price---"+price[23]); 
System.out.println(hotelMenu[24]+"price---"+price[24]); 
System.out.println(hotelMenu[25]+"price---"+price[25]); 
System.out.println(hotelMenu[26]+"price---"+price[26]); 
System.out.println(hotelMenu[27]+"price---"+price[27]); 
System.out.println(hotelMenu[28]+"price---"+price[28]); 
System.out.println(hotelMenu[29]+"price---"+price[29]); 
System.out.println(hotelMenu[30]+"price---"+price[30]); 
System.out.println(hotelMenu[31]+"price---"+price[31]); 
System.out.println(hotelMenu[32]+"price---"+price[32]); 
System.out.println(hotelMenu[33]+"price---"+price[33]); 
System.out.println(hotelMenu[34]+"price---"+price[34]); 
System.out.println(hotelMenu[35]+"price---"+price[35]); 
System.out.println(hotelMenu[36]+"price---"+price[36]); 
System.out.println(hotelMenu[37]+"price---"+price[37]); 
System.out.println(hotelMenu[38]+"price---"+price[38]); 
System.out.println(hotelMenu[39]+"price---"+price[39]); 
System.out.println(hotelMenu[40]+"price---"+price[40]); 
System.out.println(hotelMenu[41]+"price---"+price[41]); 
System.out.println(hotelMenu[42]+"price---"+price[42]); 
System.out.println(hotelMenu[43]+"price---"+price[43]); 
System.out.println(hotelMenu[44]+"price---"+price[44]); 
System.out.println(hotelMenu[45]+"price---"+price[45]); 
System.out.println(hotelMenu[46]+"price---"+price[46]); 
System.out.println(hotelMenu[47]+"price---"+price[47]); 
System.out.println(hotelMenu[48]+"price---"+price[48]); 
System.out.println(hotelMenu[49]+"price---"+price[49]); */

System.out.println("the length of hotel menu is   "+hotelMenu.length);
	 for(int i=0;i<hotelMenu.length;i++ )
	 {
		 System.out.println(hotelMenu[i]);
	 }
	 
	 System.out.println("---------------------------");
	 for(int i=hotelMenu.length-1;i>=0;i-- )
	 {
		 
	     System.out.println(hotelMenu[i]);
	}	 
     System.out.println("main ended---------------------"); 
}
}