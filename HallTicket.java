class HallTicket{

   int ticketId;
   String subName;
   String subCode;
   String candidateName;
   String usn;


    public HallTicket(int ticketId,String subName,String subCode,String candidateName,String usn){
		
		this.ticketId=ticketId;
		this.subName=subName;
		this.subCode=subCode;
		this.candidateName=candidateName;
		this.usn=usn;
				
	                                                                                                                                                }

    public void displayDetails(){
		System.out.println("Hall Ticket Id: "+ticketId);
		System.out.println("Subject Name Is: "+subName);
		System.out.println("Subject Code Is: "+subCode);
		System.out.println("Candidate Name: "+candidateName);
		System.out.println("USN: "+usn);
	                                                                }

}