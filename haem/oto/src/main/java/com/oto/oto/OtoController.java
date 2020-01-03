package com.oto.oto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OtoController {
	@Autowired
	OtoService service;
	@CrossOrigin(value = "*")
	@RequestMapping(value ="/getAllDataOto")
	public List<Oto> getAllDataOto(){
		return service.getAllDataOto();
	}
	@RequestMapping(value = "/insertOneOto")
	public boolean insertOneOto(@RequestBody Oto oto) {
		service.insertOneOto(oto);
		return true;
	}
	@RequestMapping(value = "/deleteOneOto")
	public boolean deleteOneOto(@RequestBody Oto Oto) {
		 service.deleteOneOto(Oto.getMaOto());
		 return true;
	}
	@RequestMapping(value = "/updateOneOto")
	public boolean updateOneOto(@RequestBody Oto oto) {
		service.updateOneOto(oto);
		return true;
	}
	@CrossOrigin(value = "*")
	@RequestMapping(value ="/searchOto")
	public List<Oto> SearchOto(@RequestParam(name = "hangOto") String hangOto,
														@RequestParam(name = "ngayNhap") String ngayNhap){
		return service.SearchOto(hangOto,ngayNhap);
	}

}
