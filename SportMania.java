class SportMania{
	
static String topTenCricketBatsman[] = {"Virat Kohli" , "Rohit Sharma" , "Shubman Ghill" , "SKY" , "Ishan Kishan" , "AB De Villeirs" , "Maxwell" , "Faf Du Plesis" , "MS Dhoni" , "Gayakwad"};

static String topTenCricketTeams[] = {"RCB" , "RR" , "CSK" , "DC" , "SHR" , "KNR" , "MI" , "GT" , "LSG" , "PK"};	

static String topTenTennisPlayers[] = {"Alcaraz" , "Djokovic" , "Medvedev" , "Tsitsipas" , "Ruud" , "Rune" , "Sinner" , "Fritz" , "Tiafoe" , "Auger-Aliassime"};

static String topTenCricketBowlers[] = {"Yuzvendra Chahal" , "Dwayne Bravo" , " Piyush Chawla " , "Amit Mishra" , " Ravichandran Ashwin" , "Lasith Malinga " , "Bhuvneshwar Kumar" , "Sunil Narine " , "Ravindra Jadeja" , "Harbhajan Singh"};

public static void main(String args[]){
	
System.out.println("Main Started");


    System.out.println("-------------------------------------------------");

for (int index = 0; index<topTenCricketBatsman.length;index++)
{
	
   System.out.println(topTenCricketBatsman[index]);
}
   for(int index=topTenCricketBatsman.length-1 ;index>=0;index--)
	  {
		System.out.println(topTenCricketBatsman[index]);
	  }
    System.out.println("-------------------------------------------------");
	
for (int pk=0;pk<topTenCricketTeams.length;pk++)
{
	System.out.println(topTenCricketTeams[pk]);
}
  for (int pk = topTenCricketTeams.length-1;pk>=0;pk--)
    {
	System.out.println(topTenCricketTeams[pk]);
    }
    System.out.println("-------------------------------------------------");
	
for (int object=0;object<topTenTennisPlayers.length;object++)
{
	System.out.println(topTenTennisPlayers[object]);
}
  for (int object=topTenTennisPlayers.length-1;object>=0;object--)
    {
	System.out.println(topTenTennisPlayers[object]);
    }

    System.out.println("-------------------------------------------------");
	
	for (int spinners=0;spinners<topTenCricketBowlers.length;spinners++)
{
	System.out.println(topTenCricketBowlers[spinners]);
}
   for (int spinners=topTenCricketBowlers.length-1;spinners>=0;spinners--)
    {
	System.out.println(topTenCricketBowlers[spinners]);
    }


    System.out.println("-------------------------------------------------");
	
System.out.println("Main Ended");

                                                   }
                        }