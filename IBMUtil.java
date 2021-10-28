class IBMUtil{

public static void main(String []a){

Mnc mnc=new Mnc();
mnc.name="IBM";
mnc.ceo="Manoj";
mnc.headQuater="Ballari";
mnc.startedYear=1999;
mnc.company="IBM";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();
}

}