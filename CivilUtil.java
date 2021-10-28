class CivilUtil{

public static void main(String []a){

Engineer eng=new Engineer();
eng.Branch="Civil Engineering";
eng.College="RYMEC";
eng.Place="Bal";
eng.University="VTU";
eng.Dept="Civil";

String cvl=eng.problemSolving();
System.out.println(cvl);

eng.displayDetails();
}

}