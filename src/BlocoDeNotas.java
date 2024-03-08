import java.util.ArrayList;
import java.util.List;

public class BlocoDeNotas {
    // Encapsula uma coleção de anotações
    private List<Anotacoes> anotacao;
    private List<Anotacoes> listaPorOrdem;

    // Construtor
    public BlocoDeNotas() {
        this.anotacao = new ArrayList<>();
        this.listaPorOrdem = new ArrayList<>();
    }

    // Adiciona novas anotações
    public void addAnotacoes (String txt){
        anotacao.add(new Anotacoes(txt));
        listaPorOrdem.add(new Anotacoes(txt));
    }
    // Edita anotações existentes
    public void edita (int id, String novoTxt){
        for (Anotacoes txt : anotacao){
            if (txt.getId() == id){
                txt.setTexto(novoTxt);
                System.out.println("\n✅ Editado com sucesso.\nNovo texto: \n" + txt.getTexto());
                return;
            }
        }
        System.err.println("\n❌ Texto com id " + id + " não foi encontrado.");
    }

    // Busca anotações a partir de um texto
    public List<Anotacoes> pesquisaComTxt(String txtPesquisa) {
        List<Anotacoes> resultados = new ArrayList<>();
        for (Anotacoes txt : anotacao){
            if (txt.getTexto().contains(txtPesquisa)){
               resultados.add(txt);
            }
        }
        if (!resultados.isEmpty()){return resultados;}
        System.out.println("\nAnotação não encontrada!");
        return resultados;
    }

    // Deleta as anotações apenas das buscas, não do bloco de notas
    public void deletaAnotacao(int id){
        for(Anotacoes txt : anotacao) {
            if (txt.getId() == id) {
                anotacao.remove(txt);
                System.out.println("\n✅ Deletado com sucesso!");
            }
        }
        System.out.println("\n❌ Texto com id " + id + " não foi encontrado!");
    }

    // Lista as anotações pela ordem que foram adicionadas
    public List<Anotacoes> listarPelaData() {
        for (Anotacoes txt : anotacao){
            if (!anotacao.isEmpty()){
                listaPorOrdem.add(txt);
            }
        }
        return listaPorOrdem;
    }

    @Override
    public String toString() {
        return "Anotação: " + anotacao;
    }
}
