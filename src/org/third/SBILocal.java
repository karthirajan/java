package org.third;

public class SBILocal extends SBI{

	@Override
	public void fixedDeposit() {
		
		System.out.println("fixed deposit");
		
	}

	@Override
	public void loanAcc() {
		
		System.out.println("loan amount is 50000");
		
	}
	
	public static void main(String[] args) {
		SBILocal s = new SBILocal();
		s.currentAcc();
		s.savingAcc();
		s.fixedDeposit();
		s.loanAcc();
	}

}
