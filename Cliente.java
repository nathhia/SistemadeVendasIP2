public class Cliente extends PessoaFisica {
	
	import java.util.Scanner;
	Scanner ler = new Scanner(System.in);

    private double limiteCredito;

    @Override
    public String toString() {
        return "Cliente{\n\t" +
                "SUPER=" + super.toString() + ", \n\t" +
                "limiteCredito=" + limiteCredito +
                '}';
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    public Map<String, String> cadastrarCliente() {
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Cadastrar Cliente ----");
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

        System.out.println("Limite de crédito: ");
        dados.put("limiteCredito", this.in.nextLine());

        return dados;
    }
    
    public void listarClientes(){
    	for (Cliente c : list) {
            System.out.println("Nome: \t" + c.getNome());
            System.out.println("Email: \t" + c.getEmail());
            System.out.println("Telefone: \t" + c.getTelefone());
            System.out.println("Endereço: \t" + c.getEndereço());
            System.out.println("CPF: \t" + c.getCpf());
            System.out.println("Data de Aniversario: \t" + c.getDataAniversario());
            System.out.println("Limite de Credito: \t" + c.getLimiteCredito());
    	}
    	
    }
}