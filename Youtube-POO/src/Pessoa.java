public abstract class Pessoa {
    protected String nome;
    protected Data dtNasc;
    protected char sexo;
    protected float experiencia;

    public Pessoa(String nome, Data dtNasc, char sexo) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dtNasc=" + dtNasc +
                ", sexo=" + sexo +
                ", experiencia=" + experiencia +
                '}';
    }
}
