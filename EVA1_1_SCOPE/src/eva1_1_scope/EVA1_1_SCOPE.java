package eva1_1_scope;

/**
 *
 * @author diegd
 */
public class EVA1_1_SCOPE {

    public static void main(String[] args) {
        int x = 100;// EXISTE DENTRO DEL BLOQUE DEL main()
        for (int i = 0; i < 10; i++) {//EXISTE SOLO EN DENTRO DEL FOR
            System.out.println("i = " + i);
            x++; // VISIBLE DENTRO DEL FOR
        }
        System.out.println("Valor final de la i =  " + i); // YA NO EXISTE 
        System.out.println("Valor final de la i = " + x); // TODAVIA EXISTE
    }

    public static void OtraFuncion() {
        System.out.println("Valor de x " + x); // NO EXISTE
    }

}
