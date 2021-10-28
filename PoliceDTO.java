public class PoliceDTO{
public PoliceDTO(){
System.out.println("PoliceDTO object is created");
}

private String post;
private long salary;
private String location;

public void setPost(String post){
this.post=post;
}
public void setSalary(long salary){
this.salary=salary;
}
public void setLocation(String location){
this.location=location;
}
@Override
public String toString(){
return"PoliceDTO - [ post= "+this.post+" , salary= "+this.salary+" , location= "+this.location+"]";
}
}