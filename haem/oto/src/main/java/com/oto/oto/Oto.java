package com.oto.oto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Oto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int maOto;
	public String tenOto;
	public String hangOto;
	public String ngayNhap;
	public int soLuong;
	public String mauSac;
	public String kieuDang;
	
	public Oto() {
		super();
	}
	public Oto(int maOto, String tenOto, String hangOto, String ngayNhap, int soLuong, String mauSac, String kieuDang) {
		super();
		this.maOto = maOto;
		this.tenOto = tenOto;
		this.hangOto = hangOto;
		this.ngayNhap = ngayNhap;
		this.soLuong = soLuong;
		this.mauSac = mauSac;
		this.kieuDang = kieuDang;
	}
	public int getMaOto() {
		return maOto;
	}
	public void setMaOto(int maOto) {
		this.maOto = maOto;
	}
	public String getTenOto() {
		return tenOto;
	}
	public void setTenOto(String tenOto) {
		this.tenOto = tenOto;
	}
	public String getHangOto() {
		return hangOto;
	}
	public void setHangOto(String hangOto) {
		this.hangOto = hangOto;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public String getKieuDang() {
		return kieuDang;
	}
	public void setKieuDang(String kieuDang) {
		this.kieuDang = kieuDang;
	}
	
	
}
