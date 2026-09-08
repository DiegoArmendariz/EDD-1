
package eva1_6_arreglos;

/**
 
 * @author diegd
 */
public class EVA1_6_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int[100000000];// 4GB
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
        }
    }
    
}
