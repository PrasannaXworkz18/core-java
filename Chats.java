/*class Chats{
	String chatsNames[] = new String [10];
	int index;
	
	
	
		public boolean addChatsNames(String chatsName){
			boolean isAdded = false;
			
			if(chatsName!=null){
				chatsNames[index] = chatsName;
				index++;
				isAdded = true;
				
			}
			
			return isAdded;
			
		}
		
		
			public void getChatsNames(){
				for(int index =0; index<chatsNames.length; index++){
					System.out.println(chatsNames[index]);
				}
				
			}

}*/




//Another Method.......

 

/*class Chats{
	String chatsNames[] = new String [10];
	int index;
	
	
	
		
			public void getChatsNames(){
				for(int index =0; index<chatsNames.length; index++){
					System.out.println(chatsNames[index]);
				}
				
			}

}*/




class Chats{

String chatNames[]= new String[11];
int index;
public boolean addChatName(String chatName){
 System.out.println("inside addChatName()");
 
 boolean isAdded = false;
 if(index<chatNames.length){
 if(chatName != null){
	 boolean isExists = existsChatName( chatName);
	if(isExists==false){
	
	System.out.println("validation is proper..proceed to add chat");
	chatNames[index] = chatName;
	index++;
	isAdded = true;
	System.out.println(chatName +  " is added sucessfully  ");
 }
 
 else{
	 
	 System.out.println(chatName  + " is already exists");
 }
 }
 }else{
	 System.out.println("no space to add chats");
 }
 
return isAdded;
}



public void getChatNames(){
	System.out.println("The chatName lists are");
	for(int index=0;index<chatNames.length;index++){
		
		System.out.println(chatNames[index]);
	}
}
public boolean existsChatName(String chatName){
	
	boolean isExists = false;
	for(int index=0;index<chatNames.length;index++){
		
		if(chatNames[index]==chatName)
			isExists=true;
	}
	return isExists;
}






	public boolean getDelete(String name){
		boolean isDeleted = false;
		String afteerDelete [] = new String [chatNames.length -1];
		int ind =0;
		
			for(int index =0; index < chatNames.length; index++){
				if(chatNames[index] != name){
					 afteerDelete [ind++] = chatNames[index];
					 isDeleted = true;
				}
			
				
			}
			 getNewChatsNamesAfterDelete( afteerDelete);
			 
			 return isDeleted;
	}
		public void getNewChatsNamesAfterDelete(String afteerDelete[]){
		for(int index =0; index < afteerDelete.length; index++){
			System.out.println(afteerDelete[index]);
		}
	}
}