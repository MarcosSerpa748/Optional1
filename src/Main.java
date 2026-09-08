import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> valor1 = MetodosEstaticos.verificarValor(null);
        Optional<String> valor2 = MetodosEstaticos.verificarValor("Marcos");

        System.out.println(valor1);
        System.out.println(valor2);

    }
}