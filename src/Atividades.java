import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Atividades {
    HashMap<EstadoAtividade, List<Atividade>> atividades = new HashMap<>();

    public Atividades(){
        atividades.computeIfAbsent(EstadoAtividade.PENDENTE, v -> new ArrayList<>());
        atividades.computeIfAbsent(EstadoAtividade.EMPROGRESSO, v-> new ArrayList<>());
        atividades.computeIfAbsent(EstadoAtividade.FINALIZADA,v ->new ArrayList<>());
    }

    public void exibirAtividades(){

        for (EstadoAtividade i:atividades.keySet()){
            System.out.println("Estado da ativdade:"+i);
            System.out.println();

            if (atividades.get(i).isEmpty()){

                System.out.println("Lista de atividades vazia!");

            }else{

                for (Atividade j:atividades.get(i)){
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }

    public void inserirAtividade(Atividade atividade,EstadoAtividade estado){

        atividades.computeIfAbsent(estado, v ->new ArrayList<>()).add(atividade);

    }

    public void alterarEstadoDaAtividade(Integer id,EstadoAtividade estado){
        Atividade a = new Atividade(id);

        for (EstadoAtividade i:atividades.keySet()){

            for (Atividade j: atividades.get(i)){

                if (a.equals(j)){

                    atividades.get(i).remove(j);
                    a.setDescricao(j.getDescricao());
                    break;

                }
            }
        }
        atividades.computeIfAbsent(estado,v -> new ArrayList<>()).add(a);
    }

    public HashMap<EstadoAtividade, List<Atividade>> getAtividades() {
        return atividades;
    }

    public void setAtividades(HashMap<EstadoAtividade, List<Atividade>> atividades) {
        this.atividades = atividades;
    }
}
