class ElectricalUtil{

public static void main(String []a){

Engineer eee=new Engineer();
eee.Branch="Electrical Engineering";
eee.College="BITM";
eee.Place="Ballari";
eee.University="VTU";
eee.Dept="Electrical";

String ee=eee.problemSolving();
System.out.println(ee);

eee.displayDetails();
}

}