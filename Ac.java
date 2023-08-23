class Ac{

   static  boolean isConnected;
   static int maxVolume=10;
   static int currentVolume;
   static int minVolume;
   
   
  public static boolean onOroff(){
	  
  System.out.println("Start of onOroff");
  
  if(isConnected==false){
	  isConnected=true;
	  System.out.println("System Turned On.....Enjoy");
                                     }
									 
  else if(isConnected==true){
	  isConnected=false;
	  System.out.println("System Turned Off");
                                          }
										  
  System.out.println("End of onOroff");
  return isConnected;
                                                               }
															   
								public static int increaseVolume(){
									
								System.out.println("Start Of Increasing Volume");
									
									if(isConnected==true){
										
										if(currentVolume<maxVolume){
											currentVolume=currentVolume+1;
											System.out.println("Your System Volume is Increased To  " + currentVolume);
										                                             }
										else{
											System.out.println("You Are Reached Maximum Volume");
										       }
										                              }
								      else{
										  System.out.println("Please Turned On Your Device");
									        }	
											
                                 System.out.println("End Of Increasing Volume");		
                                 return currentVolume;							 
								                                                }							   
															   
															   public static int decreaseVolume(){
																   
																   System.out.println("Start Of Decreasing Volume");	
																   
																   if(isConnected==true){
																	   
																	   if(currentVolume>minVolume){
																		   currentVolume = currentVolume-1;
																		   System.out.println("Volume Is Decreased To  " + currentVolume);	
																	                                               }
																		else{
																			System.out.println("You Are Reached Minimum Volume");	
																		       }
																                                    }
																									
																									else{
																										System.out.println("Please Turned On Your Device");
																									       }
																   	   
																   System.out.println("End Of Decreasing Volume");	
																   return currentVolume;
															                                                    }							   

}