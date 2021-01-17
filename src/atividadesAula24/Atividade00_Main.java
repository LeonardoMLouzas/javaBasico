package atividadesAula24;

import java.util.Date;

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
		livro.dataPublicacao = new Date(2014, 11, 10);
		livro.editora = "Fantástica Rocco";
		livro.genero = "Ficção Cientçífica";
		livro.titulo = "Doctor Who: 12 Doutores, 12 histórias";

		Atividade03 livroVenda = new Atividade03();
		livroVenda.autor = "Eoin Colfer";
		livroVenda.dataPublicacao = new Date();
		livroVenda.genero = "Ficção Científica";
		livroVenda.titulo = "Doctor Who: 12 Doutores, 12 histórias";
		livroVenda.valor = 29.90;

		Atividade04 livroLivraria = new Atividade04();
		livroLivraria.autor = "Eoin Colfer";
		livroLivraria.cliente = "Leonardo M Louzas";
		livroLivraria.dataDevolucao = new Date(2021, 12, 31);
		livroLivraria.dataEmprestimo = new Date(2021, 01, 01);
		livroLivraria.dataPublicacao = new Date(2014, 11, 10);
		livroLivraria.genero = "Ficção Científica";
		livroLivraria.titulo = "Doctor Who: 12 Doutores, 12 histórias";

		Atividade05 contaBancaria = new Atividade05();
		contaBancaria.especial = false;
		contaBancaria.limite = 999999;
		contaBancaria.numero = 123456789;
		contaBancaria.saldo = 95214.94;

		Atividade06 contato = new Atividade06();
		contato.telefones = new String[5];
		contato.nome = "Leo";
		contato.email = "leo@leo.com";
		contato.telefones[0] = "55 61 99999-9999";
		contato.telefones[1] = "55 61 99999-9998";

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
		System.out.println("data de publicação= " + livro.dataPublicacao);
		System.out.println("editora = " + livro.editora);
		System.out.println("gênero = " + livro.genero);
		System.out.println("titulo = " + livro.titulo);
		System.out.println("**********************************************\n\n");

		System.out.println("*************** LIVRO À VENDA ****************");
		System.out.println("autor = " + livroVenda.autor);
		System.out.println("data de publicação= " + livroVenda.dataPublicacao);
		System.out.println("valor = " + livroVenda.valor);
		System.out.println("gênero = " + livroVenda.genero);
		System.out.println("titulo = " + livroVenda.titulo);
		System.out.println("**********************************************\n\n");

		System.out.println("************* LIVRO DE LIVRARIA **************");
		System.out.println("autor = " + livroLivraria.autor);
		System.out.println("cliente = " + livroLivraria.cliente);
		System.out.println("data de devolução = " + livroLivraria.dataDevolucao);
		System.out.println("data de empréstimo = " + livroLivraria.dataEmprestimo);
		System.out.println("data de publicação = " + livroLivraria.dataPublicacao);
		System.out.println("gênero = " + livroLivraria.genero);
		System.out.println("título = " + livroLivraria.titulo);
		System.out.println("**********************************************\n\n");

		System.out.println("* CONTA BANCÁRIA *");
		System.out.println("especial = " + contaBancaria.especial);
		System.out.println("número = " + contaBancaria.numero);
		System.out.println("saldo = " + contaBancaria.saldo);
		System.out.println("******************\n\n");

		System.out.println("****** CONTATO ******");
		System.out.println("nome = " + contato.nome);
		System.out.println("numero = " + contato.telefones[0]);
		System.out.println("numero 2 = " + contato.telefones[1]);
		System.out.println("*********************");
	}

}
