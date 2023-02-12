public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(6.5, 4.5);
        System.out.println("Length: " + rect.getLength());
        System.out.println("Breadth: " + rect.getBreadth());

        rect.setLength(7.5);
        rect.setBreadth(5.5);

        System.out.println("The new Length: " + rect.getLength());
        System.out.println("The new Breadth: " + rect.getBreadth());
    }
}