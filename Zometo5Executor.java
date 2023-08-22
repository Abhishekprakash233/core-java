class Zometo5Executor {
public static void main(String foodDelivery[]){
System.out.println("main started");
//className.methodName();	
double price=Zometo5.search("Pizza");
System.out.println("The price of pizza is "+price);
double priceWithQuantity=Zometo5.search("Biryani",3);
System.out.println("The price of  biryani quantity3 is "+priceWithQuantity);
priceWithQuantity=Zometo5.search("Paneer masala",3);
System.out.println("The price of paneer masala with quantity3 is "+priceWithQuantity);
System.out.println("main ended");
}
}