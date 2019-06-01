package application;

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
	});
	annulla.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
		//annulla();
	});
}
	
	

}
 