public class GameDTO{
public GameDTO(){
System.out.println("GamesDTO object is created");

}

private long gameId;
private String gameName;
private String type;

public void setGameId(long gameId){
this.gameId=gameId;
}
public void setGameName(String gameName){
this.gameName=gameName;
}
public void setType(String type){
this.type=type;
}
@Override
public String toString(){
return"GameDTO - [ gameID= "+this.gameId+" , gameName= "+this.gameName+" , type= "+this.type+"]";
}
}