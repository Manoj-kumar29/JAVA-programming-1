class GameUtil{

public static void main(String []a){

GameDTO dto=new GameDTO();
dto.setGameId(1478);
dto.setGameName("Cricket");
dto.setType("Outdoor");

System.out.println(dto);

GameDTO dto1=new GameDTO();
dto1.setGameId(258);
dto1.setGameName("Chess");
dto1.setType("Indoor");

System.out.println(dto1);
}

}