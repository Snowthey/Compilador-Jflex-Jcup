package ExemploCUP;

import java.io.*;

public class GeraLexer {
    
    public static void main(String[] args) throws IOException
    {
        String CaminhoArquivo = "C:/Users/sherl/OneDrive/Documents/NetBeansProjects/Analise Semantica/src/ExemploCUP/lexico.flex";
        File arquivo = new File(CaminhoArquivo);
        
        jflex.Main.generate(arquivo);
    }
    
}
