import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    public static void main(String[] args) {
        /*
        Implemente um programa que realiza a leitura de um
        arquivo. Utilize try-catch para lidar com possíveis
        exceções de leitura do arquivo e garanta que o
        arquivo seja fechado no bloco finally.

        Biblioteca para leitura:
        BufferedReader
        FileReader
        */
        String path = "testee.txt";
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(path));

            String row;
            while ((row = fileReader.readLine()) != null) {
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: \n" + e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro ao fechar o arquivo: \n" + e.getMessage());
                }
            }
        }
    }
}
