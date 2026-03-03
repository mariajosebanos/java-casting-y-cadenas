package tarea1;

import java.util.Scanner;

/**
 * Ejercicio 1. Cálculo de expresiones físicas/matemáticas.
 * 
 * @author Baños Saldaña, María José
 */
public class Ejercicio1 {
    
    public enum Calculos {OPERACION, FUERZA_PESO, NUMERO_VUELTAS, AREA_CIRCULO}; //Lista enumerada con el nombre de cada operación.
    
    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        final double GRAVEDAD = 9.8; //Declaramos el valor de la gravedad como consntante.
        final double PI; //Declaramos la variable PI para posteriormente realizar el cálculo de PI mediante la serie de Leibniz.
        
        // Variables de entrada
        int x, masa, tiempo; //Declaramos x, la masa y el tiempo como valores enteros.
        double frecuencia; //Declaramos la frecuencia y el radio como valores reales. 
        float radio; //Declaramos el radio como float para obtener la precisión deseada en la respuesta del ejercicio.
        
        // Variables de salida
        double resultado1; //Resultado del ejercicio 1 declarado como double (número real).
        double resultado2; //Resultado del ejercicio 2 declarado como float (número real más impreciso).
        int resultado3; //Resultado del ejercicio 3 declarado como int (número entero).
        double resultado4; //Resultado del ejercicio 4 declarado como double (número real).

        // Variables auxiliares
        //Este ejercicio no tiene ninguna variable auxiliar.
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        System.out.println("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");
        System.out.println("---------------------------------------");
        System.out.print("Introduce el valor de x: ");
        x = teclado.nextInt();
        System.out.print("introduce la masa (kg): ");
        masa = teclado.nextInt();
        System.out.print("Introduce el tiempo (s): ");
        tiempo = teclado.nextInt();
        System.out.print("Introduce la frecuencia (hz): ");
        frecuencia = teclado.nextDouble();
        System.out.print("Introduce el radio del círculo (m): ");
        radio = teclado.nextFloat();
                            
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //1. Operación matemática:
        resultado1 = ( x + x /4.0) / (6.0 - x/2.0);
        //Se produce casting implícito de int a double.
        //x es un entero pero al ser divido por 4.0, que es un double, se convierte implícitamente a double.
        //Lo mismo sucede con x/2.0, donde x se convierte implícitamente a double al ser divido por un double.
        //La expresión resultante es evaluada como un double.
        
        //2. Fuerza peso:
        resultado2 = masa * (float)GRAVEDAD;
        //En primer lugar, aplicamos casting explícito de double a float al pasar la GRAVEDAD de double a float.
        //En segundo lugar, se produce casting implícito de int a float al multiplicar la masa (int) por la gravedad (float).
        //El resultado obtenido es por tanto de tipo float.
        
        //3. Número de vueltas completas:
        resultado3 = (int)(frecuencia * tiempo);
        //Se produce casting implícito cuando la frecuencia declarada como double es multiplicada por el tiempo
        //que está declarado como int. Por lo tanto, el tiempo se convierte implícitamente a double antes de la multiplicación,
        //quedando la expresión resultante de tipo double.
        //Para el resultado, aplicamos casting explícito de double a int para truncar el resultado decimal.
       
        //4. Área de un círculo:
        
        //Primero, calculamos el valor de PI mediante la serie de Leibniz
        PI = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9));
        //Se produce casting implícito de int a double, ya que, como en el caso del primer ejercicio, al dividir un entero (3, 5, 7..) 
        //entre un double (1.0), el entero se convierte implícitamente a double.
        //De esta forma, la expresión resultante PI es de tipo double.
        
        //Ahora, realizamos la operación correspondiente al apartado 4.
        resultado4 = PI *((radio) * (radio));
        //Al multiplicar el radio, que es float, por PI, que es double, el radio se convierte implícitamente a double.
        //Por tanto, el resultado final que obtenemos es un double.
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        System.out.println();
        System.out.println("RESULTADOS");
        System.out.println("----------");
        System.out.println(Calculos.OPERACION + ": " + resultado1);
        System.out.println(Calculos.FUERZA_PESO + ": " + resultado2);
        System.out.println(Calculos.NUMERO_VUELTAS + ": " + resultado3);
        System.out.println(Calculos.AREA_CIRCULO + ": " + resultado4);
         
    }
}