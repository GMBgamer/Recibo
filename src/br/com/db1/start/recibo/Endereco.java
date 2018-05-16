package br.com.db1.start.recibo;

public class Endereco {
	
	private String Logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	private Integer cep;
	
	private Cidade cidade;
	
	private TipoLogradouro tipologradouro;
	
	public String getCepFormatado() {
		return cep.toString();
		
	}

}
