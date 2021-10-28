class TcsUtil{

public static void main(String []a){

Mnc mnc=new Mnc();
mnc.name="Tcs";
mnc.ceo="Dhruvin";
mnc.headQuater="Banglore";
mnc.startedYear=1955;
mnc.company="Tcs";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();
}

}