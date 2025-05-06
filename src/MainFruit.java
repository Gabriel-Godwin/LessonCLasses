public class MainFruit {
    public static void main(String[] args) {
        Fruits f;
        f = new Mango();
        f.sweet();
        f.arroma();

        Pineapple pineapple = new Pineapple();
        System.out.println(pineapple.sweet());
    }
}
