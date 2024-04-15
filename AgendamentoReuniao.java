import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoReuniao {
    private LocalDate data;
    private LocalTime hora;
    private String local;
    private List<String> participantes;

    public AgendamentoReuniao(LocalDate data, LocalTime hora, String local) {
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.participantes = new ArrayList<>();
    }
     
    public AgendamentoReuniao() {

    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<String> getParticipantes() {
        return participantes;
    }
    //simplificar add
    public void adicionarParticipante(String participante) {
        this.participantes.add(participante);
    }
    //simplificar remover
    public void removerParticipante(String participante) {
        this.participantes.remove(participante);
    }
    //simplificar lista
    public void listarParticipantes() {
        System.out.println("Participantes da reunião:");
        for (String participante : participantes) {
            System.out.println(participante);
        }
    }
    
    //sobrescrevendo um método
    @Override
    public String toString() {
        return "AgendamentoReuniao{" +
                "data=" + data +
                ", hora=" + hora +
                ", local='" + local + '\'' +
                '}';
    }
}
