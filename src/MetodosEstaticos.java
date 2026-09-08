import java.util.Optional;

public class MetodosEstaticos {
    public static Optional<String> verificarValor(String valor){
        Optional<String> valorEncapsulado = Optional.ofNullable(valor);

        return valorEncapsulado.or(() ->Optional.empty());
    }


}
