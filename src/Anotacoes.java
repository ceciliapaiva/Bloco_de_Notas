import java.time.LocalDate;

public class Anotacoes {
    // Todas anotações devem ser identificadas por um número único
    // Deve conter a data de criação da anotação
    private static int id;
    private static int proximoID = 1;
    private String texto;
    private LocalDate data;

    public Anotacoes(String texto) {
        this.id = Anotacoes.criaID(proximoID);
        this.texto = texto;
        this.data = LocalDate.now();
    }

    public static int criaID(int proximoID) {
        Anotacoes.id = proximoID + 1;
        return id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDate getData() {
        return data;
    }
}
