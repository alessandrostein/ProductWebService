package br.com.magabrew.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

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
