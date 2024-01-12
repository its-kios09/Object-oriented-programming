public class JavaClasses {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void main(String [] args){
        JavaClasses person = new JavaClasses();
        person.setName("Fredrick");
        System.out.println("Hello " + person.getName());
    }
}
