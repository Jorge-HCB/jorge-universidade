
package prova1;

public class Prova1 {

    public static void main(String[] args) {
        Filme f1 = new Filme(1011, "Matrix", "Ação", "Um jovem programador"
                + " é atormentado por estranhos pesadelos nos quais sempre "
                + "está conectado por cabos a um imenso sistema de computadores"
                + " do futuro.\n");
        f1.dadosFilme();
        
        //System.out.println(f1[0].getNome());
        
        Avaliacao a1 = new Avaliacao(10011, "Jorge", 5, "Muito bom");
        a1.dadosAvaliacao();
        
        
    }
    
}
