import java.util.Objects;

public class Atividade {
    private Integer id;
    private String descricao;

    public Atividade(Integer id,String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Atividade(Integer id){
        this.id = id;
        this.descricao = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Atividade atividade)) return false;
        return Objects.equals(id, atividade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ID:"+this.id+"|Descrição:"+this.descricao;
    }
}
