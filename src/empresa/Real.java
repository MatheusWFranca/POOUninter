package empresa;

import java.util.Objects;

public class Real extends Moeda {
	
	public Real(double valor) {
		super(valor);
	}
	
	@Override
	void info() {
		System.out.println("Real: " + valor);
	}

	@Override 
	public String toString() {
		return "Real " + valor;
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
		Real other = (Real) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	double converter() {
		return valor;
	}

}
