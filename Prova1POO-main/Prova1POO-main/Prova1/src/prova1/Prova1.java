
package prova1;

public class Prova1 {

    public static void main(String[] args) {
        
        Filme f1 = new Filme(1011, "Matrix", "Ação", "Um jovem programador"
                + " é atormentado por estranhos pesadelos nos quais sempre "
                + "está conectado por cabos a um imenso sistema de computadores"
                + " do futuro.\n");
                
        Filme f2 = new Filme(1001, "Deadpool", "Comédia", "Wade Wilson é um "
                + "ex-agente especial que passou a trabalhar como mercenário.");
        
        Filme f3 = new Filme(1100, "Shrek", "Comédia", "Era uma vez um pântano"
                + " distante, onde vivia um ogro chamado Shrek.");
        
        /*
        f1.dadosFilme();
        f2.dadosFilme();
        f3.dadosFilme();
        */
                
        Avaliacao a1 = new Avaliacao(10011, "Jorge", 4, "Bom");
        Avaliacao a2 = new Avaliacao(10011, "Felipe", 5, "Excelente");
        Avaliacao a3 = new Avaliacao(10011, "Jorge", 3, "Não entendi o final");
        Avaliacao a4 = new Avaliacao(1001, "Caio", 3, "Mais ou menos");
        Avaliacao a5 = new Avaliacao(1001, "Jorge", 5, "Filme família");
        Avaliacao a6 = new Avaliacao(1001, "Igor", 1, "Filme fraco");
        Avaliacao a7 = new Avaliacao(1100, "Jorge", 5, "Assista esse filme em "
                + "alemão");
        Avaliacao a8 = new Avaliacao(1100, "Paulo", 3, "Protagonista feio");
        Avaliacao a9 = new Avaliacao(1100, "Lucas", 2, "Filme pra criança");
                
        /*
        a1.dadosAvaliacao();
        a2.dadosAvaliacao();
        a3.dadosAvaliacao();
        a4.dadosAvaliacao();
        a5.dadosAvaliacao();
        a6.dadosAvaliacao();
        a7.dadosAvaliacao();
        a8.dadosAvaliacao();
        a9.dadosAvaliacao();
        */
        
        
    }
    
}
