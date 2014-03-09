package br.com.caelum.goodbuy;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {

	public Integer inteiro(){
		return 1;
	}
	
	public String boasVindas(){
		return "Ola Mundo!";
	}
	
	public List<String> paises(){
		List<String> result = new ArrayList<String>();
		result.add("Brasil");
		result.add("Portugal");
		result.add("Jap�o");
		result.add("Canada");
		result.add("Paraguai");
		return result;
	}
	
}
