import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class File implements Serializable{

private ArrayList <Passeggero> dati;

public File() {
	dati=new ArrayList<>();

}
public void addDati(Passeggero p) {
	dati.add(p.clone());
}


}