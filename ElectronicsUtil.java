class ElectronicsUtil{

public static void main(String []a){

Engineer ece=new Engineer();
ece.Branch="Electronics Engineering";
ece.College="BITM";
ece.Place="Ballari";
ece.University="VTU";
ece.Dept="Electronics";

String ec=ece.problemSolving();
System.out.println(ec);

ece.displayDetails();
}

}