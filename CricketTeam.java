/*class CricketTeam{

	String players[] = new String [12];
      int index;
	  
			boolean addPlayerNames(String player){
				boolean isAdded = false;
				
				if(player!=null){
					if(index < players.length){
					players[index] = player;
					  index++;
				    isAdded = true;
				
				}
				}
				
				return isAdded;
			}
			
			
				public void getPlayer(){
					for(int index =0; index<players.length; index++){
						System.out.println(players[index]);
					}
				}

}*/








class CricketTeam{
String playerNames[] = new String[11];
int i;
public boolean addPlayerName(String playerName){
	boolean isPlayerAdded = false;
	if(i<playerNames.length){
	if(playerName!=null){
		boolean isExists = checkExistsPlayerName(playerName);
		if(isExists==false){
		
		System.out.println("validation is proper..proceed to add playerName");
		playerNames[i++] = playerName;
		isPlayerAdded = true;
		System.out.println(playerName + " added");
	}
	else{
		System.out.println(playerName +" already exists");
	}
	}}else{
		System.out.println("Space is full cannot add data");
	}
	
	
	return isPlayerAdded;
}


public void getPlayerNames(){
			
	for(int i=0;i<playerNames.length;i++){
		
		System.out.println(playerNames[i]);
	}
	
}
public boolean checkExistsPlayerName(String playerName){
	
	boolean isExists = false;
	for(int i=0;i<playerNames.length;i++){
		if(playerNames[i]==playerName){
			isExists = true;
		}
	}
	return isExists;
}







	public boolean deleteByName(String name){
	
				
		boolean isDeleted = false;
	String playersNameAfterDelete [] = new String[playerNames.length -1];
	  int ind =0;
	  
	  
   for(int index =0; index < playerNames.length; index++){
			if(playerNames[index] != name){
				playersNameAfterDelete[ind++] = playerNames[index];
				isDeleted = true;
			}
		}
		getNewplayerNamesAfterDelete(playersNameAfterDelete);
		return isDeleted;
}


 
		public void getNewplayerNamesAfterDelete(String playerNameAfterDelete[]){

			for(int index =0; index < playerNameAfterDelete.length ; index++){
				System.out.println(playerNameAfterDelete[index]);
	 }
	 
}

}