package entities;

public abstract class Contribuintes {
	private String name;
	protected Double rendaAnual;
	
	public Contribuintes() {
	}

	public Contribuintes(String name, Double rendaAnual) {
		super();
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double valorDoImposto();
	
	public String toString() {
		return name
				+": $"
				+rendaAnual;
	}
	
	
	

}
