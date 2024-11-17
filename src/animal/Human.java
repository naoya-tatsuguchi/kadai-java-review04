package animal;

public class Human extends Animal implements Thinkable{
    
    private String hobby;
    
    public Human(String Name, int Age, String hobby) {
    super(Name, Age);
    this.hobby = hobby;
    }
    
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
    

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
