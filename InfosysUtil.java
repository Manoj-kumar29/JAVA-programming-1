class InfosysUtil{

public static void main(String []a){

Mnc mnc=new Mnc();
mnc.name="Infosys";
mnc.ceo="Sharana";
mnc.headQuater="Banglore";
mnc.startedYear=1935;
mnc.company="Infosys";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();
}

}