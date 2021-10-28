class PoliceUtil{
public static void main(String []a){

PoliceDTO dto=new PoliceDTO();
dto.setPost("ACP");
dto.setSalary(30000);
dto.setLocation("District");

System.out.println(dto);

PoliceDTO dto1=new PoliceDTO();
dto1.setPost("DC");
dto1.setSalary(50000);
dto1.setLocation("District");

System.out.println(dto1);

PoliceDTO dto2=new PoliceDTO();
dto2.setPost("SI");
dto2.setSalary(28000);
dto.setLocation("Taluk");

System.out.println(dto2);
}


}