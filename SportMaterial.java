class SportMaterial{

static String sportMaterial[] = {"cricketbat","football","vallyball","jersey","basketball","leatherball","tennisball","chess board","hockey","trophies","medals","track pants","sleeves","gloves","carrom board"};
static int price[] = {1000,2000,999,500,2999,3999,500,4555,6357,6454,646,858,845,634,4745};
public static void main(String args[])
{
     
	 System.out.println("main started"); 
     
	 System.out.println("---------------------------");
	/* System.out.println("sport material available in below");
	 System.out.println(sportMaterial[0]+"----price is   "+price[0]);
	 System.out.println(sportMaterial[1]+"----price is   "+price[1]);
	 System.out.println(sportMaterial[2]+"----price is   "+price[2]);
	 System.out.println(sportMaterial[3]+"----price is   "+price[3]);
	 System.out.println(sportMaterial[4]+"----price is   "+price[4]);
	 System.out.println(sportMaterial[5]+"----price is   "+price[5]);
	 System.out.println(sportMaterial[6]+"----price is   "+price[6]);
     System.out.println(sportMaterial[7]+"----price is   "+price[7]); 
	 System.out.println(sportMaterial[8]+"----price is   "+price[8]);
	 System.out.println(sportMaterial[9]+"----price is   "+price[9]);
	 System.out.println(sportMaterial[10]+"----price is   "+price[10]);
	 System.out.println(sportMaterial[11]+"----price is   "+price[11]);
	 System.out.println(sportMaterial[12]+"----price is   "+price[12]);
	 System.out.println(sportMaterial[13]+"----price is   "+price[13]);
	 System.out.println(sportMaterial[14]+"----price is   "+price[14]);
	 */
	 System.out.println("the length of the sport materials is   "+sportMaterial.length);
	
 for(int i=sportMaterial.length-1;i>=0;i-- )
	 {
		 
	     System.out.println(sportMaterial[i]);
	}	 
	 System.out.println("---------------------------");
	for(int i=0; i<sportMaterial.length; i++)
		 {
		 System.out.println(sportMaterial[i]);
	     }
	
	 
     System.out.print("main ended"); 
}
}