class MechanicalUtil{

public static void main(String []a){

Engineer mec=new Engineer();
mec.Branch="Mechanical Engineering";
mec.College="BITM";
mec.Place="Ballari";
mec.University="VTU";
mec.Dept="Mechanical";

String me=mec.problemSolving();
System.out.println(me);

mec.displayDetails();
}

}