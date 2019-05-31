package application;


public class Passeggero implements Cloneable, java.io.Serializable
{
	
private String cognome;
private String nome;
private String nazioneNascita;
private String cittaNascita;
private String codice;
private String numeroTelefonico;
private String username;
private String password;

public Passeggero() {
	
	this.cognome = null;
	this.nome = null;
	this.nazioneNascita = null;
	this.cittaNascita = null;
	this.codice= null;
	this.numeroTelefonico = null;
	this.username = null;
	this.password = null;
}

public Passeggero(String nome, String cognome, String nazioneNascita, String cittaNascita, String numero, String username, String password) {
	
	this.cognome = cognome;
	this.nome = nome;
	this.nazioneNascita = nazioneNascita;
	this.cittaNascita = cittaNascita;
	this.codice=generaCodice();
	this.numeroTelefonico = numero;
	this.username = username;
	this.password = password;
}

public Passeggero clone() {
	Passeggero p = new Passeggero(this.nome, this.cognome, this.nazioneNascita, this.cittaNascita, this.numeroTelefonico, this.username, this.password);
	return p;
}

public String generaCodice() {
	long seed = 14567809;
	Random rnd = new Random(seed);
	String code = this.nome+this.cognome+rnd;
	return code;
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
public String getCittaNascita() {
	return cittaNascita;
}
public void setCittaNascita(String cittaNascita) {
	this.cittaNascita = cittaNascita;
}

public String getCodice() {
	return codice;
}
public void setCodice(String codiceFiscale) {
	this.codice = codiceFiscale;
}

public String getNumeroTelefonico() {
	return numeroTelefonico;
}
public void setNumeroTelefonico(String numero) {
	this.numeroTelefonico = numero;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String toString() {
	return "Nome: " + this.nome + ", Cognome: " + this.cognome + ", Nazionalita': " + this.nazioneNascita
			+ ", Citta' di nascita: " + this.cittaNascita + ", Codice: " + this.codice + ", Numero di telefono: "+ this.numeroTelefonico + ", Username: "+ this.username + ", Password: " + this.password;
}

public int Controllo(Passeggero p) {
	//controllo lunghezza password
	String s1 = p.getPassword();
	int length = s1.length();
	if(length<8)
		return 1;
	//controllo del nome senza numeri
	String s2 = p.getNome();
	for(int i=0; i<s2.length(); i++)
	{
		if(s2.charAt(i)>=48 && s2.charAt(i)<=57)
			return 2;
	}
	//controllo del nome senza numeri
	String s3 = p.getCognome();
	for(int i=0; i<s3.length(); i++)
	{
		if(s3.charAt(i)>=48 && s3.charAt(i)<=57)
			return 3;
	}
	//controllo del citta senza numeri
	String s4 = p.getCittaNascita();
	for(int i=0; i<s4.length(); i++)
	{
		if(s4.charAt(i)>=48 && s4.charAt(i)<=57)
			return 4;
	}
	//controllo della cittadinanza senza numeri
	String s5 = p.getNazioneNascita();
	for(int i=0; i<s5.length(); i++)
	{
		if(s5.charAt(i)>=48 && s5.charAt(i)<=57)
			return 5;
	}
	//controllo lunghezza telefono
	String s6 = p.getNumeroTelefonico();
	int length2 = s6.length();
	if(length2!=10)
		return 6;
	//controllo del numero senza lettere
	/*for(int i=0; i<s6.length(); i++)
	{
		if(s6.charAt(i)<=48 && s6.charAt(i)>=57)
			return 6;
	}*/
	return 7; //dati corretti
}
}
