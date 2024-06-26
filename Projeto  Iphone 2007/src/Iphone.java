import java.util.ArrayList;

public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusical(new ArrayList<>(), 50);
        this.aparelhoTelefonico = new AparelhoTelefonico("000-000-0000");
        this.navegadorInternet = new NavegadorInternet(new ArrayList<>());
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        // Testando Reprodutor Musical
        meuIphone.getReprodutorMusical().tocarMusica("Musica 1");
        meuIphone.getReprodutorMusical().aumentarVolume();
        
        // Testando Aparelho Telefonico
        meuIphone.getAparelhoTelefonico().fazerChamada("123-456-7890");
        meuIphone.getAparelhoTelefonico().encerrarChamada();
        
        // Testando Navegador Internet
        meuIphone.getNavegadorInternet().navegar("https://www.example.com");
        meuIphone.getNavegadorInternet().exibirHistorico();
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }
}
