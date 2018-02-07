package gestion;
import java.io.Serializable;
public class Compte extends Client implements Serializable {

	public static final long serialVersionUID = 1L;
	private int accNumber;
	private float accBalance;
	private float BenefitRate;

	public Compte(int accNumber, float accBalance, float BenefitRate, Client c) {
		super(c.getNomClient(), c.getClientId());
		this.accNumber = accNumber;
		this.accBalance = accBalance;
		this.BenefitRate = BenefitRate;

	}
	public int getaccNumber() {
		return accNumber;
	}
	public void setaccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public float getaccBalance() {
		return accBalance;
	}
	public void setaccBalance(float accBalance) {
		this.accBalance=accBalance;
	}
	public float getBenefitRate() {
		return BenefitRate;
	}
	public void setBenefitRate(float BenefitRate) {
		this.BenefitRate= BenefitRate;
	}
}
