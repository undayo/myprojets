package gestion;
import java.io.Serializable;

public class Banque implements Serializable {
	private static final long servialVersionUID = 1L;
	private set<Compte> accounts;
	private set<Transaction>transactionType;
	private StorageUtilities storageUtilities:
	public Banque(StorageUtilities storageUtilities){
		initialize();
	}
	public void initialize() {
		
		Banque b = storageUtilities.retrieveDate();
		this.setAccounts(b.getAccounts());
		t
	}

}
