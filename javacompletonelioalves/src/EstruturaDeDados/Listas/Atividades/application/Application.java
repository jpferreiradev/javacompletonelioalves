package EstruturaDeDados.Listas.Atividades.application;

import EstruturaDeDados.Listas.Atividades.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Funcionario #" + (i + 1));
            System.out.print("ID: ");
            Integer id = scan.nextInt();
            while(hasId(list,id)){ // Forma simples para você testar se o ID já existe
                System.out.println("Esse ID já existe, tente novamente!!");
                id = scan.nextInt();
            }

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Salário: ");
            Double salario = scan.nextDouble();

            Funcionario func = new Funcionario(id, name, salario); // Ele criou um objeto dentro do for
            list.add(func); // Adicionando o objeto Funcionario na lista;

        }

        System.out.print(" Informe o ID do funcionario que terá o aumento salarial: ");
        int idSalario = scan.nextInt();

        Funcionario emp = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);

        //Integer pos = position(list,idSalario);
        if(emp == null){ //pos
            System.out.println("Esse ID não existe...");
        }
        else{
            System.out.println(" Entre com a porcetagem:");
            double porcentagem = scan.nextDouble();
            emp.increaseSalary(porcentagem);
            //list.get(pos).increaseSalary(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios");
        for(Funcionario funcionarios : list ){
            System.out.println(funcionarios);
        }

    }

    public static Integer position(List<Funcionario> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Funcionario> list, int id){
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}


/*
  //List<Integer> ids = new ArrayList<>();
        //List<String> names = new ArrayList<>();
        //List<Double> salarios = new ArrayList<>();


 for(int i = 0; i < x; i++){
            System.out.print("Informe o ID do funcionario que terá o aumento salarial");
            Integer valor = scan.nextInt();
            if(ids[i] == valor){
                System.out.print("Insira a porcetagem ");
                Integer porcetagem = scan.nextInt();


            } else{
                System.out.println("Este ID não existe....");
            }


    // Outra forma de fazer o  hasId
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); // Buscar com a expressão Lambda
		return emp != null;
	}

 public static Integer position(List<Funcionario> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

 */
