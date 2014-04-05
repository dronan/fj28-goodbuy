package br.com.caelum.goodbuy.controller;

import java.util.List;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Message;
import br.com.caelum.vraptor.validator.ValidationMessage;

@Resource
public class ProdutosController {

	private final ProdutoDao dao;
	private final Result result;
	private final Validator validator;

	public ProdutosController(ProdutoDao dao, Result result, Validator validator) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
	}

	public List<Produto> lista() {
		return dao.listaTudo();
	}

	public void adiciona(Produto produto) {
		valida(produto);
		validator.onErrorUsePageOf(ProdutosController.class).formulario();
		dao.salva(produto);
		result.redirectTo(this).lista();
	}

	public void valida(Produto produto){

		if (produto.getNome() == null || produto.getNome().length() < 3){
			validator.add(new ValidationMessage("Nome é obrigatório e precisa ter mais de 3 letras", "produto.nome"));
		}
		
		if (produto.getDescricao() == null || produto.getDescricao().length() > 40){
			validator.add(new ValidationMessage("Obrigação é obrigatória e não pode ter mais de 40 caracteres", "produto.descricao"));
		}
		
		if (produto.getPreco() == null || produto.getPreco() <= 0){
			validator.add(new ValidationMessage("Preço precisa ser positivo", "produto.preco"));
		}
		
		
	}
	
	public void formulario() {
	}

	public Produto edita(Long id) {
		return dao.carrega(id);
	}

	public void altera(Produto produto) {
		valida(produto);
		validator.onErrorUsePageOf(ProdutosController.class).edita(produto.getId());
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}

	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}
}
