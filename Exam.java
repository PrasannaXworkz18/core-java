class Exam{

//instance variable
    HallTicket ticket;
	int fees;

   public boolean write(HallTicket ticket){

       boolean isAllowed=false;
    
	  if(fees>=1200){
		  System.out.println("Your Fees Is Cleared....");
	                           
	  
	  if(ticket!=null){
		  System.out.println("Please Collect Hall Ticket.....");
		  this.ticket=ticket;
		  this.ticket.displayDetails();
		  System.out.println("Hall Ticket Details Are Found...Proceed To Write Exam");
		  isAllowed=true;
	                         }
	  else{
		  System.out.println("Hall ticket Details Not Found");
	         }
	                         }
	  else{
		  System.out.println("Please Pay Fees First....");
	       }
	  
		   return isAllowed;
                                                       }

} 