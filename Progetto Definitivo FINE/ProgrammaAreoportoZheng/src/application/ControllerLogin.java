package application;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerLogin 
{
	@FXML Button login,registrazione;
	@FXML TextField username,password;
		
	private ArrayList <Passeggero> passeggeri;

	
	private StringProperty Username,Password;
	
	public void initialize()
	{
		username.textProperty().bindBidirectional(Username);
		password.textProperty().bindBidirectional(Password);
		
		login.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			LOGIN();
			
		});
		
		registrazione.addEventHandler(ActionEvent.ACTION,ActionEvent ->{
			REGISTRAZIONE();
		}); 

	}
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

	
	
	private String getUsername()
	{
		return Username.get();
	}
	private String getPassword()
	{
		return Password.get();
	}
	
	public void LOGIN() 
	{
		boolean flag = false;
		caricaPasseggeri();
		Iterator<Passeggero>i;
		for(i=passeggeri.iterator(); i.hasNext();) {
			Passeggero passeggero = i.next();
			if(passeggero.getUsername().equals(username) && passeggero.getPassword().equals(password)) {
				//esatto
				flag = true;
			}
		}
	}
	
	public void REGISTRAZIONE()
	{
		/*addPasseggero(p);
		//salvataggio su file
		try {
			salvaPasseggeri();
			} 
		catch (IOException e) {
		//	e.printStackTrace();
			
			throw new Eccezioni("Salvataggio non effettuato");
			}*/
	}
}
