package bank.det; 
import com.det.bk.*;

public class AxisBank extends RbiBank {
	public void branchName() {
		System.out.println("OLDHARBOUR");
	}
	public void branchLocation() {
		System.out.println("TUTICORIN");
	}
	public void ifscCode() {
		System.out.println("UTIB0000129");
	}
	public static void main (String[] args) {
		AxisBank axis = new AxisBank();
		axis.branchName();
		axis.branchLocation();
		axis.ifscCode();
		axis.aadharName();
		axis.aadharNumber();
	}

}
