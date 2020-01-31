package com.hexaware.MLP194.model;

class Wallet
{
    int WLT_PT;
    int WLT_NO;
    int CUS_ID;
    public Wallet() {
    }
    public Wallet(int wLT_PT, int wLT_NO, int cUS_ID) {
		WLT_PT = wLT_PT;
		WLT_NO = wLT_NO;
		CUS_ID = cUS_ID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CUS_ID;
		result = prime * result + WLT_NO;
		result = prime * result + WLT_PT;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wallet other = (Wallet) obj;
		if (CUS_ID != other.CUS_ID)
			return false;
		if (WLT_NO != other.WLT_NO)
			return false;
		if (WLT_PT != other.WLT_PT)
			return false;
		return true;
	}
	public int getWLT_PT() {
		return WLT_PT;
	}
	public void setWLT_PT(int wLT_PT) {
		WLT_PT = wLT_PT;
	}
	public int getWLT_NO() {
		return WLT_NO;
	}
	public void setWLT_NO(int wLT_NO) {
		WLT_NO = wLT_NO;
	}
	public int getCUS_ID() {
		return CUS_ID;
	}
	public void setCUS_ID(int cUS_ID) {
		CUS_ID = cUS_ID;
	}

}