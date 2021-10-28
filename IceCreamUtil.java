class IceCreamUtil{

public static void main(String []a){

IceCreamDTO dto=new IceCreamDTO();
dto.setIceCreamId(369);
dto.setType("Cup");
dto.setName("Amul");
dto.setFlavour("Vanilla");

System.out.println(dto);

IceCreamDTO dto1=new IceCreamDTO();
dto1.setIceCreamId(1236);
dto1.setType("cone");
dto1.setName("Hanguys");
dto1.setFlavour("BlackCurrent");

System.out.println(dto1);
}

}