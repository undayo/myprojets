package gestion;
import java.io.Serializable;
import java.util.Date;
public class Transaction implements Serializable {
	public static final long serialongversion = 1L;
	private TransactionType transactionType ; 
	private Date transactionDate;
	private float amount;
	private Compte compte;
	
	
	public Transaction(TransactionType transactionType, Date transactionDate,float amount, Compte compte) {
		this.transactionType = transactionType;
		this.transactionDate= transactionDate;
		this.amount = amount;
		this.compte = compte;
	}
		public TransactionType getTransactionType() {
			return  transactionType ;	
		}
		public void setTransaction(TransactionType transactionType) {
			this.transactionType = transactionType;
		}
		public Date getTransactioDate() {
			return transactionDate;
		}
		public void setTransactionDate(Date transactionDate) {
			this.transactionDate = transactionDate ;
		}
		public float getamount() {
			return amount;
		}
		public void setamount(float amount) {
			this.amount= amount;
		}
		public Compte getcompte() {
			return compte;
		}
		public void setcompte(Compte compte) {
			this.compte=compte;
		}
		@Override
		public int hashCode() {
			final int prime=31;
			int result = 1;
			result = prime * result + Float.floatToIntBits(amount);
			result = prime * result + ((transactionDate == null) ? 0 : transactionDate.hashCode());
			result = prime * result + ((transactionType == null )? 0 : transactionType.hashCode());
			return result;
		}
		@Override 
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if(obj == null)
				return false;
			if(getClass() != obj.getClass())
				return false;
			Transaction other = (Transaction)obj;
			if(Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
				return false;
			if(transactionDate == null) {
				if (other.transactionDate != null)
					return false;
			}else if (!transactionDate.equals(other.transactionDate))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Transaction[transactionType="+  transactionType  + ", transactionDate=" + transactionDate +", amount"+ amount + ", compte=" + compte + "]";

		}
}
