package com.example.OnThiGKKTTKPM.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@IdClass(ChiTietChungNhanPK.class)
@Table(name = "chungnhan")
public class ChungNhan {
	@Id
	@ManyToOne
	@JoinColumn(name = "MaNV")
	private NhanVien maNhanVien;
	@Id
	@ManyToOne
	@JoinColumn(name = "MaMB")
	private MayBay maMayBay;
	
	public ChungNhan() {
		// TODO Auto-generated constructor stub
	}

	public ChungNhan(NhanVien maNhanVien, MayBay maMayBay) {
		super();
		this.maNhanVien = maNhanVien;
		this.maMayBay = maMayBay;
	}

	public NhanVien getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(NhanVien maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public MayBay getMaMayBay() {
		return maMayBay;
	}

	public void setMaMayBay(MayBay maMayBay) {
		this.maMayBay = maMayBay;
	}

	@Override
	public String toString() {
		return "ChungNhan [maNhanVien=" + maNhanVien + ", maMayBay=" + maMayBay + "]";
	}
	
}
