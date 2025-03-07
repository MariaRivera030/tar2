import java.util.ArrayList;
import java.util.List;

public class Recursos {

    // Primer método: Retornar un mensaje
    public String obtenerMensaje() {
        return "Programación Orientada a Objetos 2021";
    }

    // Segundo método: Retornar un mensaje dependiendo de la edad
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Retornar el resultado de una multiplicación
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto método: Retornar una lista de números del 1 al X
    public List<Integer> generarLista(int x) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            lista.add(i);
        }
        return lista;
    }
}
