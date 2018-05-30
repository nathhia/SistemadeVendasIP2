public class Venda {
    private Date dataVenda;
    private Produto produto;
    private int quantidade;
    private Cliente cliente;
    private Vendedor vendedor;

    @Override
    public String toString() {
        return "Venda{" +
                "dataVenda=" + dataVenda +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return quantidade == venda.quantidade &&
                Objects.equals(dataVenda, venda.dataVenda) &&
                Objects.equals(produto, venda.produto) &&
                Objects.equals(cliente, venda.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataVenda, produto, quantidade, cliente);
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() { return vendedor; }

    public void setVendedor(Vendedor vendedor) { this.vendedor = vendedor;  }

    public Map<String, String> registroVenda() {
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Registro venda ----");
        System.out.println("----------------------------");
        System.out.println("Produto: ");
        dados.put("produto", this.in.nextLine());

        System.out.println("Quantidade: ");
        dados.put("quantidade", this.in.nextLine());

        System.out.println("Data de venda: ");
        dados.put("dataVenda", this.in.nextLine());

        System.out.println("Vendedor: ");
        dados.put("vendedor", this.in.nextLine());

        System.out.println("Cliente: ");
        dados.put("cliente", this.in.nextLine());
        
        return dados;
    }
    
    public void relatorioVendas(){
    	for (Venda ve : list) {
            System.out.println("Produto: \t" + ve.getProduto());
            System.out.println("Quantidade: \t" + ve.getQuantidade());
            System.out.println("Data de venda: \t" + ve.getDataVenda());
            System.out.println("Cliente: \t" + ve.getCliente());
            System.out.println("Vendedor: \t" + ve.getVendedor());

    	}
    	
    }
}