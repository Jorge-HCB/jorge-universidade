
package prova1;


public class Filme {
    private int código;
    private String nome;
    private String genero;
    private String sinopse;
    
    public Filme(int código, String nome, String genero, String sinopse) {
        this.código = código;
        this.nome = nome;
        this.genero = genero;
        this.sinopse = sinopse;
    }
    
    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    public void dadosFilme(){
        System.out.println("Código: " + this.getCódigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Sinopse: " + this.getSinopse());
    }
    
}
