class SensorsExecuter{
	
	
	public static void main(String args[]){
		
		Sensors sense = new Sensors();
		sense.sensorId=1;
		sense.sensorType="motion sensor";
		sense.sensorSupply="220 volts";
		sense.sensorMount="wall mount";
		sense.sensorPrice=3000;
		sense.sensorworksornot=false;
		
		sense.sensorCondition1();
		System.out.println("The sensor id is "+sense.sensorId);
		System.out.println("The sensor Type is "+sense.sensorType);
		System.out.println("The sensor Supports the voltage of  "+sense.sensorSupply);
		System.out.println("The sensor is adjusted in the type of  "+sense.sensorMount);
		System.out.println("The sensor price is "+sense.sensorPrice);
		System.out.println("The sensor works or not "+sense.sensorworksornot);
		
		sense.sensorCondition2();
		
		Sensors sense1 = new Sensors();
		
		sense1.sensorId=2;
		sense1.sensorType="Light sensor";
		sense1.sensorSupply="220 volts";
		sense1.sensorMount="Floor Mount";
		sense1.sensorPrice=4000;
		sense1.sensorworksornot=true;
		
		sense.sensorCondition1();
		System.out.println("The sensor id is "+sense1.sensorId);
		System.out.println("The sensor Type is "+sense1.sensorType);
		System.out.println("The sensor Supports the voltage of  "+sense1.sensorSupply);
		System.out.println("The sensor is adjusted in the type of  "+sense1.sensorMount);
		System.out.println("The sensor price is "+sense1.sensorPrice);
		System.out.println("The sensor works or not "+sense1.sensorworksornot);
		
		sense.sensorCondition2();
	

		
		
		
		
		
		
		
		
		
		
	}
}