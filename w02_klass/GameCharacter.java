public class GameCharacter {
    private int x;
    private int y;

    public String name;
    private String secret = "Top Secret";

    private GameCharacterType gameCharacterType;

    public GameCharacter(String name, GameCharacterType gameCharacterType){
        this.name = name;

        this.x = (int) (Math.random() * 30);
        this.y = (int) (Math.random() * 30);
    }
    public String getSecret(){
        return secret;
    }

    public void setSecret(String secret){
        this.secret = secret;
    }

    public int[] getXY(){
        return new int[]{x,y};
    }

    @Override
    public String toString(){
        return "My name is "+name+" and I am at x "+x+" and y "+y;
    }
}
