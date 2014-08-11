package br.com.magabrew.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.megabrew.dao.ProdutoDAO;
import br.com.megabrew.model.Produto;

@WebService
public class ListarCervejas {
	
	public List<Produto> listarCervejas(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		return produtoDAO.obterCervejas();
	}
	
	public static void main(String[] args){
		Endpoint.publish("http://localhost:8180/Produtos", new ListarCervejas());
		System.out.println("Serviço inicializado");
	}
	
}
