class Bar{
static String alcohols[] = {"Vodka","Beer","Rum","Gin","Whiskey","Wine","Brandy","Tequila","Spirit",
"Bagpiper","Raja","Cosmopoliton","Vermourth","Old Fashioned","Bloody Mary","Mead","Liquires","Absinite","Daiquiri","Red Whine","Martini","Margarita","Mojito","Sangria","Chamagne","Cider","Mint Julep","Pina Colada","Caipirinha","Divavodka"};
static int price[] = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000,11000,12000,13000,14000,15000,16000,17000,18000,19000,20000,21000,22000,23000,24000,25000,26000,27000,28000,29000,30000};
public static void main (String arg[]) 
{

System.out.println("the main has started");
System.out.println("the alcholos available in the bar are  ");
/*System.out.println(alcohols[0]   + "the price of this is " + price[0]);
System.out.println(alcohols[1]   + "the price of this is " + price[1]);
System.out.println(alcohols[2]   + "the price of this is " + price[2]);
System.out.println(alcohols[3]   + "the price of this is " + price[3]);
System.out.println(alcohols[4]   + "the price of this is " + price[4]);
System.out.println(alcohols[5]   + "the price of this is "  + price[5]);
System.out.println(alcohols[6]   + "the price of this is "  + price[6]);
System.out.println(alcohols[7]   + "the price of this is "  + price[7]);
System.out.println(alcohols[8]   + "the price of this is "  + price[8]);
System.out.println(alcohols[9]   + "the price of this is "  + price[9]);
System.out.println(alcohols[10]   + "the price of this is "  + price[10]);
System.out.println(alcohols[11]   + "the price of this is "  +price[11]);
System.out.println(alcohols[12]   + "the price of this is "  +price[12]);
System.out.println(alcohols[13]   + "the price of this is "  +price[13]);
System.out.println(alcohols[14]   + "the price of this is "  +price[14]);
System.out.println(alcohols[15]   + "the price of this is "  +price[15]);
System.out.println(alcohols[16]   + "the price of this is "  +price[16]);
System.out.println(alcohols[17]   + "the price of this is "  +price[17]);
System.out.println(alcohols[18]   + "the price of this is "  +price[18]);
System.out.println(alcohols[19]   + "the price of this is "  +price[19]);
System.out.println(alcohols[20]   + "the price of this is "  +price[20]);
System.out.println(alcohols[21]   + "the price of this is "  +price[21]);
System.out.println(alcohols[22]   + "the price of this is "  +price[22]);
System.out.println(alcohols[23]   + "the price of this is "  +price[23]);
System.out.println(alcohols[24]   + "the price of this is "  +price[24]);
System.out.println(alcohols[25]   + "the price of this is "  +price[25]);
System.out.println(alcohols[26]   + "the price of this is "  +price[26]);
System.out.println(alcohols[27]   + "the price of this is "  +price[27]);
System.out.println(alcohols[28]   + "the price of this is "  +price[28]);
System.out.println(alcohols[29]   + "the price of this is "  +price[29]);*/

 System.out.println("the length of alcholos is   "+  alcohols.length);
	 for(int i=0;i< alcohols.length;i++ )
	 {
		 System.out.println( alcohols[i]);
	 }
	 
	   System.out.println("---------------------------");
	 for(int i=alcohols.length-1;i>=0;i-- )
	 {
		 
	     System.out.println(alcohols[i]);
	}	 
     System.out.println("the main has ended");
}

}