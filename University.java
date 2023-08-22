class University{
static String degreeColleges[] = {"BIET","BIT","CIT","SSIPUC","AIT","NITK","IITB","IISC","Siddaganga Composite college",
"PESIT","NIE","SJCE","MIT","Jnana Jyothi college","SIT"};

public static void main (String arg[]) {

System.out.println("degree college names available in below");
System.out.println("main started"); 
System.out.println("---------------------------------");

System.out.println("the length of the college is   "+degreeColleges.length);
	 for(int i=0;i<degreeColleges.length;i++ )
	 {
		 System.out.println(degreeColleges[i]);
	 }
     System.out.println("--------------------------------"); 
      
	  for(int i=degreeColleges.length-1;i>=0;i-- )
	 {
		 
	     System.out.println(degreeColleges[i]);
	}	 

System.out.println("main ended "); 
}
}