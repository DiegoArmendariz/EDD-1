package eva1_5_parametros;

/**
 *
 * @author diegd
 */
public class EVA1_5_PARAMETROS {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("Valor de i = " + i);
        incrementar(i);
        System.out.println("Valor de i (despues de incrementar) = " + i);
        //Ahora paso por referencia
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba.y = " + i);
        incrementarObj(prueba);
        System.out.println("Valor de prubea.y (despues de incrementar) = " + prueba.y);
    }

    public static void incrementar(int valor) {//PASO POR VALOR (RECIBO UNA COPIA) 
        valor++;
    }

    public static void incrementarObj(Prueba objeto) {//PASO POR REFERENCIA
        objeto.y++;
    }

}

class Prueba {

    int y = 5;
}
