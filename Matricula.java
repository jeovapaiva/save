public class Matricula {
    private String nomeDaInstituicao;
    private int anoLetivo;

    public Matricula(String nomeDaInstituicao, int anoLetivo) {
        this.nomeDaInstituicao = nomeDaInstituicao;
        this.anoLetivo = anoLetivo;
    }

    public Matricula() {
        
    }

    public String getNomeDaInstituicao() {
        return nomeDaInstituicao;
    }

    public void setNomeDaInstituicao(String nomeDaInstituicao) {
        this.nomeDaInstituicao = nomeDaInstituicao;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "nomeDaInstituicao='" + nomeDaInstituicao + '\'' +
                ", anoLetivo=" + anoLetivo +
                '}';
    }
}
