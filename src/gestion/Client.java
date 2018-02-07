package gestion;
import java.io.Serializable;
public class Client implements Serializable {
	public static final long serialongversion = 1L;
	private String NomClient;
	private int ClientId;
	
	public Client(String NomClient, int ClientId ) {
		
	this.NomClient = NomClient;
	this.ClientId = ClientId;
	}
	public String getNomClient() {
		return NomClient;
	}
	public void setNomClient(String NomClient) {
		this.NomClient = NomClient ; 
	}
	public int getClientId() {
		return ClientId;
	}
	public void setClientId(int ClientId){
		this.ClientId = ClientId;
	}

}
