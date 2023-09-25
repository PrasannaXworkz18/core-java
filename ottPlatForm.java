/*class ottPlatForm{
	String movieNames[] = new String [5];
	 int index;
	 
	 
  // creat / add / save
	public boolean addMovieName(String movieName){
		
				boolean isAdded = false;
				 if(index<movieNames.length){
					if(movieName!= null){
						
				boolean good = checkIfMovieNameExists(movieName);
		      if(good == false){

       System.out.println("Movie Name Correct Please add Movie Name... ");			  
			
				
			 //movieNames[0]= "Shhhh.....";
			 movieNames[index] = movieName;
			 index++;
			 isAdded = true;
			 				  
			 System.out.println(movieName  + "is added Succesfully");
		 }
		 
				 }
				 }
		 
		 else{
			 System.out.println(movieName + "Movie Name is Allready Existed..");
		 }
				 
		 return isAdded;
	}
	
	
	
	
	
	
	//Read 
	
			public void getMovies(){
				for(int index = 0; index < movieNames.length; index++){
					System.out.println(movieNames[index]);
					
				}
				
			}
			
			
				public boolean checkIfMovieNameExists(String movieName){
					boolean good = false;
					for(int index=0; index<movieNames.length; index++){
						
					if(movieNames[index]==movieName){
					 good =true;
					
					}
					
					}
					return good;
					
					
					
				}



}*/





//Delete Operation.
//-----------------------------------------------------------


class ottPlatForm{
	String movieNames[] = new String [6];
	 int index;
	 
	 
  // creat / add / save
	public boolean addMovieName(String movieName){
		
				boolean isAdded = false;
				
				 if(index<movieNames.length){
					if(movieName!= null){
						
				boolean yake = checkIfMovieNameExists(movieName);
		      if( yake== false ){

       System.out.println("Movie Name Correct Please add Movie Name... ");			  
			
				
			 //movieNames[0]= "Shhhh.....";
			 movieNames[index] = movieName;
			 index++;
			 isAdded = true;
			 				  
			 System.out.println(movieName  + "is added Succesfully");
		 }
		 
				 }
				 }
		 
		 else{
			 System.out.println(movieName + "Movie Name is Allready Existed..");
		 }
				 
		 return isAdded;
	}
	
	
	
	
	
	
	//Read 
	
			public void getMovies(){
				for(int index = 0; index < movieNames.length; index++){
					System.out.println(movieNames[index]);
					
				}
				
			}
			
			
				public boolean checkIfMovieNameExists(String movieName){
					boolean good = false;
					for(int index=0; index<movieNames.length; index++){
						
					if(movieNames[index]==movieName){
					 good =true;
					
					}
					
					}
					return good;
					
					
					
				}
				
				//Delete Operation
				
	public boolean deleteByName(String name){
	
				
		boolean isDeleted = false;
	String movieNameAfterDelete [] = new String[movieNames.length -1];
	  int ind =0;
	  
	  
   for(int index =0; index < movieNames.length; index++){
			if(movieNames[index] != name){
				movieNameAfterDelete[ind++] = movieNames[index];
				isDeleted = true;
			}
		}
		getNewMovieNamesAfterDelete(movieNameAfterDelete);
		return isDeleted;
}


 
		public void getNewMovieNamesAfterDelete(String movieNameAfterDelete[]){

			for(int index =0; index < movieNameAfterDelete.length ; index++){
				System.out.println(movieNameAfterDelete[index]);
	 }
	 
}


}

























































/*class ottPlatForm{
	String movieNames[] = new String [5];
	 int index;
	 
	 
  // creat / add / save
	public boolean addMovieName(String movieName){
		
				boolean isAdded = false;
				 if(index<movieNames.length){
					if(movieName!= null){
						
				boolean good = checkIfMovieNameExists(movieName);
		      if(good == false){

       System.out.println("Movie Name Correct Please add Movie Name... ");			  
			
				
			 //movieNames[0]= "Shhhh.....";
			 movieNames[index] = movieName;
			 index++;
			 isAdded = true;
			 				  
			 System.out.println(movieName  + "is added Succesfully");
		 }
		 
				 }
				 }
		 
		 else{
			 System.out.println(movieName + "Movie Name is Allready Existed..");
		 }
				 
		 return isAdded;
	}
	
	
	
	
	
	
	//Read 
	
			public void getMovies(){
				for(int index = 0; index < movieNames.length; index++){
					System.out.println(movieNames[index]);
					
				}
				
			}
			
			
				public boolean checkIfMovieNameExists(String movieName){
					boolean good = false;
					for(int index=0; index<movieNames.length; index++){
						
					if(movieNames[index]==movieName){
					 good =true;
					
					}
					
					}
					return good;
					
					
					
				}



}*/





//Delete Operation.
//-----------------------------------------------------------


class ottPlatForm{
	String movieNames[] = new String [6];
	 int index;
	 
	 
  // creat / add / save
	public boolean addMovieName(String movieName){
		
				boolean isAdded = false;
				
				 if(index<movieNames.length){
					if(movieName!= null){
						
				boolean yake = checkIfMovieNameExists(movieName);
		      if( yake== false ){

       System.out.println("Movie Name Correct Please add Movie Name... ");			  
			
				
			 //movieNames[0]= "Shhhh.....";
			 movieNames[index] = movieName;
			 index++;
			 isAdded = true;
			 				  
			 System.out.println(movieName  + "is added Succesfully");
		 }
		 
				 }
				 }
		 
		 else{
			 System.out.println(movieName + "Movie Name is Allready Existed..");
		 }
				 
		 return isAdded;
	}
	
	
	
	
	
	
	//Read 
	
			public void getMovies(){
				for(int index = 0; index < movieNames.length; index++){
					System.out.println(movieNames[index]);
					
				}
				
			}
			
			
				public boolean checkIfMovieNameExists(String movieName){
					boolean good = false;
					for(int index=0; index<movieNames.length; index++){
						
					if(movieNames[index]==movieName){
					 good =true;
					
					}
					
					}
					return good;
					
					
					
				}
				
				//Delete Operation
				
	public boolean deleteByName(String name){
	
				
		boolean isDeleted = false;
	String movieNameAfterDelete [] = new String[movieNames.length -1];
	  int ind =0;
	  
	  
   for(int index =0; index < movieNames.length; index++){
			if(movieNames[index] != name){
				movieNameAfterDelete[ind++] = movieNames[index];
				isDeleted = true;
			}
		}
		getNewMovieNamesAfterDelete(movieNameAfterDelete);
		return isDeleted;
}


 
		public void getNewMovieNamesAfterDelete(String movieNameAfterDelete[]){

			for(int index =0; index < movieNameAfterDelete.length ; index++){
				System.out.println(movieNameAfterDelete[index]);
	 }
	 
}


}