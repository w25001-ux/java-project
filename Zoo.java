public class Zoo {
    public static void main(String[]args){
        Animal a1 = new Lion("Lion",  "baba","肉", "ガオー");
        a1.sound();
        a1.printPay(600, 12);
        System.out.println();

        Animal a2 = new Elephant("Elephant", "momo", "砂糖キビ", "パオーン");
        a2.sound();
        a2.printPay(600, 20);
        System.out.println();

        Animal a3 = new Bird("Bird", "sora", "昆虫", "キキー");
        a3.sound();
        a3.printPay(600,10);
    }
}
interface Zooo{
    void printPay(int price, int old);
}
interface Flyable{
    void printFly();
}
abstract class Animal implements Zooo{
    private String name;
    private String eat;
    public Animal(String name, String eat){
        this.name = name;
        this.eat = eat;
    }
    public String getName(){
        return name;
    }
    public String getEat(){
        return eat;
    }
    void printName(String name){
        System.out.println("名前: " + name);
    }
    abstract void sound();
}
class Lion extends Animal{
    private String type;
    private String sound;
    public Lion(String type, String name, String eat, String sound){
        super(name, eat);
        this.sound = sound;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String getSound(){
        return sound;
    }
    public void sound(){
        System.out.println("種類: " + getType());
        printName(getName());
        System.out.println("食べ物: " + getEat());
        System.out.println("鳴き声: " + getSound());
    }
    public void printPay(int price, int old){
        if(old <= 12){
            System.out.println("入場料金: " + price + "yen");
        }else{
            System.out.println("入場料金: " + "1000yen");
        }
    }
}
class Elephant extends Animal{
    private String type;
    private String sound;
    public Elephant(String type, String name, String eat, String sound){
        super(name, eat);
        this.sound = sound;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String getSound(){
        return sound;
    }
    void sound(){
        System.out.println("種類: " + getType());
        printName(getName());
        System.out.println("食べ物: " + getEat());
        System.out.println("鳴き声: " + getSound());
    }
    public void printPay(int price, int old){
        if(old <= 12){
            System.out.println("入場料金: " + price + "yen");
        }
        else{
            System.out.println("入場料金: " + "1000yen");
        }
    }
}
class Bird extends Animal implements Flyable{
    private String type;
    private String sound;
    public Bird(String type, String name, String eat, String sound){
        super(name, eat);
        this.sound = sound;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String getSound(){
        return sound;
    }
    void sound(){
        System.out.println("種類: " + getType());
        printName(getName());
        System.out.println("食べ物: " + getEat());
        System.out.println("鳴き声: " + getSound());
    }
    public void printFly(){
        System.out.println(".......飛べますよ。");
    }
    public void printPay(int price, int old){
        printFly();
        if(old <= 12){
            System.out.println("入場料金: " + price + "yen");
        }
        else{
            System.out.println("入場料金: " + "1000yen");
        }
    }
}
