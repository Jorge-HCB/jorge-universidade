
package prova1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Opinioes{
    private Avaliacao[] criticas;

    public Opinioes(Avaliacao[] criticas) {
        this.criticas = criticas;
    }

    public Avaliacao[] getCriticas() {
        return criticas;
    }

    public void setCriticas(Avaliacao[] criticas) {
        this.criticas = criticas;
    }
    
        private List<Avaliacao> filmePorCodigo(int indentificadorParametro){
       List<Avaliacao> listaNotas = new ArrayList<>();
       int elementoIndentificador = indentificadorParametro;
         
       for (Avaliacao critica : criticas) 
       {
           if(critica.getIdentificador() == elementoIndentificador)
           {
                listaNotas.add(critica);
           }         
       }
       
       return listaNotas;
    }
    
    public double mediaNotaFilme(int indentificadorParametro) 
    {
       double media = 0;
       int elementoIndentificador = indentificadorParametro, totalElementos = 0;
         
       for (Avaliacao critica : criticas) 
       {
           if(critica.getIdentificador() == elementoIndentificador)
           {
                media += critica.getNota();
                totalElementos++;
           }         
       }
      
       return media / totalElementos;
    }
    
    public Avaliacao MaiorNotaFilme(int indentificadorParametro) 
    {
       List listaCriticas = filmePorCodigo(indentificadorParametro);
       
       Collections.sort(listaCriticas, (Avaliacao a, Avaliacao b) -> {
                    if(a.getNota() > b.getNota()) return 1;
                    else if(a.getNota() < b.getNota()) return -1;
                    return 0;
       });
       
       return ((Avaliacao) listaCriticas.get(listaCriticas.size() -1));
    }

    public Avaliacao PiorNotaFilme(int indentificadorParametro) {
       List listaCriticas = filmePorCodigo(indentificadorParametro);
       
       Collections.sort(listaCriticas, (Avaliacao a, Avaliacao b) -> {
                    if(a.getNota() > b.getNota()) return -1;
                    else if(a.getNota() < b.getNota()) return 1;
                    return 0;
       });
       
       return ((Avaliacao) listaCriticas.get(listaCriticas.size() -1));
    }
             
}
