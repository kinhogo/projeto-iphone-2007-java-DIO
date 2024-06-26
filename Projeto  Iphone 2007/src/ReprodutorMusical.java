import java.util.List;

public class ReprodutorMusical {
    private List<String> listaDeReproducao;
    private int volume;

    public ReprodutorMusical(List<String> listaDeReproducao, int volume) {
        this.listaDeReproducao = listaDeReproducao;
        this.volume = volume;
    }

    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void pararMusica() {
        System.out.println("Música parada.");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume diminuído para: " + volume);
    }

    public List<String> getListaDeReproducao() {
        return listaDeReproducao;
    }

    public void setListaDeReproducao(List<String> listaDeReproducao) {
        this.listaDeReproducao = listaDeReproducao;
    }
}
