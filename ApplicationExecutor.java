class ApplicationExecutor{

  public static void main (String args[]){
	  
	  Application app = new Application();
	  app.setName("Phonepe");
	  app.setSizeInMb(46.8d);
	  
	  Playstore store = new Playstore();
	  //has-A relationship
	  store.aplication = app;
	  store.managedBy="Google";
	  
	  System.out.println(store.aplication.getName());
	   System.out.println(store.aplication.getSizeInMb());
	   System.out.println(store.managedBy);
	  
	  
	  
	  
	  
	  
	  
	  
  }



















}