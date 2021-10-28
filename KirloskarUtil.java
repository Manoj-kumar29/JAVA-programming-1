class KirlsokarUtil{

public static void main(String []a){

Mnc mnc=new Mnc();
mnc.name="Kirloskar";
mnc.ceo="SharanaBasava";
mnc.headQuater="Kurgod";
mnc.startedYear=1973;
mnc.company="Kirloskar";

String cmp=mnc.getService();
System.out.println(cmp);


mnc.displayMnc();
}



}