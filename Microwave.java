class Microwave{

   static boolean isConnected;
   static int maxVolume=6;
   static int minVolume;
   static int currentVolume;

  public static boolean onOroff(){
  
  System.out.println("Start Of onOroff"); 
  
  if(isConnected==false){
	  isConnected = true;
	  System.out.println("System Turned On....Enjoy Dude"); 
                                    }
									else if(isConnected==true){
										isConnected = false;
										System.out.println("System Turned off"); 
									                                         }

  System.out.println("Start Of onOroff");    
  return isConnected;  
  
                                            }
          
                   public static int increasingVolume(){
					   
					   System.out.println("Start Increasing Volume");
					   
					   if(isConnected==true){
						   
						   if(currentVolume<maxVolume){
							   currentVolume = currentVolume+1;
							   System.out.println("Volume Is Increased To  " + currentVolume); 
						                                               }
						   else{
							   System.out.println("Reached Maximum Volume"); 
						         }											   
						   
					                                    }
														else{
															System.out.println("Please Turn On Device"); 
														      }
															  
						System.out.println("End Increasing Volume");
                        return currentVolume;						
				                                                     }

    public static int decreasingVolume(){
		
		System.out.println("Start Of Decreasing Volume"); 
		
		if(isConnected==true){
			
			if(currentVolume>minVolume){
				currentVolume = currentVolume-1;
				System.out.println("Volume Decresed To  " + currentVolume);
			                                           }
													   
			else{
				System.out.println("Reached Minimum Volume");
			      }										   
			
		                                }
		else{
			System.out.println("Turn On Your Device First");
		      }								
		
		System.out.println("End Of Decreasing Volume");
		return currentVolume;
	                                                  }

                    }