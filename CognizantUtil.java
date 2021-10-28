class CognizantUtil{

public static void main(String []a){

Mnc mnc=new Mnc();
mnc.name="Cognizant";
mnc.ceo="Manjunath";
mnc.headQuater="Banglore";
mnc.startedYear=1960;
mnc.company="Cognizant";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();
}

}