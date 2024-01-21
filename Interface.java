public class Interface implements Printable {
    @Override
    public void print() {
        System.out.println("Printing...........");
    }
    public static void main(String[] args){
        Interface inter = new Interface();
        inter.print();
    }
}
