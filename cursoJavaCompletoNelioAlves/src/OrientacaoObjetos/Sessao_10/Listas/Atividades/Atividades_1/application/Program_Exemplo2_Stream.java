package OrientacaoObjetos.Sessao_10.Listas.Atividades.Atividades_1.application;

import OrientacaoObjetos.Sessao_10.Listas.Atividades.Atividades_1.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program_Exemplo2_Stream {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>(); //Acertou aqui

        //Funcionario funcionario = new Funcionario();
        System.out.print("Quantos funcionarios vão ser registrados? ");
        int valor = scan.nextInt();

        for (int i = 0; i < valor; i++) { // Acertou aqui

            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scan.nextInt();
            while(hasId(funcionarios, id)){
                System.out.println("ID já existe, tente novamente.");
                id = scan.nextInt();
            }

            scan.nextLine(); // Limpar o buffer
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Salario: ");
            double salario = scan.nextDouble();


            Funcionario funcionarioo = new Funcionario(id, nome, salario);
            funcionarios.add(funcionarioo);


        }

        System.out.println("Insira o ID do funcionário que receberá o aumento salarial:");
        int idReferente = scan.nextInt();

        Funcionario emp = funcionarios.stream().filter(x -> x.getId() == idReferente).findFirst().orElse(null); //Aqui ele usa para encontrar o funcionario;
        //Integer pos = verificarID(funcionarios, idReferente); // procurando a posição do id dentro da lista;
        if (emp == null) {
            System.out.println("Esse ID não existe");
        } else {
            System.out.println("Informe a porcetagem: ");
            double salario = scan.nextDouble();
            emp.aumentarSalario(salario);

        }

        System.out.println();
        System.out.println("Lista de funcionario: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }


    }

    // Esse metodo informa qual vai ser a posição dessa lista
    public static Integer verificarID(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) { // Percorrer a lista
            if (list.get(i).getId() == id) { // Procurar se o id é igual, como foi informado no argumanento
                return i;
            }
        }
        return null;
    }
    //Função auxiliar
    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}


/*

   System.out.print("Informe o seu salário: ");
        double salario = scan.nextDouble();
        System.out.print("Informe a porcetagem do aumento: ");
        double porcetagem = scan.nextDouble();

        double porcetagemSalario = porcetagem / 100;
        double valorAumentoSalario = salario * porcetagemSalario;
        double novoSalario = valorAumentoSalario + salario;

        System.out.println(porcetagemSalario);
        System.out.println(valorAumentoSalario);
        System.out.printf("NOVO SALÁRIO: %.2f", novoSalario);

        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(3.000);

        funcionario.aumentarSalario(10);
 */