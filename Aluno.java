
import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Scanner;

public class Aluno extends Usuario{
    private String nomeDaMae;
    private String nomeDoPai;
    private boolean atendimentoEspecial;
    private String matricula;
    private String curso;

    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(String nome, String sobrenome, String cpf, String telefone, String cidade, String bairro,
                   String rua, String numero, String email, LocalDate dataNascimento, String rg,
                   String nomeDaMae, String nomeDoPai, boolean atendimentoEspecial,
                   String matricula, String curso) {
        super(nome, sobrenome, cpf, telefone, cidade, bairro, rua, numero, email, dataNascimento, rg);
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDoPai;
        this.atendimentoEspecial = atendimentoEspecial;
        this.matricula = matricula;
        this.curso = curso;
    }

    

    public Aluno() {
    }

    // Métodos GET e SET
     
     public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public boolean isAtendimentoEspecial() {
        return atendimentoEspecial;
    }

    public void setAtendimentoEspecial(boolean atendimentoEspecial) {
        this.atendimentoEspecial = atendimentoEspecial;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    

    

    

    
}
