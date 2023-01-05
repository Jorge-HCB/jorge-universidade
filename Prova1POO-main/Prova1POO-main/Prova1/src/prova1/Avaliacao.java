
package prova1;

public class Avaliacao {
    private int identificador;
    private String avaliador;
    private int nota;
    private String coment;

    public Avaliacao(int identificador, String avaliador, int nota, String coment){
        this.identificador = identificador;
        this.avaliador = avaliador;
        this.nota = nota;
        this.coment = coment;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public void dadosAvaliacao(){
        System.out.println("Código do filme: " + this.getIdentificador());
        System.out.println("Avaliador: " + this.getAvaliador());
        if (this.getNota() > 5) {
            System.out.println("Nota inválida! A nota deve ser de 1 a 5");
        } else {
            System.out.println("Nota: " + this.getNota());
        }
        System.out.println("Comentário: " + this.getComent());
    }
    
    
}
