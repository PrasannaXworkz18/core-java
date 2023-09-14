class CricketTeams{

  String players[] = new String[11];
  int index;

   public boolean addPlayerNames(String playerNames){
	   
	  boolean isAdded=false;
	  
	  if(playerNames!=null){
		  
		  isAdded=true;
		  players[index] = playerNames;
		  index++;
	    
		                                 }
      return isAdded;
	  
                                                                                   }

    public void getPlayerNames(){
		
		for(index=0;index<players.length;index++){
			
			System.out.println(players[index]);
			
		                                                                    }
	                                            }

}