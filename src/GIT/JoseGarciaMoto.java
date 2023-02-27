package GIT;

public class JoseGarciaMoto {
	public String marca;
	public int numMatr;
	public int numKm;
	public String moto;

public JoseGarciaMoto(String marca, String comb, int numMatr,
		int numKm, String moto) {
		super();
		this.marca = marca;
		this.numMatr = numMatr;
		this.numKm = numKm;
		this.moto = moto;

	}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}
//
//
public int getNumMatr() {
	return numMatr;
}

public void setNumMatr(int numMatr) {
	this.numMatr = numMatr;
}

public int getNumKm() {
	return numKm;
}

public void setNumKm(int numKm) {
	this.numKm = numKm;
}

public String getMoto() {
	return moto;
}

public void setMoto(String moto) {
	this.moto = moto;
}
}
