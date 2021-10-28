class PatientUtil{
public static void main(String []a){

PatientDTO dto=new PatientDTO();
dto.setPatientId(12465);
dto.setPatientName("Subhash");
dto.setAge(23);
dto.setGender("Male");
dto.setAddress("Rajajinagar");
dto.setBloodGroup("AB+");

System.out.println(dto);

PatientDTO dto1=new PatientDTO();
dto1.setPatientId(36987);
dto1.setPatientName("Vinay");
dto1.setAge(22);
dto1.setGender("Male");
dto1.setAddress("VidyaNagar");
dto1.setBloodGroup("AB-");

System.out.print(dto1);

PatientDTO dto2=new PatientDTO();
dto2.setPatientId(12465);
dto2.setPatientName("lohith");
dto2.setAge(23);
dto2.setGender("Male");
dto2.setAddress("Sandur");
dto2.setBloodGroup("A+");
System.out.print(dto2);
}


}