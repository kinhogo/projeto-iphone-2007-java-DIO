public class AparelhoTelefonico {
    private String numeroDeTelefone;

    public AparelhoTelefonico(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }
}
