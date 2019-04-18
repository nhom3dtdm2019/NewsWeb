package com.tuankietnguyen.tintuconline.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="bantin")

public class BanTin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO )
	private int maBanTin;
	private int maLoaiTin;
	private int maHinhAnh;
	private String tenBanTin;
	private String tomTat;
	private String noiDung;
	private String tacGia;
	@Temporal(TemporalType.TIMESTAMP)
	private Date ngayDang;
	private int soLuotXem;
	private int soLuotLike;
	
	
	public BanTin() {
		
	}
	
	public BanTin(int maLoaiTin, int maHinhAnh, String tenBanTin, String tomTat, String noiDung, String tacGia,
			Date ngayDang, int soLuotXem, int soLuotLike) {
		super();
		this.maLoaiTin = maLoaiTin;
		this.maHinhAnh = maHinhAnh;
		this.tenBanTin = tenBanTin;
		this.tomTat = tomTat;
		this.noiDung = noiDung;
		this.tacGia = tacGia;
		this.ngayDang = ngayDang;
		this.soLuotXem = soLuotXem;
		this.soLuotLike = soLuotLike;
	}
	public BanTin(int maBanTin, int maLoaiTin, int maHinhAnh, String tenBanTin, String tomTat, String noiDung,
			String tacGia, Date ngayDang, int soLuotXem, int soLuotLike) {
		super();
		this.maBanTin = maBanTin;
		this.maLoaiTin = maLoaiTin;
		this.maHinhAnh = maHinhAnh;
		this.tenBanTin = tenBanTin;
		this.tomTat = tomTat;
		this.noiDung = noiDung;
		this.tacGia = tacGia;
		this.ngayDang = ngayDang;
		this.soLuotXem = soLuotXem;
		this.soLuotLike = soLuotLike;
	}
	public int getMaBanTin() {
		return maBanTin;
	}
	public void setMaBanTin(int maBanTin) {
		this.maBanTin = maBanTin;
	}
	public int getMaLoaiTin() {
		return maLoaiTin;
	}
	public void setMaLoaiTin(int maLoaiTin) {
		this.maLoaiTin = maLoaiTin;
	}
	public int getMaHinhAnh() {
		return maHinhAnh;
	}
	public void setMaHinhAnh(int maHinhAnh) {
		this.maHinhAnh = maHinhAnh;
	}
	public String getTenBanTin() {
		return tenBanTin;
	}
	public void setTenBanTin(String tenBanTin) {
		this.tenBanTin = tenBanTin;
	}
	public String getTomTat() {
		return tomTat;
	}
	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public Date getNgayDang() {
		return ngayDang;
	}
	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}
	public int getSoLuotXem() {
		return soLuotXem;
	}
	public void setSoLuotXem(int soLuotXem) {
		this.soLuotXem = soLuotXem;
	}
	public int getSoLuotLike() {
		return soLuotLike;
	}
	public void setSoLuotLike(int soLuotLike) {
		this.soLuotLike = soLuotLike;
	}
	@Override
	public String toString() {
		return "BanTin [maBanTin=" + maBanTin + ", maLoaiTin=" + maLoaiTin + ", maHinhAnh=" + maHinhAnh + ", tenBanTin="
				+ tenBanTin + ", tomTat=" + tomTat + ", noiDung=" + noiDung + ", tacGia=" + tacGia + ", ngayDang="
				+ ngayDang + ", soLuotXem=" + soLuotXem + ", soLuotLike=" + soLuotLike + "]";
	}
	
}
