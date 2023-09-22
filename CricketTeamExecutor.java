/*class CricketTeamExecutor{

	public static void main(String args []){
	  CricketTeam player = new CricketTeam();
	   player.addPlayerNames("Virat Kholi");
	    player.addPlayerNames("Rohit Sharma");
		 player.addPlayerNames("K L Rahul");
		  player.addPlayerNames("Shikar Davan");
		   player.addPlayerNames("M S Dhoni");
		    player.addPlayerNames("Suresh Raina");
			 player.addPlayerNames("Yuva Raj Singh");
			  player.addPlayerNames("Chahal");
			   player.addPlayerNames("Hardik Pandya");
   	            player.addPlayerNames("Ishana Kishan");
		         player.addPlayerNames("Karun Nayar");
	
				 player.getPlayer();
	
	}


}*/






class CricketTeamExecutor{
 
 public static void main(String args[]){
 
 CricketTeam team = new CricketTeam();
 
 team.addPlayerName("Rohit Sharma   (C)" );
 team.addPlayerName("Shumbman Gill");
 team.addPlayerName("Virat Kohli");
 team.addPlayerName("K L Rahul  (WK)");
 team.addPlayerName("Shreyas Iyer");
 team.addPlayerName("Hardik Pandya");
 team.addPlayerName("Ravindra Jadeja");
 team.addPlayerName("Shardul Thakur");
 team.addPlayerName("Jasprit Bumrah");
 team.addPlayerName("Kuldeep Yadav");
 team.addPlayerName("Mohamad Siraj");
 team.addPlayerName("Mohamad Siraj");
 team.addPlayerName("Mohamad Siraj");
 team.getPlayerNames();
 
  boolean player = team.deleteByName("Hardik Pandya");
 
 }



}