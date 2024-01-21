public class Person extends Employee{
    private int emID;


    @Override
    public void work() {
        if(emID == 0){
            System.out.println("The Employee is not working....");
        }else {
            System.out.println("The Employee is working........");
        }
    }
    public static void main(String[] args){
        Person person = new Person();
        person.Person("Kamau", "Male");

    }
}
