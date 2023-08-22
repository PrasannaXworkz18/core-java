class ShoppingMall{
static String shop[]= {"KFC","Mc Donald","Car Bar","Pizza Hut","Sangeetha","Electronics hub","Gaming Palace","Dark Wine","Cafe",
"Coffe Day","First Cry","Baby Barbique","Life Stylestores","Abharan Jewells","Appolo"};

public static void main (String arg[]) {

System.out.println("main started---------" );

System.out.println("shop names are " );
/*System.out.println(shop[0] );
System.out.println(shop[1] );
System.out.println(shop[2] );
System.out.println(shop[3] );
System.out.println(shop[4] );
System.out.println(shop[5] );
System.out.println(shop[6] );
System.out.println(shop[7] );
System.out.println(shop[8] );
System.out.println(shop[9] );
System.out.println(shop[10] );
System.out.println(shop[11] );
System.out.println(shop[12] );
System.out.println(shop[13] );
System.out.println(shop[14] );
*/

System.out.println("the length of the shop is   "+shop.length);
	 for(int i=0;i<shop.length;i++ )
	 {
		 System.out.println(shop[i]);
	 }
	 
	 System.out.println("---------------------------");
	 for(int i=shop.length-1;i>=0;i-- )
	 {
		 
	     System.out.println(shop[i]);
	}	 
System.out.println("main ended" );
}
}