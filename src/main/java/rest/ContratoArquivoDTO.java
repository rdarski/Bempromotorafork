
package rest;

import arquitetura.rest.AbstractRestDTO;

public class ContratoArquivoDTO extends AbstractRestDTO {

	private Long idArquivo;
	
	private ContratoDTO contrato;

	public Long getIdArquivo(){
		return this.idArquivo;
	}

	public void setIdArquivo(Long idArquivo){
        	this.idArquivo = idArquivo;
	}

	public ContratoDTO getContrato(){
		return this.contrato;
	}

	public void setContrato(ContratoDTO contrato){
        	this.contrato = contrato;
	}
	
}
