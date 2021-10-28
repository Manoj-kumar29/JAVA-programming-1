class Technology{

public Technology(){
System.out.println("constructor is called");
System.out.println(this.getClass().getSimpleName()+" object is created");
}
{
System.out.println("constructor is called");
System.out.println(this.getClass().getSimpleName()+" object is created");
}

static{
System.out.println("static block is executed");
}
{
System.out.println("init block is executed");
}
}