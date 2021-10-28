class AccentureUtil{

public static void main(String []a){

Mnc mnc=new Mnc();
mnc.name="Accenture";
mnc.ceo="Goutham";
mnc.headQuater="Banglore";
mnc.startedYear=1959;
mnc.company="Accenture";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();
}

}