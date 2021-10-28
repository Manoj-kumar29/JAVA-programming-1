public class IceCreamDTO{
public IceCreamDTO(){
System.out.println("IceCreamDTO object is created");
}

private long icecreamId;
private String type;
private String name;
private String flavour;

public void setIceCreamId(long icecreamId){
this.icecreamId=icecreamId;
}
public void setType(String type){
this.type=type;
}
public void setName(String name){
this.name=name;
}
public void setFlavour(String flavour){
this.flavour=flavour;
}
@Override
public String toString(){
return "IceCreamDTO - [ icecreamId= "+this.icecreamId+" , type= "+this.type+" , name= "+this.name+" , flavour= "+this.flavour+"]";
}
}