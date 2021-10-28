class LaptopUtil{

public static void main (String []a){

Dell dell=new Dell();
dell.price=45000.00;
dell.processor="Intel";
dell.storage="1Tb";
dell.modelNo="Ins350";
String store = dell.store();
System.out.println(store);
dell.displayDetails();
}

}