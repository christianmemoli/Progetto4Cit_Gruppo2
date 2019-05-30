
public class Aereo {

private String codiceVolo;
private String aereoportoPartenza;
private String aereoportoArrivo;
private Date DataVolo;
private Date oraPartenza;
private Date oraArrivo;
private int NumeroPosti;
private float costoVolo;

public Aereo(String codiceVolo, String aereoportoPartenza, String aereoportoArrivo, Date dataVolo, Date oraPartenza,
		Date oraArrivo, int numeroPosti, float costoVolo) {
	
	this.codiceVolo = codiceVolo;
	this.aereoportoPartenza = aereoportoPartenza;
	this.aereoportoArrivo = aereoportoArrivo;
	DataVolo = dataVolo;
	this.oraPartenza = oraPartenza;
	this.oraArrivo = oraArrivo;
	NumeroPosti = numeroPosti;
	this.costoVolo = costoVolo;
}


public Aereo(Aereo a) {
	
	this.codiceVolo = a.getCodiceVolo();
	this.aereoportoPartenza = a.getAereoportoPartenza();
	this.aereoportoArrivo = a.getAereoportoArrivo();
	this.DataVolo = a.getDataVolo();
	this.oraPartenza = a.getOraPartenza();
	this.oraArrivo = a.getOraArrivo();
	this.NumeroPosti = a.getNumeroPosti();
	this.costoVolo = a.getCostoVolo();
}

public String getCodiceVolo() {
	return codiceVolo;
}
public void setCodiceVolo(String codiceVolo) {
	this.codiceVolo = codiceVolo;
}
public String getAereoportoPartenza() {
	return aereoportoPartenza;
}
public void setAereoportoPartenza(String aereoportoPartenza) {
	this.aereoportoPartenza = aereoportoPartenza;
}
public String getAereoportoArrivo() {
	return aereoportoArrivo;
}
public void setAereoportoArrivo(String aereoportoArrivo) {
	this.aereoportoArrivo = aereoportoArrivo;
}
public Date getDataVolo() {
	return DataVolo;
}
public void setDataVolo(Date dataVolo) {
	DataVolo = dataVolo;
}
public Date getOraPartenza() {
	return oraPartenza;
}
public void setOraPartenza(Date oraPartenza) {
	this.oraPartenza = oraPartenza;
}
public Date getOraArrivo() {
	return oraArrivo;
}
public void setOraArrivo(Date oraArrivo) {
	this.oraArrivo = oraArrivo;
}
public int getNumeroPosti() {
	return NumeroPosti;
}
public void setNumeroPosti(int numeroPosti) {
	NumeroPosti = numeroPosti;
}
public float getCostoVolo() {
	return costoVolo;
}
public void setCostoVolo(float costoVolo) {
	this.costoVolo = costoVolo;
}


@Override
public String toString() {
	return "Aereo [codiceVolo=" + codiceVolo + ", aereoportoPartenza=" + aereoportoPartenza + ", aereoportoArrivo="
			+ aereoportoArrivo + ", DataVolo=" + DataVolo + ", oraPartenza=" + oraPartenza + ", oraArrivo=" + oraArrivo
			+ ", NumeroPosti=" + NumeroPosti + ", costoVolo=" + costoVolo + "]";
}


}
