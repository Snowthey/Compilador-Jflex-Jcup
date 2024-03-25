package ExemploCUP;
import java.io.*;

public class Main_Teste_AnalisadorSintatico {
    
    public static void main(String[] args) throws FileNotFoundException{
        String arquivo = "C:/Users/sherl/OneDrive/Documents/NetBeansProjects/Analise Semantica/src/ExemploCUP/codigofonte.txt";
        
        System.out.println("Arquivo analisado: " + arquivo);
        
        BufferedReader texto = new BufferedReader(new FileReader(arquivo));
        
        Lexer AnaliseLexica = new Lexer(texto);
        
        ParserSintatico p = new ParserSintatico(AnaliseLexica);
        
        try{
            p.parse();
        }
        catch(Exception e){
            System.out.println("Falha geral.");
        }
    }
    
}
