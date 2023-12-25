import java.util.Scanner;

public class ObjectInJava_2 extends ObjectInJava {
    public static void main(String[] args){
        ObjectInJava dog = new ObjectInJava();
        Scanner dog_input = new Scanner(System.in);

        System.out.print("What is your dog name:- ");
        dog.dog_name = dog_input.nextLine();

        System.out.print("What is your dog breed:- ");
        dog.dog_breed = dog_input.nextLine();

        System.out.print("What is your dog age:- ");
        dog.dog_age = dog_input.nextInt();

        dog_input.nextLine();

        System.out.print("What you command your dog understands:- ");
        String attack = dog_input.nextLine();

        if("attack".equals(attack)){
            String name = dog.dog_name;
            int age = dog.dog_age;
            String breed = dog.dog_breed;
            System.out.print("My dog\'s name is:- " + name + "is a " + breed + "aged" + age + "\n");
            String.valueOf(dog.bark_Dog());


        }



    }
}
