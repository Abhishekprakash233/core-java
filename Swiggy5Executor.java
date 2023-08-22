class Swiggy5Executor {
public static void main(String foodDelivery[]){
System.out.println("main started");
//className.methodName();	
double price=Swiggy5.search("Pizza");
System.out.println("The price of pizza is "+price);
double priceWithQuantity=Swiggy5.search("Biryani",3);
System.out.println("The price of pizza with quantity3 is "+priceWithQuantity);
priceWithQuantity=Swiggy5.search("Paneer masala",3);
System.out.println("The price of jeera rice with quantity3 is "+priceWithQuantity);
System.out.println("main ended");
}
}