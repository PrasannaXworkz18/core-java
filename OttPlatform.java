//create operation

class OttPlatform{
	
    String movieNames [] = new  String [4];
    int index;
   
    public boolean addMovieName(String movieName){
		
		System.out.println("Inside AddMovieName()");
		
		boolean isAdded = false;
		if(movieName!=null){
			
			
			System.out.println("Validation is proper..proceed to add Movie name");
			
			isAdded = true;
			movieNames[index] = movieName;
			index++;
		}
		return isAdded;
		
	}
	
	public void getMovieName(){
		
		for( int index=0;index<movieNames.length;index++)
			System.out.println(movieNames[index]);
	}


	}





