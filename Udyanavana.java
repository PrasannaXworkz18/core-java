class Udyanavana{
	
	String flowers[];
	String name;
	int noOfGates;
	String openingTime;
	String closingTime;
	String rareAnimals;
	
	public Udyanavana(String flowers[],String name,int noOfGates,String openingTime,String closingTime,String rareAnimals){
		this.flowers=flowers;
		this.name=name;
		this.noOfGates=noOfGates;
		this.openingTime=openingTime;
		this.closingTime=closingTime;
		this.rareAnimals=rareAnimals;
		getFlowers(flowers);
		getDisplayDetails();
	}
	
   public void getFlowers(String array[]){
	for(int index=0;index<array.length;index++)
		System.out.print(array[index]);
                                                            }
															
public void getDisplayDetails(){
System.out.println(name+"	"+noOfGates+" "+openingTime+"	"+closingTime+"	"+rareAnimals);
                                             }
}