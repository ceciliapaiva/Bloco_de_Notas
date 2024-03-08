
public class Main {
    public static void main(String[] args) {
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        // Adicionando anotações
        blocoDeNotas.addAnotacoes("Primeira anotação");
        blocoDeNotas.addAnotacoes("Segunda anotação");
        blocoDeNotas.addAnotacoes("Terceira anotação");
        blocoDeNotas.addAnotacoes("Quarta anotação");
        blocoDeNotas.addAnotacoes("Quinta anotação");

        // Editando
        blocoDeNotas.edita(2, "Anotação editada");

        // Deletando
        blocoDeNotas.deletaAnotacao(3);

        // Pesquisando
        blocoDeNotas.pesquisaComTxt("Quinta anotação");

        // Lista de anotações
        System.out.println("Lista de anotações: ");
        blocoDeNotas.listarPelaData();
    }
}