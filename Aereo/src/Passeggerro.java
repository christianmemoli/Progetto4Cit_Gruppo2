
public class Passeggerro {

private String cognome;
private String nome;
private String nazioneNascita;
private String cittaNascista;
private Date dana;
private String codiceFiscale;

public Passeggerro(String cognome, String nome, String nazioneNascita, String cittaNascista, Date dana,
		String codiceFiscale) {
	
	this.cognome = cognome;
	this.nome = nome;
	this.nazioneNascita = nazioneNascita;
	this.cittaNascista = cittaNascista;
	this.dana = dana;
	this.codiceFiscale = codiceFiscale;
}

public Passeggerro(Passeggerro p) {
	
	this.cognome = p.getCognome();
	this.nome = p.getNome();
	this.nazioneNascita = p.getNazioneNascita();
	this.cittaNascista = p.getCittaNascista();
	this.dana = p.getDana();
	this.codiceFiscale = p.getCodiceFiscale();
}

public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNazioneNascita() {
	return nazioneNascita;
}
public void setNazioneNascita(String nazioneNascita) {
	this.nazioneNascita = nazioneNascita;
}
public String getCittaNascista() {
	return cittaNascista;
}
public void setCittaNascista(String cittaNascista) {
	this.cittaNascista = cittaNascista;
}
public Date getDana() {
	return dana;
}
public void setDana(Date dana) {
	this.dana = dana;
}
public String getCodiceFiscale() {
	return codiceFiscale;
}
public void setCodiceFiscale(String codiceFiscale) {
	this.codiceFiscale = codiceFiscale;
}

@Override
public String toString() {
	return "Passeggerro [cognome=" + cognome + ", nome=" + nome + ", nazioneNascita=" + nazioneNascita
			+ ", cittaNascista=" + cittaNascista + ", codiceFiscale=" + codiceFiscale + "]";
}

}
