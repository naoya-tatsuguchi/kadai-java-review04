package animal;

public class Animal {
    
    private String Name;
    private int Age;
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    
    public Animal(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
    
    public void say() {
        System.out.println(Name + "です。" + Age + "歳です。");
    }
    

}
