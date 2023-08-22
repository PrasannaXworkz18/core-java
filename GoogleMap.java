class GoogleMap{
static String road[] = {"Rajkumar Road","Vishnu Road","Puneeth Road","Avenue Road","Tumkur Road","Zim Road","Nice Road","Palace Road","Chuerch Road",
"College Road","Sachin Road","BH Road","Sira Road","New Road","Tank Road","Bapuji Road","Harihara Road","Honnali Road","Tunga Road","Mud Road","Magadi Road",
"SMV Road","JC Road","MG Road","Street Road"};

public static void main (String arg[]) {

System.out.println("main started------------");
/*System.out.println(road[0]);
System.out.println(road[1]);
System.out.println(road[2]);
System.out.println(road[3]);
System.out.println(road[4]);
System.out.println(road[5]);
System.out.println(road[6]);
System.out.println(road[7]);
System.out.println(road[8]);
System.out.println(road[9]);
System.out.println(road[10]);
System.out.println(road[11]);
System.out.println(road[12]);
System.out.println(road[13]);
System.out.println(road[14]);
System.out.println(road[15]);
System.out.println(road[16]);
System.out.println(road[17]);
System.out.println(road[18]);
System.out.println(road[19]);
System.out.println(road[20]);
System.out.println(road[21]);
System.out.println(road[22]);
System.out.println(road[23]);
System.out.println(road[24]);*/

 System.out.println("the length of the roads is   "+road.length);
	 for(int i=0;i<road.length;i++ )
	 {
		 System.out.println(road[i]);
	 }
	 
	  System.out.println("---------------------------");
	 for(int i=road.length-1;i>=0;i-- )
	 {
		 
	     System.out.println(road[i]);
	}	 
	 System.out.println("---------------------------");
      System.out.println("main ended---------");
}

}