class ToyotaUtil{

public static void main(String []a){

Mnc mnc=new Mnc();
mnc.name="Toyota";
mnc.ceo="Prakash";
mnc.headQuater="Kartigi";
mnc.startedYear=1989;
mnc.company="Toyota";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();
}


}