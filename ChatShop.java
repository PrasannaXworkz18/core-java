class ChatShop{

   String chatNames[] = new String[10];
   int index;
   
   public boolean addChatName(String chatName){
	   
	   boolean isadded = false;
	   
	   if(chatName!=null){
		   
		   isadded=true;
		   chatNames[index] = chatName;
		   index++;
	                                 }
	   return isadded;
	                                                                 	  }

   public void getChatNames(){
	   
	   for(int index=0;index<chatNames.length;index++){
		   
		   System.out.println(chatNames[index]);
	   }
   }

}