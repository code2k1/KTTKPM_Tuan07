package com.example.OnThiGKKTTKPM.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietChungNhanPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String maNhanVien;
	private int maMayBay;
	
	public ChiTietChungNhanPK() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(maMayBay, maNhanVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietChungNhanPK other = (ChiTietChungNhanPK) obj;
		return maMayBay == other.maMayBay && Objects.equals(maNhanVien, other.maNhanVien);
	}
	
	
}
