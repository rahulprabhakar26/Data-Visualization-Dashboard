package com.blackcoffer.datavis_dashboard.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcoffer.datavis_dashboard.entity.Data;
import com.blackcoffer.datavis_dashboard.repository.DataRepository;
import com.blackcoffer.datavis_dashboard.service.DataService;

@Service
public  class DataServiceImpl implements DataService {
	
	@Autowired
	DataRepository dataRepo;

	@Override
	public List<Data> getData() {
		return dataRepo.findAll();
	}
//
//	@Override
//	public List<Data> getDataByEndYear(int endyear) {
//		return dataRepo.findByEndYear(endyear);
//	}
//
//	@Override
//	public List<Data> getDataByCountry(String country) {
//		return dataRepo.findByCountry(country) ;
//	}
//
//	@Override
//	public List<Data> getDataByTopic(String topic) {
//		return dataRepo.findByTopic(topic);
//	}
//
//	@Override
//	public List<Data> getDataByRegion(String region) {
//		return dataRepo.findByRegion(region);
//	}
//
//	@Override
//	public List<Data> getDataByPestle(String pestle) {
//	     return dataRepo.findByPestle(pestle);
//	}
//
//	@Override
//	public List<Data> getDataBySource(String source) {
//		return dataRepo.findBySource(source);
//	}
//
//	@Override
//	public List<Data> getDataBySwot(String swot) {
//		return dataRepo.findBySwot(swot);
//	}
//
//	@Override
//	public List<Data> getDataByCity(String city) {
//		return dataRepo.findByCity(city);
//	}
//
//	@Override
//	public List<Data> getDataBySector(String sector) {
//		return dataRepo.findBySector(sector);
//	}
	 @Override
	    public List<Data> getDataByFilters(Integer endyear, String topics, String sector, String region, String pestle, String source, String swot, String country, String city) {
	        List<Data> allData = dataRepo.findAll();
	        
	        return allData.stream().filter(data ->
	            (endyear == null || data.getEndYear().equals(endyear)) &&
	            (topics == null || data.getTopic().equalsIgnoreCase(topics)) &&
	            (sector == null || data.getSector().equalsIgnoreCase(sector)) &&
	            (region == null || data.getRegion().equalsIgnoreCase(region)) &&
	            (pestle == null || data.getPestle().equalsIgnoreCase(pestle)) &&
	            (source == null || data.getSource().equalsIgnoreCase(source)) &&
	            (swot == null || data.getSwot().equalsIgnoreCase(swot)) &&
	            (country == null || data.getCountry().equalsIgnoreCase(country)) &&
	            (city == null || data.getCity().equalsIgnoreCase(city))
	        ).collect(Collectors.toList());
	    }
}
