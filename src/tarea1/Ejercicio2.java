package tarea1;

import java.util.Scanner;

/**
 * Ejercicio 2. Uso de cadenas.
 *
 * @author Baños Saldaña, María José
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        //No existen variables constantes en este ejercicio.
        
        // Variables de entrada
        char letraGrupo; //Letra introducida por el usuario.
        String cadenaOriginal = " Don Quijote de la Mancha "; //Cadena de texto original.
        
        // Variables de salida
        String cadenaResultante; //Variable que determina la cadena resultante en cada apartado.
        int longitudCadena; //Variable que determina longitud de la cadena resultante en el apartado 5.
        char caracterCentral; //Variable que determina el carácter que se encuentra en la posición central de la cadena resultante en el apartado 6.
        String contieneM; //Variable que comprueba si la cadena contiene o no el carácter 'M'.
        String terminaEnConsonante; //Variable que determina si la cadena final obtenida termina o no en consonante.
        
        // Variables auxiliares
        int posicionCentral; //Variable que determina la posición central de la cadena resultante en el apartado 6.
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        System.out.println("USO DE CADENAS DE CARACTERES");
        System.out.println("----------------------------");
        System.out.print("Introduzca la letra del grupo al que perteneces: ");
        letraGrupo = teclado.next().charAt(0); //Lee el próximo char que el usuario introduzca en pantalla.
        System.out.print("Cadena original: " + cadenaOriginal);
        System.out.println();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //1. Eliminamos los espacios al principio y al final de la cadena original.
        //Para ello, utilizaremos el método substring​(int beginIndex, int endIndex).
        cadenaResultante = cadenaOriginal.substring(1, cadenaOriginal.length() - 1);
        
        //2. Eliminamos "Don Quijote" de la cadena que hemos obtenido en el anterior apartado.
        //Para ello, utilizaremos el método substring​(int beginIndex, int endIndex).
        cadenaResultante = cadenaResultante.substring(11);

        //3. Sustitumos el carácter M de la palabra Mancha por el carácter L en la cadena resultante obtenida en el apartado anterior.
        //Para ello, utilizaremos el método replace(char oldChar, char newChar).
        cadenaResultante = cadenaResultante.replace('M', 'L');
        
        //4. Añadimos un guión seguido del carácter con la letra del grupo al que pertenecemos sin utilizar métodos.
        cadenaResultante = cadenaResultante + "-" + letraGrupo;
        
        //5. Obtenemos la longitud de la cadena resultante al aplicar las operaciones anteriores.
        //Para ello, utilizaremos el método legnth().
        longitudCadena = cadenaResultante.length();
        
        //6. Obtenemos el carácter que se encuentra en la posición central de la cadena resultante al aplicar las operaciones anteriores.
        //Para ello, dividimos por la mitad nuestra cadena mediante el método length() para obtener así el punto intermedio.
        posicionCentral = cadenaResultante.length() / 2;
        //Ahora, obtenemos el carácter central mediante el método chartAt()
        caracterCentral = cadenaResultante.charAt(posicionCentral);
        
        //7. Comprobamos si la cadena contiene el carácter 'M'.
        //Para ello, utilizaremos el método contains​(CharSequence s)
        //También, utilizaremos el operador ternario para que la consola nos devuelva por escrito si la cadena contiene o no el carácter 'M'.
        contieneM = cadenaResultante.contains("M") ? "SI" : "NO";
        
        //8. Comprobamos si la cadena termina en consonante sin utilizar métodos.
        //Para ello, vamos a utilizar el operador ternario para que la consola nos devuelva por pantalla SI ó NO, según el carácter introducido
        //previamente por el usuario en la consola coincida con una letra vocal o no. Además, la lógica está invertida. La consola nos devolverá 
        //"NO" en caso de que se cumpla nuestra condición (letraGrupo == 'E"), es decir, si la última letra equivale a 'E', se cumple nuestra condición
        //y por consiguiente, NO acaba en consonante, que es la pregunta que se nos hace en el ejercicio.
        terminaEnConsonante = (letraGrupo == 'E') ? "NO" : "SI";
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println();
        System.out.println("RESULTADOS");
        System.out.println("----------");
        System.out.println("La cadena final es:" + cadenaResultante + ".");
        System.out.println("La cadena final contiene: " + longitudCadena + " caracteres.");
        System.out.println("La cadena final tiene el carácter: " + caracterCentral + " en su posición central.");
        System.out.println("La cadena final contiene el carácter 'M' : " + contieneM + ".");
        System.out.println("La cadena final termina en consonante: " + terminaEnConsonante + ".");
        
    }
}