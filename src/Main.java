import products.technic.electric.Microphones;

public class Main {
    public static void main(String[] args) {
        Microphones p = new Microphones(2,200.0);
        System.out.println(p.isCanOutputSound());
    }
}