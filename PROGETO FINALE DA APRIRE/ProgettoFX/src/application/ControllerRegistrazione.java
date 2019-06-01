package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerRegistrazione 
{
	@FXML TextField nome, cognome, nazione, citta, gg, mm, yyyy, email, password;
	@FXML Button registrati, annulla;
	private StringProperty Nome, Cognome, Nazione, Citta, Gg, Mm, Yyyy, Email, Password;
	private ArrayList <Passeggero> passeggeri;
	
public void initialize()
{
	nome.textProperty().bindBidirectional(Nome);
	cognome.textProperty().bindBidirectional(Cognome);
	nazione.textProperty().bindBidirectional(Nazione);
	citta.textProperty().bindBidirectional(Citta);
	gg.textProperty().bindBidirectional(Gg);
	mm.textProperty().bindBidirectional(Mm);
	yyyy.textProperty().bindBidirectional(Yyyy);
	email.textProperty().bindBidirectional(Email);
	password.textProperty().bindBidirectional(Password);
	
	registrati.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
		//registrazione();
		addPasseggero(p);
		//salvataggio su file
		try {
			salvaPasseggeri();
			} 
		catch (IOException e) {
		//	e.printStackTrace();
			
			throw new Eccezioni("Salvataggio non effettuato");
			}
	});
	annulla.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
		//annulla();
	});
	
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
	
	

}
 