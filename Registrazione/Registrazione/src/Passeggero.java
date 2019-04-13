
public class Passeggero implements Cloneable, java.io.Serializable{
	
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
	return cognome;
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
	//controllo lunghezza
	String str = p.getPassword();
	int length = str.length();
	if(length<8)
		return 1;
	//controllo del nome senza numeri
	String st = p.getNome();
	for(int i=0; i<st.length(); i++)
	{
		if(st.charAt(i)>=48 && st.charAt(i)<=57)
			//numero nel nome
			return 2;
	}

	//controllo del nome senza numeri
	String sp = p.getCognome();
	for(int i=0; i<sp.length(); i++)
	{
		if(sp.charAt(i)>=48 && sp.charAt(i)<=57)
			//numero nel cognome
			return 3;
	}
	/*//controllo del citta senza numeri
		String sc = p.getCittaNascita();
		for(int i=0; i<sc.length(); i++)
		{
			if(sc.charAt(i)>=48 && sc.charAt(i)<=57)
				//numero nel nome
				return 2;
		}


	/*	//controllo della cittadinanza senza numeri
		String st = p.getCittaNascita();
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)>=48 && st.charAt(i)<=57)
				//numero nel nome
				return 2;
		}*/


	return 4; //dati corretti
}
}
