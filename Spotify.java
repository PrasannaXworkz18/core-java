class Spotify{

  String SongNames[] = new String[11];
  int index;
  
  public boolean addSongs(String songNames){
	  
	  boolean isadded = false;
	  
	  if(songNames!=null){
		  
		  isadded=true;
		  SongNames[index] = songNames;
		  index++;
		  
	                                  }
	  return isadded;
	  
                                                        }

      public void getSongs(){
		  
		  for(int index=0;index<SongNames.length;index++){
			  
			  System.out.println(SongNames[index]);
		  
		                                                                            }
		  
	                                    }

}