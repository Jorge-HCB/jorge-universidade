
package prova1;

public class Videoteca {
    private Filme[] filmes;

    public Videoteca(Filme[] filmes) {
        this.filmes = filmes;
    }
    
    public Filme[] getFilmes() {
        return filmes;
    }

    public void setFilmes(Filme[] filmes) {
        this.filmes = filmes;
    }
    
    public int procurarFilme(String busca){
        
        int endereço = 0;
        
        for(Filme fil : filmes){
            endereço = fil.getNome().indexOf(busca);
        
            if(endereço >= 0){
                break;
            }
            
            endereço = fil.getSinopse().indexOf(busca);
            
            if(endereço >= 0){
                break;
            }
        }
        return endereço;
    }
    
    public String[] catalogo(){
        int tamanhoLista = filmes.length;
        String[] titulos = new String[tamanhoLista];
        
        for(int endereço = 0; endereço < tamanhoLista; endereço++){
            titulos[endereço] = filmes[endereço].getNome();
        }
        
        return titulos;
    }   
}
