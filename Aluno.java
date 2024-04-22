public class Aluno extends Pessoa{

    // Atributos

    private int numeroInscriçao;
    private double mediaUltimasProvas;
    private double mensalidade;
    private double bolsa;

    // Contrutores

    public Aluno(String nome, int idade, String cpf, String telefone, int anoCursando, int numeroInscriçao, double mediaUltimasProvas, double mensalidade){
        super(nome, idade, cpf, telefone);
        this.numeroInscriçao = numeroInscriçao;
        this.mediaUltimasProvas = mediaUltimasProvas;
        this.mensalidade = mensalidade;        
    }

    // Metodos

    public double calculaBolsa(double mediaUltimasProvas, double mensalidade){
        if (mediaUltimasProvas == 0) {
            bolsa = 0;
        } else if (mediaUltimasProvas < 5) {
            bolsa = 10;
        } else if (mediaUltimasProvas == 6) {
            bolsa = 25;
        } else if (mediaUltimasProvas == 7) {
            bolsa = 35;
        } else if (mediaUltimasProvas == 8) {
            bolsa = 45;
        } else if (mediaUltimasProvas == 9) {
            bolsa = 55;
        } else {
            bolsa = 75;
        }
        return bolsa;
    }

    public double calculaMensalidade()

    // Setters e Getters
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getMediaUltimasProvas() {
        return mediaUltimasProvas;
    }

    public void setMediaUltimasProvas(int mediaUltimasProvas) {
        this.mediaUltimasProvas = mediaUltimasProvas;
    }


    public int getNumeroInscriçao() {
        return numeroInscriçao;
    }

    public void setNumeroInscriçao(int numeroInscriçao) {
        this.numeroInscriçao = numeroInscriçao;
    }
}
