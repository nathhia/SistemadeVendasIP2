

public class Pessoa {
	
	private String nome;
    private String email;
    private String telefone;
    private String enderešo;
    private Date dataAniversario;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", enderešo='" + enderešo + '\'' +
                ", dataAniversario=" + dataAniversario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (!nome.equals(pessoa.nome)) return false;
        if (!email.equals(pessoa.email)) return false;
        if (telefone != null ? !telefone.equals(pessoa.telefone) : pessoa.telefone != null) return false;
        if (enderešo != null ? !enderešo.equals(pessoa.enderešo) : pessoa.enderešo != null) return false;
        return dataAniversario.equals(pessoa.dataAniversario);
    }

    @Override
    public int hashCode() {
        int result = getNome().hashCode();
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + getTelefone().hashCode();
        result = 31 * result + getEnderešo().hashCode();
        result = 31 * result + getDataAniversario().hashCode();
        return result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnderešo() {
        return enderešo;
    }

    public void setEnderešo(String enderešo) {
        this.enderešo = enderešo;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = Util.parseDate(dataAniversario);
    }


}
