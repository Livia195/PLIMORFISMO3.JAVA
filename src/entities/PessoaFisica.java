package entities;

public class PessoaFisica extends Contribuintes {
	
	private Double gastosComSaude;
	
	public PessoaFisica() {
		
	}
	
	

	public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
		super(name, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}



	public Double getGastosComSaude() {
		return gastosComSaude;
	}



	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}



	@Override
	public Double valorDoImposto() {
	
			if(rendaAnual<2000 && gastosComSaude!=0) {
			
			return (rendaAnual *0.15)-(gastosComSaude*0.50);
				}
			else if (rendaAnual>2000 && gastosComSaude!=0) {
				return (rendaAnual *0.25)-(gastosComSaude*0.50);
			}
			else if (rendaAnual<2000 && gastosComSaude==0) {
				return (rendaAnual *0.15);
		}
			else return  rendaAnual*0.25;
	}
}
