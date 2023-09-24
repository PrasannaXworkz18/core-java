class JVMExecutor{

  public static void main(String args[]){
	  
	  JVM reference = new JVM();
	  reference.setId(1);
	  reference.setVersion(20);
	  reference.setName("Java Vertual Machine");
	  reference.setVersionUpdate("Every Six Months");

      Java  java = new Java();
	  java.jvm=reference;
	  java.managedBy="Oracle";

      System.out.println("Id: "+java.managedBy);
	  System.out.println("Id: "+java.jvm.getId());
	  System.out.println("Id: "+java.jvm.getVersion());
	  System.out.println("Id: "+java.jvm.getName());
	  System.out.println("Id: "+java.jvm.getVersionUpdate());


	  
  }

}