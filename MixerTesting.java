class MixerTesting{

public static void main(String arg[]){

Mixer.button();
int speed = Mixer.switchToRight();
System.out.println(" Right switch Speed is : "+speed);

 speed = Mixer.switchToRight();
System.out.println(" Right switch Speed is : "+speed);
 
 speed = Mixer.switchToRight();
System.out.println(" Right switch Speed is : "+speed);

 speed = Mixer.switchToRight();
System.out.println(" Right switch Speed is : "+speed);
 int speed1 = Mixer.switchToleft();
System.out.println(" Left switch Speed is : "+speed1);
Mixer.button();
 speed = Mixer.switchToRight();
System.out.println(" Right switch Speed is : "+speed);
 speed1 = Mixer.switchToleft();
System.out.println(" Left switch Speed is : "+speed1);
}

}