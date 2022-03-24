package bank.det;
import com.det.bk.*;

public class CanaraBank extends RbiBank {
	public void branchName() {
		System.out.println("ADYAR");
	}
	public void branchLocation() {
		System.out.println("CHENNAI");
	}
	public void ifscCode() {
		System.out.println("CNRB0002101");
	}
	public static void main (String[] args) {
		CanaraBank c = new CanaraBank();
		c.branchName();
		c.branchLocation();
		c.ifscCode();
		c.aadharName();
		c.aadharNumber();
	}

}
