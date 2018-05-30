public class Produto {
    private String nome;
    private double preco;
    private double peso;
    private int estoqueMinimo;
    private int estoqueAtual=0;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", peso=" + peso +
                ", estoqueMinimo=" + estoqueMinimo +
                ", estoqueAtual=" + estoqueAtual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 &&
                Double.compare(produto.peso, peso) == 0 &&
                Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstoqueMinimo() {  return estoqueMinimo;  }

    public void setEstoqueMinimo(int estoqueMinimo) {    this.estoqueMinimo = estoqueMinimo;   }

    public int getEstoqueAtual() {     return estoqueAtual;   }

    public void setEstoqueAtual(int estoqueAtual) {     this.estoqueAtual = estoqueAtual;   }
    
    public Map<String, String> cadastrarProduto() {
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Cadastrar Produto ----");
        System.out.println("----------------------------");
        System.out.println("Nome: ");
        dados.put("nome", this.in.nextLine());

        System.out.println("Preco: ");
        dados.put("preco", this.in.nextLine());

        System.out.println("Peso: ");
        dados.put("peso", this.in.nextLine());

        System.out.println("Estoque minimo: ");
        dados.put("estoqueMinimo", this.in.nextLine());

        return dados;
    	
    }
    
    public void listarProdutos(){
    	
    	for (Produto p : list) {
            System.out.println("Nome: \t" + p.getNome());
            System.out.println("Preco: \t" + p.getPreco());
            System.out.println("Peso: \t" + p.getPeso());
            System.out.println("Estoque minimo: \t" + p.getEstoqueMinimo());
            System.out.println("Estoque atual: \t" + p.getEstoqueAtual());

    	}
    	
    }
}