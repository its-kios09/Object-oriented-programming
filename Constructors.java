public class Constructors {
    Constructors(){
        System.out.println("Default Constructor initialized.........");
    }
    Constructors(int age, String name){
        System.out.println("Parameterized Constructor running........");
        System.out.println("Parameters are " + age + name+ "........");

    }
    public static void main(String [] args){
        Constructors cons = new Constructors();
        Constructors cons_p = new Constructors(12, "David Fred");
    }
}
