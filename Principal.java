package apresentacao;

import negocio.Carrinho_Compras;
import negocio.Cliente;
import negocio.Estoque;
import negocio.Item;

public class Principal {
	
	public static int total;
	public static double desconto;
	
	public static void main(String[] args) {
		
		//CADSATRANDO ITENS
		
		//item 1
		
		Item p1 = new Item();
		p1.nome = "Agua Sanitaria Marina";
		p1.preco = "3.00";
		p1.descricao = "A melhor do mundo";
		
		Estoque est1 = new Estoque();
		est1.capacidade = 10;
		est1.item = 500;
		
		//item 2
		
		Item p2 = new Item();
		p2.nome = "Cloro Marina";
		p2.preco = "5.00";
		p2.descricao = "O cloro mais foda!";

		Estoque est2 = new Estoque();		
		est2.capacidade = 20;
		est2.item = 1000;

		//CRIANDO UM VETOR PARA INSERIR OS ITENS CADASTRADOS
		
		Item produto[] = new Item[100];		
		produto[0] = p1;
		produto[1] = p2;
	
		Estoque estoque[] = new Estoque[100];
		estoque[0] = est1;
		estoque[1] = est2;
		
		//IMPRIMINDO ITENS
		
		System.out.println("Produtos Cadastrados: \n");
		System.out.println("Nome        \t        Preço         \t        Descrição");
		System.out.println(produto[0].nome +"  \t"+ produto[0].preco +"           \t"+ produto[0].descricao);
		System.out.println(produto[1].nome +"     \t"+ produto[1].preco +"           \t"+ produto[1].descricao);
		
		//DESCOBRINDO A QUANTIDADE DE ITENS NO ESTOQUE
		
		for(int i=1; i<3; i++){
			total =+ i;
		}
	
		//IMPRIME TOTAL DE COMPRAS
		
		System.out.println("\n");
		System.out.println("Total de produtos cadastrados: " + total);
	
		//DESCONTO
		
		Carrinho_Compras consulta_compra = new Carrinho_Compras();
		
		if(consulta_compra.quantidade > 1){
			desconto = consulta_compra.valor_total - 0.1;
		}
	
		//A cada 100 reais em compras o cliente ganha 10 milhas;
		
		Cliente consulta_valor = new Cliente();
		
		if(consulta_compra.valor_total > 100){
			consulta_valor.milhas =+ 10;
		}
		
		//Com mais de 100 minhas adquirida o cliente se torna um cliente VIP;
		
		if(consulta_valor.milhas > 100){
			Cliente vip = new Cliente();
		}
		
	}

}

