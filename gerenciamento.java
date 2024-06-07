import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class gerenciamento {
    public void salvarDoacao(doaçao doacao, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String Tipo = doacao.getTipo();
            if (Tipo.equals("1")) {
                writer.write("Tipo: Roupa");
            } else if (Tipo.equals("2")) {
                writer.write("Tipo: Dinheiro");
            } else if (Tipo.equals("3")) {
                writer.write("Tipo: Comida");
                
            }
            writer.newLine();
            writer.write("Quantidade: " + doacao.getQuantidade());
            writer.newLine();
            writer.write("Data: " + doacao.getData());
            writer.newLine();
            writer.newLine(); 
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
