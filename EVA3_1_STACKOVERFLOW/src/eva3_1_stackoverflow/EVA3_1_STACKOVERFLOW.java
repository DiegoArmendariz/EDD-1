package eva3_1_stackoverflow;

/**
 * @author diegd
 */
public class EVA3_1_STACKOVERFLOW {

    public static void main(String[] args) {
        A();
    }

    public static void A() {
        B();
    }

    public static void B() {
        int i = 5;
        double d = 5.5;
        A();
    }
}