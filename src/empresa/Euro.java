package empresa;

import java.util.Objects;

public class Euro extends Moeda {
	
	public Euro(double valor) {
		super(valor);
	}
	
	@Override
	void info() {
		System.out.println("Euro: " + valor);
	}

	@Override 
	public String toString() {
		return "Euro " + valor;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	double converter() {
		return valor * 5;
	}
	
}
