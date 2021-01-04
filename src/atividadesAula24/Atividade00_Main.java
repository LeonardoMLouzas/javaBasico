package atividadesAula24;

public class Atividade00_Main {

	public static void main(String[] args) {

		Atividade01 lampada = new Atividade01();
		lampada.cor = "Branca";
		lampada.lumen = 100;
		lampada.marca = "Abmidia";
		lampada.potencia = 0.5;
		lampada.tipo = "Fluorescente";
		lampada.voltagem = "Bivolt";

		Atividade02 livro = new Atividade02();
		livro.autor = "Eoin Colfer";
		livro.dataPublicacao = "10/11/2014";
		livro.editora = "Fant�stica Rocco";
		livro.genero = "Fic��o Cient�fica";
		livro.titulo = "Doctor Who: 12 Doutores, 12 hist�rias";

		Atividade03 livroVenda = new Atividade03();
		livroVenda.autor = "Eoin Colfer";
		livroVenda.dataPublicacao = "10/11/2014";
		livroVenda.genero = "Fic��o Cient�fica";
		livroVenda.titulo = "Doctor Who: 12 Doutores, 12 hist�rias";
		livroVenda.valor = 29.90;

		Atividade04 livroLivraria = new Atividade04();
		livroLivraria.autor = "Eoin Colfer";
		livroLivraria.cliente = "Leonardo M Louzas";
		livroLivraria.dataDevolucao = "31/12/2021";
		livroLivraria.dataEmprestimo = "01/01/2021";
		livroLivraria.dataPublicacao = "10/11/2014";
		livroLivraria.genero = "Fic��o Cient�fica";
		livroLivraria.titulo = "Doctor Who: 12 Doutores, 12 hist�rias";

		Atividade05 contaBancaria = new Atividade05();
		contaBancaria.especial = false;
		contaBancaria.limite = 999999;
		contaBancaria.numero = 123456789;
		contaBancaria.saldo = 95214.94;

		Atividade06 contato = new Atividade06();
		contato.nome = "Leo";
		contato.numero = 99999.9999;
		contato.numero2 = 99999.9999;

		System.out.println("***** LAMPADA *****");
		System.out.println("cor = " + lampada.cor);
		System.out.println("lumen = " + lampada.lumen);
		System.out.println("marca = " + lampada.marca);
		System.out.println("potencia = " + lampada.potencia);
		System.out.println("tipo = " + lampada.tipo);
		System.out.println("voltagem = " + lampada.voltagem);
		System.out.println("*******************\n\n");

		System.out.println("******************* LIVRO ********************");
		System.out.println("autor = " + livro.autor);
		System.out.println("data de publica��o= " + livro.dataPublicacao);
		System.out.println("editora = " + livro.editora);
		System.out.println("g�nero = " + livro.genero);
		System.out.println("titulo = " + livro.titulo);
		System.out.println("**********************************************\n\n");

		System.out.println("*************** LIVRO � VENDA ****************");
		System.out.println("autor = " + livroVenda.autor);
		System.out.println("data de publica��o= " + livroVenda.dataPublicacao);
		System.out.println("valor = " + livroVenda.valor);
		System.out.println("g�nero = " + livroVenda.genero);
		System.out.println("titulo = " + livroVenda.titulo);
		System.out.println("**********************************************\n\n");

		System.out.println("************* LIVRO DE LIVRARIA **************");
		System.out.println("autor = " + livroLivraria.autor);
		System.out.println("cliente = " + livroLivraria.cliente);
		System.out.println("data de devolu��o = " + livroLivraria.dataDevolucao);
		System.out.println("data de empr�stimo = " + livroLivraria.dataEmprestimo);
		System.out.println("data de publica��o = " + livroLivraria.dataPublicacao);
		System.out.println("g�nero = " + livroLivraria.genero);
		System.out.println("t�tulo = " + livroLivraria.titulo);
		System.out.println("**********************************************\n\n");

		System.out.println("* CONTA BANC�RIA *");
		System.out.println("especial = " + contaBancaria.especial);
		System.out.println("n�mero = " + contaBancaria.numero);
		System.out.println("saldo = " + contaBancaria.saldo);
		System.out.println("******************\n\n");

		System.out.println("****** CONTATO ******");
		System.out.println("nome = " + contato.nome);
		System.out.println("numero = " + contato.numero);
		System.out.println("numero 2 = " + contato.numero2);
		System.out.println("*********************");
	}

}
