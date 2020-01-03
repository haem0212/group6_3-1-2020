package com.oto.oto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;



@Service
public class OtoService {
	@Autowired
	OtoDao service;
	public List<Oto> getAllDataOto(){
		return service.findAll();
	}
	public void insertOneOto(Oto oto) {
		service.save(oto);
	}
	public void deleteOneOto(Integer maOto) {
		service.deleteById(maOto);
	}
	public void updateOneOto(Oto oto) {
		service.save(oto);
	}
	public List<Oto> SearchOto(String hangOto,String ngayNhap){
		Oto oto = new  Oto();
		oto.setHangOto(hangOto);
		oto.setNgayNhap(ngayNhap);
		
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("maOto")
				.withIgnorePaths("tenOto")
				.withIgnorePaths("soLuong")
				.withIgnorePaths("mauSac")
				.withIgnorePaths("chucVu");
		return service.findAll(Example.of(oto,exampleMatcher));
	}
	
}
