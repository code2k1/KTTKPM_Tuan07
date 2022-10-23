package com.example.OnThiGKKTTKPM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String maNV;
	@Column(name = "Ten")
	private String ten;
	@Column(name = "Luong")
	private double luong;
	
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String maNV, String ten, double luong) {
		super();
		this.maNV = maNV;
		this.ten = ten;
		this.luong = luong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "NhanVien [MaNV=" + maNV + ", ten=" + ten + ", luong=" + luong + "]";
	}
	
}
