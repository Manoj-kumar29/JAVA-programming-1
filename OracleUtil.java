class OracleUtil{

static{
System.out.println("static block is started");

}
public static void main(String []a){
System.out.println("main method started");
Oracle oracle=new Oracle();
System.out.println(oracle);
}
}