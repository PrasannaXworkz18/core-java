class ExamExecutor{

   public static void main(String args[]){
	   
	   HallTicket ticket = new HallTicket(345,"Highway","18CV872","Prasanna","4CA19CV011");
	   	   
	   //HallTicket ticket =null;
	   Exam exam = new Exam();
       exam.fees=1300;

       //has a relationship
       exam.write(ticket);	  
	   
	   	   	   
   }

}