public class GodDTO{
public GodDTO(){
System.out.println("GodDTO object is created");
}

private String godName;
private String location;
private String vehicle;


public void setGodName(String godName){
this.godName=godName;
}
public void setLocation(String location){
this.location=location;
}
public void setVehicle(String vehicle){
this.vehicle=vehicle;
}

@Override
public String toString(){
return"GodDTO - [ godName= "+this.godName+" , location= "+this.location+" , vehicle= "+this.vehicle+"]";
}
}