package empresa;

import java.util.Objects;

public class Dolar extends Moeda {
		
	public Dolar(double valor) {
		super(valor);
	}
	
	void info() {
		System.out.println("DOLAR: " + valor);
	}
	
	@Override 
	public String toString() {
		return "Dolar " + valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(valor);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	double converter() {
		return valor * 5;
	}

	
}
