import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Passeggeri implements Serializable{

private ArrayList <Passeggero> passeggeri;

public Passeggeri() {
	passeggeri=new ArrayList<>();

}
public void addPasseggero(Passeggero p) {
	passeggeri.add(p.clone());
}

public void deletePasseggero(String code) throws Eccezioni{
	Iterator<Passeggero>i;
	for(i=passeggeri.iterator(); i.hasNext();) {
		Passeggero passeggero = i.next();
		if(passeggero.getCodice().equals(code)) {
			i.remove();
		}
	}
	throw new Eccezioni("Passeggero sconosciuto");
}

//gestione registrazione
public void Registrazione(Passeggero p) throws Eccezioni{
	
	addPasseggero(p);
	//salvataggio su file
	try {
		salvaPasseggeri();
		} 
	catch (IOException e) {
	//	e.printStackTrace();
		
		throw new Eccezioni("Salvataggio non effettuato");
		}
}


public String elenco() {
	String elenco="";
	for(Passeggero passeggero : passeggeri) {
		elenco += passeggero.toString();
		elenco += "\r\n";
	}
	return elenco;
}

//gestione file (binari)

public void salvaPasseggeri() throws java.io.IOException{
	ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("daticlienti.bin"));
	stream.writeObject(this.passeggeri);
	stream.close();
}
public void caricaPasseggeri() throws java.io.IOException{
	ObjectInputStream stream = new ObjectInputStream(new FileInputStream("daticlienti.bin"));
	try{
		this.passeggeri=(ArrayList <Passeggero>)stream.readObject();
	}
	catch(ClassNotFoundException e){
	stream.close();
	}
}


}