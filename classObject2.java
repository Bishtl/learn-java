public class classObject2 {
    public static void main(String[] args) {
        Persons p1 = new Persons();
        p1.age = 21;
        p1.name = "Rohit";


       // p1.walk();
        //p1.dance();

        p1.score(89);
       // System.out.print("My name is "+p1.name +" And i am " +p1.age+" year young");
    }
}

class Persons{
    String name;
    int age;

    // Behaviour
    void walk(){
        System.out.println(name +" is walking " );
    }
    void dance(){
        System.out.println(name + " is dancing");
    }
    void score(int run){
        System.out.println(name + " score " +run + " run");
    }
}