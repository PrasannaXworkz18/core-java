class Hotel{
	
	String menu[] = new String[10];
	int index;
	
	public boolean addMenuItems(String foodNames){
		
		boolean isAdded = false;
		
		if(foodNames!=null){
			isAdded=true;
			menu[index]=foodNames;
			index++;
			
		                                }
		return isAdded;
	                                                       
	                                                                           }
	
	public void getMenuItem(){
		
		for(int index=0;index<menu.length;index++){
			
			System.out.println(menu[index]);
		
		                                                                       }
	
	                                          }
	
	}