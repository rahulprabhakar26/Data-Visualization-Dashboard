package com.blackcoffer.datavis_dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blackcoffer.datavis_dashboard.entity.Data;
import com.blackcoffer.datavis_dashboard.service.DataService;


@RestController
@CrossOrigin("*")
public class DataController {
	
	@Autowired
	DataService dataService;
	
	@GetMapping("/data")
	public List<Data>getData() {
		return dataService.getData();
	}
//	@GetMapping("/endyear")
//	public List<Data> getDataByEndYear(@PathVariable int endyear) {
//	    return dataService.getDataByEndYear(endyear);
//	}
//	
//	 @GetMapping("/country")
//	    public List<Data> getDataByCountry(@PathVariable String country) {
//	        return dataService.getDataByCountry(country);
//	    }
//
//	    @GetMapping("/topic")
//	    public List<Data> getDataByTopic(@PathVariable String topic) {
//	        return dataService.getDataByTopic(topic);
//	    }
//
//	    @GetMapping("/region")
//	    public List<Data> getDataByRegion(@PathVariable String region) {
//	        return dataService.getDataByRegion(region);
//	    }
//	    @GetMapping("/pest")
//	    public List<Data> getDataByPestle(@PathVariable String pestle) {
//	        return dataService.getDataByPestle(pestle);
//	    }
//
//	    @GetMapping("/source")
//	    public List<Data> getDataBySource(@PathVariable String source) {
//	        return dataService.getDataBySource(source);
//	    }
//
//	    @GetMapping("/swot")
//	    public List<Data> getDataBySwot(@PathVariable String swot) {
//	        return dataService.getDataBySwot(swot);
//	    }
//
//	    @GetMapping("/city")
//	    public List<Data> getDataByCity(@PathVariable String city) {
//	        return dataService.getDataByCity(city);
//	    }
//	    
//	    @GetMapping("/sector")
//	    public List<Data> getDataBySector(@PathVariable String sector) {
//	        return dataService.getDataBySector(sector);
//	    }
//	
	
	
	 @GetMapping("/filter")
	    public List<Data> getDataByFilters(
	            @RequestParam(required = false) Integer endyear,
	            @RequestParam(required = false) String topic,
	            @RequestParam(required = false) String sector,
	            @RequestParam(required = false) String region,
	            @RequestParam(required = false) String pestle,
	            @RequestParam(required = false) String source,
	            @RequestParam(required = false) String swot,
	            @RequestParam(required = false) String country,
	            @RequestParam(required = false) String city) {

	        return dataService.getDataByFilters(endyear, topic, sector, region, pestle, source, swot, country, city);
	    }
}
