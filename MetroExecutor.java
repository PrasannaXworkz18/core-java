class MetroExecutor{
	
	public static void main(String args[]){
		
		Metro metro = new Metro(1,9,"nayandahalli","mgroad");
		metro.displayDeatils();
		System.out.println("----------------------------------------------------");
		
		Metro metro1 = new Metro();
		System.out.println(metro1);
		metro.displayDeatils();
	}
	
}
