import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Scanner;

public class Professor extends Usuario{
    private String disciplina;
    private String matricula;
    private String curso;

    private static ArrayList<Professor> professores = new ArrayList<>();

    public Professor(String nome, String sobrenome, String cpf, String telefone, String cidade, String bairro,
                   String rua, String numero, String email, LocalDate dataNascimento, String rg,
                   String disciplina, String matricula, String curso) {
        super(nome, sobrenome, cpf, telefone, cidade, bairro, rua, numero, email, dataNascimento, rg);
        this.disciplina = disciplina;
        this.matricula = matricula;
        this.curso = curso;
    }

    

    public Professor() {
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String discipina) {
        this.disciplina = discipina; 
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
