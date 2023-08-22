class Factorial{

  public static void main(String args[]){

/*int dummy=1;
int factnumber=5;
for (int factnum=1;factnum<=factnumber;factnum++)
{
    dummy=dummy*factnum;
}	
	
   System.out.println("factorial of  "+ factnumber +" is "+dummy);	
	
                                                        }
                    } */
					System.out.println("Main Started");
					getFact(4);
					getFact(5);
					getFact(6);
					getFact(7);
					System.out.println("Main Ended");
					}
					public static void getFact(int factNumber){
							System.out.println("getFact Started");
						int fact=1;
						for(int n=1;n<=factNumber;n++)
						{
							fact=fact*n;
						}
						System.out.println("The Factorial of" + factNumber + "    is    " + fact);
							System.out.println("getFact Ended");
					}
			
			}