import java.util.List;

public class NavegadorInternet {
    private List<String> historicoDeNavegacao;

    public NavegadorInternet(List<String> historicoDeNavegacao) {
        this.historicoDeNavegacao = historicoDeNavegacao;
    }

    public void navegar(String url) {
        historicoDeNavegacao.add(url);
        System.out.println("Navegando para: " + url);
    }

    public void adicionarFavorito(String url) {
        System.out.println("Adicionando favorito: " + url);
    }

    public void exibirHistorico() {
        System.out.println("Histórico de navegação:");
        for (String url : historicoDeNavegacao) {
            System.out.println(url);
        }
    }

    public List<String> getHistoricoDeNavegacao() {
        return historicoDeNavegacao;
    }

    public void setHistoricoDeNavegacao(List<String> historicoDeNavegacao) {
        this.historicoDeNavegacao = historicoDeNavegacao;
    }
}
