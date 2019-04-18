package com.tuankietnguyen.tintuconline.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.tuankietnguyen.tintuconline.Model.BanTin;
import com.tuankietnguyen.tintuconline.dao.BanTinRepository;

@Service
@Transactional
public class BanTinService {

	private final BanTinRepository banTinRepository;

	public BanTinService(BanTinRepository banTinRepository) {
		
		this.banTinRepository = banTinRepository;
	}
	
	
	public List<BanTin> findAll(){
		List<BanTin> banTin = new ArrayList<>();
		for(BanTin bantin : banTinRepository.findAll()) {
			banTin.add(bantin);
		}
		return banTin;
	}
}
