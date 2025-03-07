
import java.util.List;

public class Tar2 {

    public static void main(String[] args) {
        // Instanciar la clase Recursos
        Recursos recursos = new Recursos();

        // Llamar al primer método
        String mensaje = recursos.obtenerMensaje();
        System.out.println(mensaje);

        // Llamar al segundo método con una edad de ejemplo
        int edad = 20;
        String resultadoEdad = recursos.verificarEdad(edad);
        System.out.println("Edad: " + edad + " - " + resultadoEdad);

        // Llamar al tercer método con dos números de ejemplo
        int num1 = 5;
        int num2 = 3;
        int resultadoMultiplicacion = recursos.multiplicar(num1, num2);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + resultadoMultiplicacion);

        // Llamar al cuarto método con un número de ejemplo
        int x = 10;
        List<Integer> listaNumeros = recursos.generarLista(x);
        System.out.println("Lista de números del 1 al " + x + ": " + listaNumeros);
    }
}
