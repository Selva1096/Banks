package com.det.bk;

public class SbiBank extends RbiBank {
	public void branchName() {
		System.out.println("XAVIERSCOLLEGE");
	}
	public void branchLocation() {
		System.out.println("TIRUNELVELI");
	}
	public void ifscCode() {
		System.out.println("SBI00000106");
	}
	public static void main (String[] args) {
		SbiBank sbi = new SbiBank();
		sbi.branchName();
		sbi.branchLocation();
		sbi.ifscCode();
		sbi.aadharName();
		sbi.aadharNumber();
	}

}
