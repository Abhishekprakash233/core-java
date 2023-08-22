class Factorial2{
	public static void main(String fact[]){
		getFact(6);
		getFact(7);
		getFact(5);
	}
public static void getFact(int factNumber[]){
int factNum=1;
for(int n=1; n<=factNumber; n++){
fact=fact*n;
}
System.out.println("The factorial of "+ factNumber+ "is "+fact);
}
}