
public class Vendedor extends PessoaFisica {
    private String matricula;
    private Date dataContratacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() + ", " +
                "matricula='" + matricula + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Vendedor vendedor = (Vendedor) o;

        if (!getMatricula().equals(vendedor.getMatricula())) return false;
        return getDataContratacao().equals(vendedor.getDataContratacao());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getMatricula().hashCode();
        result = 31 * result + getDataContratacao().hashCode();
        return result;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setDataContratacao(String dataAniversario) {
        this.dataContratacao = Util.parseDate(dataAniversario);
    }
    
    public void cadastrarVendedor(){  	
    	   public Map<String, String> cadastrarVendedor() {
    	        Map<String, String> dados = new HashMap<String, String>();

    	        System.out.println("----------------------------");
    	        System.out.println("----- SISTEMA DE VENDAS ----");
    	        System.out.println("----- Cadastrar Vendedor ----");
    	        System.out.println("----------------------------");
    	        System.out.println("Nome: ");
    	        dados.put("nome", this.in.nextLine());

    	        System.out.println("Email: ");
    	        dados.put("email", this.in.nextLine());

    	        System.out.println("Telefone: ");
    	        dados.put("telefone", this.in.nextLine());

    	        System.out.println("Endereço: ");
    	        dados.put("endereco", this.in.nextLine());

    	        System.out.println("CPF: ");
    	        dados.put("cpf", this.in.nextLine());

    	        System.out.println("Data de Aniversario (dd/mm/aaaa): ");
    	        dados.put("dataAniversario", this.in.nextLine());

    	        System.out.println("Matricula: ");
    	        dados.put("matricula", this.in.nextLine());
    	        
    	        System.out.println("Data de contratação: ");
    	        dados.put("dataContratacao", this.in.nextLine());

    	        return dados;
    	    }
    
    public void listarVendedores(){
    	for (Vendedor v : list) {
    		System.out.println(---------------);
            System.out.println("Nome: \t" + v.getNome());
            System.out.println("Email: \t" + v.getEmail());
            System.out.println("Telefone: \t" + v.getTelefone());
            System.out.println("Endereço: \t" + v.getEndereço());
            System.out.println("CPF: \t" + v.getCpf());
            System.out.println("Data de Aniversario: \t" + v.getDataAniversario());
            System.out.println("Matricula: \t" + v.getMatricula());
            System.out.println("Data de contratação: \t" + v.getDataContratacao());
    	}
    	
    }
}