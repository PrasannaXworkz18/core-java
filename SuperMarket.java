class SuperMarket{
static String groceriesandSnacks[] = {"Tomato","Onion","Carriot","Potato","Brinzal","Ladies Finger","Ginger","Garlic","Corionder","Chilly","MoongDal","Chips","Eggs","Fruits","Jamoon","Beans","Sweets","Butter","Ghee","Palak","Pudeena","Cabbiage","Banana","Mashroom","Soda","Sweet Corn","Curd","GreenChilly","Jelly","Green Gram"};

static int price[] = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300};

 public static void main (String arg[]) {

System.out.println("main started----------------");

System.out.println("The food list");

/*System.out.println(groceriesandSnacks[0]+"price ---"+price[0]);
System.out.println(groceriesandSnacks[1]+"price---"+price[1]); 
System.out.println(groceriesandSnacks[2]+"price---"+price[2]); 
System.out.println(groceriesandSnacks[3]+"price---"+price[3]); 
System.out.println(groceriesandSnacks[4]+"price---"+price[4]); 
System.out.println(groceriesandSnacks[5]+"price---"+price[5]); 
System.out.println(groceriesandSnacks[6]+"price---"+price[6]); 
System.out.println(groceriesandSnacks[7]+"price---"+price[7]); 
System.out.println(groceriesandSnacks[8]+"price---"+price[8]); 
System.out.println(groceriesandSnacks[9]+"price---"+price[9]); 
System.out.println(groceriesandSnacks[10]+"price---"+price[10]); 
System.out.println(groceriesandSnacks[11]+"price---"+price[11]); 
System.out.println(groceriesandSnacks[12]+"price---"+price[12]); 
System.out.println(groceriesandSnacks[13]+"price---"+price[13]); 
System.out.println(groceriesandSnacks[14]+"price---"+price[14]); 
System.out.println(groceriesandSnacks[15]+"price---"+price[15]); 
System.out.println(groceriesandSnacks[16]+"price---"+price[16]); 
System.out.println(groceriesandSnacks[17]+"price---"+price[17]); 
System.out.println(groceriesandSnacks[18]+"price---"+price[18]); 
System.out.println(groceriesandSnacks[19]+"price---"+price[19]); 
System.out.println(groceriesandSnacks[20]+"price---"+price[20]); 
System.out.println(groceriesandSnacks[21]+"price---"+price[21]); 
System.out.println(groceriesandSnacks[22]+"price---"+price[22]); 
System.out.println(groceriesandSnacks[23]+"price---"+price[23]); 
System.out.println(groceriesandSnacks[24]+"price---"+price[24]); 
System.out.println(groceriesandSnacks[25]+"price---"+price[25]); 
System.out.println(groceriesandSnacks[26]+"price---"+price[26]); 
System.out.println(groceriesandSnacks[27]+"price---"+price[27]); 
System.out.println(groceriesandSnacks[28]+"price---"+price[28]); 
System.out.println(groceriesandSnacks[29]+"price---"+price[29]);*/

System.out.println("the length of groceries and snacks is   "+ groceriesandSnacks.length);
	 for(int i=0;i<groceriesandSnacks.length;i++ )
	 {
		 System.out.println(groceriesandSnacks[i]);
	 } 
	 
	 System.out.println("---------------------------");
	 for(int i=groceriesandSnacks.length-1;i>=0;i-- )
	 {
		 
	     System.out.println(groceriesandSnacks[i]);
	}	 

 System.out.println("main ended----------------");
 
}
}
	