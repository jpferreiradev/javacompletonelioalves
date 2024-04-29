package OrientacaoObjetos.Interfaces.Atividade.application;

import OrientacaoObjetos.Interfaces.Atividade.model.entities.Contrato;
import OrientacaoObjetos.Interfaces.Atividade.model.entities.Prestacao;
import OrientacaoObjetos.Interfaces.Atividade.model.services.ContratoServico;
import OrientacaoObjetos.Interfaces.Atividade.model.services.ServicoPagamentoOnline;
import OrientacaoObjetos.Interfaces.Atividade.model.services.ServicoPaypal;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero:");
        int numero = scan.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(scan.next(), fmt1);
        System.out.print("Valor do contrato: ");
        double valorContrato = scan.nextDouble();

        Contrato obj = new Contrato(numero, data, valorContrato);

        // A partir daqui preste bastante atencão!

        System.out.print("Entre com o número de parcelas: ");
        int n = scan.nextInt();

        ContratoServico contratoServico = new ContratoServico(new ServicoPaypal());
        //ContratoServico contratoServico = new ContratoServico(null); -> Nessa forma aqui vai dar a exceção "NullPointerException""


        contratoServico.processoContrato(obj,n);

        System.out.println("Parcelas: ");
        for(Prestacao prestacao : obj.getPrestacoes()){
            System.out.println(prestacao);
        }



    }
}

/*

 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
LocalDateTime finish = LocalDateTime.parse(scan.nextLine(),fmt);
 */