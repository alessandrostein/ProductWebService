package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.Produto;

public class ProdutoDAO {

	public List<Produto> obterCervejas() {
		
		List<Produto> cervejas = new ArrayList<Produto>();
		
		Produto cerveja1 = new Produto();
		cerveja1.setNome("Cerveja Stannis");
		cerveja1.setDescricao("Cerveja feito artesanalmente com toque Irlandês");
		cerveja1.setPreco(7.00);
		cerveja1.setQuantidade(50);
		cerveja1.setUnidadeDeMedida("litro");
		cerveja1.setVolume("dm3");
		
		cervejas.add(cerveja1);
		
		Produto cerveja2 = new Produto();
		cerveja2.setNome("Cerveja Heineken");
		cerveja2.setDescricao("Heineken International é uma cervejaria holandesa, fundada em 1863 "
						 	+ "por Wandscheer Heineken na cidade de Amsterdã. ");
		cerveja2.setPreco(7.00);
		cerveja2.setQuantidade(48);
		cerveja2.setUnidadeDeMedida("litro");
		cerveja2.setVolume("dm3");
		
		cervejas.add(cerveja2);
		
		Produto cerveja3 = new Produto();
		cerveja3.setNome("Cerveja Stella Artois");
		cerveja3.setDescricao("A Stella Artois é uma cerveja pilsner lager (de baixa fermentação) "
							+ "premium, que tem suas origens em uma tradicional cervejaria chamada "
							+ "Den Hoorn, que data em 1366, uma das mais antigas do mundo.");
		cerveja3.setPreco(7.00);
		cerveja3.setQuantidade(26);
		cerveja3.setUnidadeDeMedida("litro");
		cerveja3.setVolume("dm3");
		
		cervejas.add(cerveja3);
		
		Produto cerveja4 = new Produto();
		cerveja4.setNome("Cerveja Karavelle");
		cerveja4.setDescricao("Ccrvejas e chopes super premium, puro malte, que utilizam "
							+ "matérias-primas extremamente selecionadas. ");
		cerveja4.setPreco(7.00);
		cerveja4.setQuantidade(11);
		cerveja4.setUnidadeDeMedida("litro");
		cerveja4.setVolume("dm3");
		
		cervejas.add(cerveja4);
		
		return cervejas;
	}

}
