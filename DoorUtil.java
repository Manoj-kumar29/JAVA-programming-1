class DoorUtil{

static{

System.out.println("static block is started");
}
public static void main(String []a){
System.out.println("main method started");
Door door=new Door();
System.out.println(door);
}
}