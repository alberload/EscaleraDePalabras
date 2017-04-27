/*
 * Crear un metodo que reciba un array de 2 dimensiones y
 * que devuelva un boolean indicando si es una escalera 
 * de palabras o no
 */
package escaleradepalabras;

/**
 *
 * @author Alberto Gil de Dios
 */
public class EscaleraDePalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] matrizCor =  {{'P', 'A', 'T', 'A'},
                               {'R', 'A', 'T', 'A'},
                               {'R', 'O', 'T', 'A'},
                               {'R', 'O', 'P', 'A'},
                               {'R', 'O', 'S', 'A'},
                               {'R', 'O', 'S', 'O'}};

        char[][] matrizInc1 = {{'P', 'A', 'T', 'A'},
                               {'P', 'A', 'T', 'A'},
                               {'R', 'A', 'T', 'A'},
                               {'R', 'O', 'T', 'A'},
                               {'R', 'O', 'S', 'A'},
                               {'R', 'O', 'S', 'O'}};

        char[][] matrizInc2 = {{'P', 'A', 'T', 'A'},
                               {'R', 'A', 'T', 'A'},
                               {'A', 'R', 'T', 'A'},
                               {'R', 'O', 'P', 'A'},
                               {'R', 'O', 'S', 'A'},
                               {'R', 'O', 'S', 'O'}};

        char[][] matrizInc3 = {{'P', 'A', 'T', 'A'},
                               {'R', 'A', 'T', 'A'},
                               {'R', 'O', 'T', 'O'},
                               {'R', 'O', 'P', 'A'},
                               {'R', 'O', 'S', 'A'},
                               {'R', 'O', 'S', 'O'}};

        new EscaleraDePalabras().test(matrizCor);
        new EscaleraDePalabras().test(matrizInc1);
        new EscaleraDePalabras().test(matrizInc2);
        new EscaleraDePalabras().test(matrizInc3);

    }

    public void test(char[][] matriz) {
        System.out.print("Test: ");
        if (new EscaleraDePalabras().comprobarEscalera(matriz) == true) 
        {
            System.out.println("ES ESCALERA");
        } else 
        {
            System.out.println("NO ES ESCALERA");
        }
    }

    public boolean comprobarEscalera(char[][] matriz) 
    {
        int contador = 0;

        for (int y = 1; y < matriz.length; y++) 
        {
            for (int x = 0; x < matriz[y].length; x++) 
            {
                if (matriz[y][x] != matriz[y - 1][x]) 
                {
                    contador++;
                }
            }
            if (contador != 1)
            {
                return false;
            }
            contador = 0;
        }
        return true;
    }

}
