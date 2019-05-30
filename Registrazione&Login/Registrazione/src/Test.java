import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Eccezioni, IOException {
		// TODO Auto-generated method stub
		
		Passeggero p = new Passeggero();
		Passeggeri passeggeri=new Passeggeri();
		Scanner sc = new Scanner(System.in); //string
		Scanner sb = new Scanner(System.in); //int
		
		System.out.println("Premere 0 per registrarsi, 1 per il login ");
		
		int scelta = sb.nextInt();
//		int scelta=0;
		if(scelta==0) {
			//REGISTRAZIONE
			int flag=0; 
			while(flag==0)
			{
				System.out.println("Digitare il nome: ");
				String nome = sc.nextLine();
				System.out.println("Digitare il cognome: ");
				String cognome = sc.nextLine();
				System.out.println("Digitare la cittadinanza: ");
				String cittadinanza = sc.nextLine();
				System.out.println("Digitare la citta' di nascita: ");
				String citta = sc.nextLine();
				System.out.println("Digitare il numero di telefono: ");
				String telefono = sc.nextLine();
				System.out.println("Digitare l'username: ");
				String username = sc.nextLine();
				System.out.println("Digitare la password: ");
				String password = sc.nextLine();
				
				p = new Passeggero(nome,cognome,cittadinanza,citta,telefono,username,password);
				flag = p.Controllo(p);
				if(flag==1)
				{
					System.out.println("Password errata. Riprovare");
					flag=0;
				}
				else if(flag==2)
				{
					System.out.println("Nome errato. Riprovare");
					flag=0;
				}
				else if(flag==3)
				{
					System.out.println("Cognome errato. Riprovare");
					flag=0;
				}
				else if(flag==4)
				{
					System.out.println("Citta' di nascita errata. Riprovare");
					flag=0;
				}
				else if(flag==5)
				{
					System.out.println("Cittadinanza errata. Riprovare");
					flag=0;
				}
				else if(flag==6)
				{
					System.out.println("Numero di telefono errato. Riprovare");
					flag=0;
				}
				else if(flag==7)
				{
					System.out.println("Dati esatti");
					passeggeri.Registrazione(p);
					System.out.println("Dati:");
					String elenco = passeggeri.elenco();
					System.out.println(elenco);
				}
			
			}
			
		}
		//scelta=1;
		else if(scelta==1) {
			//LOGIN
			int flag2=0;
			while(flag2==0) {
				System.out.println("Digitare l'username: ");
				String username = sc.nextLine();
				System.out.println("Digitare la password: ");
				String password = sc.nextLine();
				boolean controllo = passeggeri.Login(username, password);
				if(controllo==false) {
					System.out.println("Dati inesatti. Riprovare");
				}
				else {
					System.out.println("Dati esatti");
					flag2=1;
				}
			}
			
			
		}
		
	}
}//prova
