class CsUtil{

public static void main(String []a){

Engineer cse=new Engineer();
cse.Branch="Computer Engineering";
cse.College="BITM";
cse.Place="Ballari";
cse.University="VTU";
cse.Dept="Electrical";

String cs=cse.problemSolving();
System.out.println(cs);

cse.displayDetails();
}
}