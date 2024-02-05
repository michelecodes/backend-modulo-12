import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaNomesOrdenadaComSexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite 'sair' para encerrar o programa.");

        while (true) {
            System.out.print("Digite um nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (Feminino/Masculino): ");
            String sexo = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo);
            pessoas.add(pessoa);
        }

        ordenarPessoas(pessoas);
        exibirPessoasOrdenadas(pessoas);
    }

    private static void ordenarPessoas(List<Pessoa> pessoas) {
        Collections.sort(pessoas);
    }

    private static void exibirPessoasOrdenadas(List<Pessoa> pessoas) {
        System.out.println("\nPessoas ordenadas:");

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo());
        }
    }
}

class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.getNome());
    }
}
