class Television{

  static boolean isConnected;
  static int maxVolume=7;
  static int minVolume;
  static int currentVolume;
  
   public static boolean on0roff(){
   
   System.out.println("Start of on0roff");
   
   if(isConnected==false){
	   
	   isConnected = true;
	    System.out.println("Speaker is turned on......Enjoy");
                                     }
									 
   else if(isConnected==true){
	   isConnected = false;
	    System.out.println("Speaker is turned off");
                }
   
    System.out.println("End of on0roff");
	return isConnected;
                                                   }
												   
							public static int increaseVolume(){
								
								System.out.println("Start of increaseVolume");
								
								if(isConnected==true){
									if(currentVolume<maxVolume){
										currentVolume=currentVolume+1;
										System.out.println("volume increased to    " + currentVolume);
									                                              }
									else{
										System.out.println("Max Volume Reached");
									      }
								                                }
								else{
									System.out.println("Please turn on your system");
								      }
								
								System.out.println("End of increaseVolume");
								return currentVolume;
								
								                                           } 		

							public static int decreaseVolume(){
								
								System.out.println("Start of decreasing Volume");
								
								if(isConnected==true){
									if(currentVolume>minVolume){
										currentVolume=currentVolume - 1;
										System.out.println("volume decreased to    " + currentVolume);
									                                              }
									else{
										System.out.println("Min Volume Reached");
									      }
								                                }
								else{
									System.out.println("Please turn on your system");
								      }
								
								System.out.println("End of decreasing Volume");
								return currentVolume;
								
								                                           } 	
                  }