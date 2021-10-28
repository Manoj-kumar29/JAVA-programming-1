class Duster{

private static Duster duster=null;

public static Duster getDuster(){
return duster;

}
static{
duster = new Duster();

}
}