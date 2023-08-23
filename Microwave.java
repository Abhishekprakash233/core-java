class Microwave{


static int MaxTemp = 100;
static int MinTemp ;
static int currentTemp;
static boolean isPower;
static boolean isemty;
public static boolean plug()
{
  if( isPower == false)
     {
       isPower = true;
       System.out.println(" InductionStove is turned ON");
     }
  else if( isPower == true)
  {
   isPower = false;
   System.out.println(" InductionStove is turned OFF");
  }
return isPower;

}
public static boolean empty()
{
  if( isemty == false)
     {
       isemty = true;
       System.out.println(" No Problem");
     }
  else if( isemty == true)
  {
   isemty = false;
   System.out.println(" Keep something on oven");
  }
return isemty;

}

public static void pushPlus(){
if(isPower == true){
  if(isemty == true){
  if(currentTemp < MaxTemp){
   currentTemp= currentTemp +200;
   System.out.println(" Temperature is :"+currentTemp);
  }
  else{
  System.out.println(" Can not Increase Temperature");
  }
}
else{
	System.out.println(" There is nothing on the oven");
}
}
 else{
 System.out.println(" Check the power ");
 }
}

public static void pushMinus(){
if(isPower == true){
if(isemty == true){
  if(currentTemp > MinTemp){
   currentTemp = currentTemp-200;
   System.out.println(" Temperature is :"+currentTemp);
  }
  else{
  System.out.println(" Can not decrease Temperature");
  }
}
else{
	System.out.println(" There is nothing on the oven");
}}
 else{
 System.out.println(" Check the power again ");
 }





}}