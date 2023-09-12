class Library{

  int id;
  String name;
  String librarianName;
  int noOfBooks;
  String timing;

         public Library(int id , String name , String librarianName , int noOfBooks , String timing){
			 
			this.id = id ;
			this.name =name;
			this.librarianName =librarianName ;
			this.noOfBooks =noOfBooks;
			this.timing =timing;
		                                                                                                                                     }
																																			 
    public void getdisplay(){
		
		System.out.println("The Library Id is:  " +this.id);
		System.out.println("The Library Name is:  " +this.name);
		System.out.println("The Librarian Name  is:  " +this.librarianName);
		System.out.println("The Number Of Number Of Books In Library:  " +this.noOfBooks);
		System.out.println("Timing In Library:  " +this.timing);
	
	                                   }

}