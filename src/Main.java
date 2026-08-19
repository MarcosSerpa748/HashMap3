import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Atividade a1 = new Atividade(1,"Desentupir o vaso de bosta");
        Atividade a2 = new Atividade(2,"Lavar as louças");
        Atividade a3 = new Atividade(3,"Dar banho no cachorro");
        Atividade a4 = new Atividade(4,"Engomar as roupas");

        Atividades a = new Atividades();

        a.inserirAtividade(a1,EstadoAtividade.PENDENTE);
        a.inserirAtividade(a2,EstadoAtividade.EMPROGRESSO);
        a.inserirAtividade(a3,EstadoAtividade.EMPROGRESSO);
        a.inserirAtividade(a4,EstadoAtividade.PENDENTE);

        a.exibirAtividades();

        System.out.print("Digite o ID da atividade que você deseja mudar seu estado:");
        Integer id = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite o estado do qual você deseja colocar essa atividade:");
        String estado = sc.nextLine();
        String estadoModificado = estado.replace(" ","").toUpperCase();
        EstadoAtividade estadoAtividade = EstadoAtividade.valueOf(estadoModificado);

        a.alterarEstadoDaAtividade(id,estadoAtividade);

        System.out.println();
        a.exibirAtividades();
    }
}