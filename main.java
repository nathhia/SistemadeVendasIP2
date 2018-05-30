import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
	
	
	private List<Cliente> cliente;
	private List<Vendedor> vendedor;
	private List<Produto> produto;
	private List<Venda> venda;
	cliente = new ArrayList<>(Cliente);
	vendedor = new ArrayList<>(Vendedor);
	produto = new ArrayList<>(Produto);
	venda = new ArrayList<>(Venda);
	public static void main(String[] args) {
		System.out.print("SISTEMA DE VENDAS");
		System.out.print("1. Cadastrar cliente");
		System.out.print("2. Listar clientes");
		System.out.print("3. Cadastrar vendedor");
		System.out.print("4. Listar vendedores");
		System.out.print("5. Cadastrar produto");
		System.out.print("6. Listar produtos");
		System.out.print("7. Registrar venda");
		System.out.print("8. Relatorio de venda");
		
		Scanner scanner = new Scanner(System.in); 
		int opcao = scanner.nextInt();

		
		switch(opcao){
			case 1:{
				Cliente c = new Cliente();
				cadastrarCliente();
			}
			break;
			case 2:{
				listarClientes();
			}
			break;
			case 3:{
				Vendedor v = new Vendedor();
				cadastrarVendedor();
			}
			break;
			case 4:{
				listarVendedores();
			}
			break;
			case 5:{
				Produto p = new Produto();
				cadastrarProduto();
			}
			break;
			case 6:{
				listarProdutos();
			}
			break;
			case 7:{
				Venda ve = new Venda();
				registrarVenda();
			}
			break;
			case 8:{
				relatorioVendas();
			}
			break;
		}
			

	}

}
