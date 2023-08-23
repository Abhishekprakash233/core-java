class Ac{

  static boolean isConnected;
  static int maxTemperature=30;
  static int currentTemperature;
  static int minTemperature;
  
  
   public static boolean onOrOf(){ 
  
  System.out.println("inside onOrOf");
  
  if (isConnected==false)
  {
  isConnected = true;
  System.out.println("the Ac is turned on");
  }
  else if (isConnected==true)
  {
  isConnected=false; 
  System.out.println("the Ac is turned off");
  }
  System.out.println("end of onOrOf");
  return isConnected;
}
  
  public static void increaseTemperature(){
  System.out.println("start of increaseTemprature");
  if (isConnected==true){
		if (currentTemperature<maxTemperature){
			currentTemperature=currentTemperature+1;
			System.out.println("curerent temprature is "+currentTemperature);
			}
			else{
				System.out.println("reached maxTemperature");
				}
	}
	else
	{
	   System.out.println("on the ac");
  }  
}
  public static void decreaseTemperature(){
	System.out.println("start of decreaseTemperature ");
	if (isConnected==true){
		if (currentTemperature>minTemperature){
			currentTemperature=currentTemperature-1;
			System.out.println("curerent volume is "+currentTemperature);
			}
			else{
				System.out.println("Temperature is zero ");
				}
	}
	else
	{
	   System.out.println("on the ac");
  }  
}
  
  
  
  
  

}