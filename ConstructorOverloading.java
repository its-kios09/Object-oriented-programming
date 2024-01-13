public class ConstructorOverloading {
    int age;
    String name;
    int dateOfBirth;

    ConstructorOverloading(int i, String n){
        this.age = i;
        this.name = n;
    }
    ConstructorOverloading(int i, String n, int j){
        this.age = i;
        this.name = n;
        this.dateOfBirth = j;
    }
    void displayPerson(){
        System.out.println("My name is:- " + name + " aged:- " + age + " date of birth:- " + dateOfBirth);
    }
    public static void main(String [] args){
        ConstructorOverloading obj = new ConstructorOverloading(12, "Java Programming");
        ConstructorOverloading obj1 = new ConstructorOverloading(23, "Programmer", 23);
        obj.displayPerson();
        obj1.displayPerson();
    }
}
