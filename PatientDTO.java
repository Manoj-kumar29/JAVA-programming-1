public class PatientDTO{
public PatientDTO(){
System.out.println("PatientDTO object is created");

}

private long patientId;
private String patientName;
private int age;
private String gender;
private String address;
private String bloodGroup;

public long getPatientId(){
  return patientId;
}
public void setPatientId(long patientId){
 this.patientId=patientId;
}
public String getPatientName(){
return patientName;
}
public void setPatientName(String patientName){
this.patientName=patientName;
}
public int getAge(){
return age;
}

public void setAge(int age){
this.age=age;
}
public String getGender(){
return gender;
}
public void setGender(String gender){
this.gender=gender;
}

public String getAddress(){
return address;
}
public void setAddress(String address){
this.address=address;
}

public String getBloodGroup(){
return bloodGroup;
}

public void setBloodGroup(String bloodGroup){
this.bloodGroup=bloodGroup;
}
@Override
public String toString(){
return "PatientDTO - [ patientId= "+this.patientId+" , patientName= "+this.patientName+" , age= "+this.age+" , gender= "+this.gender+" , address= "+this.address+" , bloodGroup= "+this.bloodGroup+"]";
}

}