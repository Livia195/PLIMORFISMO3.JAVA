package entities;

public class PessoaJuridica extends Contribuintes{
	
	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica() {
	}
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(name, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	@Override
	public Double valorDoImposto() {
		if(numeroDeFuncionarios>10) {
			return rendaAnual*0.14;
		}
		else{
			return rendaAnual * 0.16;
		}
		
	}
	}
