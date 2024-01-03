package com.sgtesting.assinmentday25;
interface StateGovt{
	void stateGovtFund(long statefund);
	
}
interface DistrictGovt{
	void districtGovtFund(int districtfund);
	
}
interface TalukGovt{
	void talukGovtFund(int talukfund);
}
abstract class StateGovtFundDemo{
	void releseFund(long relesefund) {
		System.out.println("Relese fund Amount :-"+relesefund);
	}
}
class CentralGovt extends StateGovtFundDemo implements StateGovt,DistrictGovt,TalukGovt{

	@Override
	public void talukGovtFund(int talukfund) {
		System.out.println("Taluk fund = " + talukfund);
		
	}

	@Override
	public void districtGovtFund(int districtfund) {
		System.out.println("District fund = " +districtfund);
		
	}

	@Override
	public void stateGovtFund(long statefund) {
		System.out.println("State fund = "+statefund);
		
	}
	
}

public class Q2SubClassExtendsAbstractClass {
	public static void main(String[] args) {
		CentralGovt cg = new CentralGovt();
		cg.stateGovtFund(999999999);
		cg.districtGovtFund(88888888);
		cg.talukGovtFund(777777);
		cg.releseFund(1111111111);
		
	}

}
