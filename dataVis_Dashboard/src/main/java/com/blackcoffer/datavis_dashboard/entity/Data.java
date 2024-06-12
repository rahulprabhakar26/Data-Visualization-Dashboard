package com.blackcoffer.datavis_dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "data")
public class Data {

    
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
	@Id
    @Column(name = "end_year")
    private Integer endYear;

    @Column(name = "citylng")
    private Double cityLng;

    @Column(name = "citylat")
    private Double cityLat;

    @Column(name = "intensity")
    private Integer intensity;

    @Column(name = "sector")
    private String sector;

    @Column(name = "topic")
    private String topic;

    @Column(name = "insight")
    private String insight;

    @Column(name = "swot")
    private String swot;

    @Column(name = "URL")
    private String url;

    @Column(name = "region")
    private String region;

    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "impact")
    private String impact;

    @Column(name = "added")
    //@Temporal(TemporalType.DATE)
    private String added;

    @Column(name = "published")
    //@Temporal(TemporalType.DATE)
    private String published;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "relevance")
    private Integer relevance;

    @Column(name = "pestle")
    private String pestle;

    @Column(name = "source")
    private String source;

    @Column(name = "title")
    private String title;

    @Column(name = "likelihood")
    private Integer likelihood;

    // 0-param constructor
	public Data() {
		super();
	}

	// param- constructor
	public Data(Integer endYear, Double cityLng, Double cityLat, Integer intensity, String sector,
			String topic, String insight, String swot, String url, String region, Integer startYear, String impact,
			String added, String published, String city, String country, Integer relevance, String pestle, String source,
			String title, Integer likelihood) {
		super();
		//this.id = id;
		this.endYear = endYear;
		this.cityLng = cityLng;
		this.cityLat = cityLat;
		this.intensity = intensity;
		this.sector = sector;
		this.topic = topic;
		this.insight = insight;
		this.swot = swot;
		this.url = url;
		this.region = region;
		this.startYear = startYear;
		this.impact = impact;
		this.added = added;
		this.published = published;
		this.city = city;
		this.country = country;
		this.relevance = relevance;
		this.pestle = pestle;
		this.source = source;
		this.title = title;
		this.likelihood = likelihood;
	}

    // Getters and Setters
	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public Double getCityLng() {
		return cityLng;
	}

	public void setCityLng(Double cityLng) {
		this.cityLng = cityLng;
	}

	public Double getCityLat() {
		return cityLat;
	}

	public void setCityLat(Double cityLat) {
		this.cityLat = cityLat;
	}

	public Integer getIntensity() {
		return intensity;
	}

	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getInsight() {
		return insight;
	}

	public void setInsight(String insight) {
		this.insight = insight;
	}

	public String getSwot() {
		return swot;
	}

	public void setSwot(String swot) {
		this.swot = swot;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getStartYear() {
		return startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getRelevance() {
		return relevance;
	}

	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}

	public String getPestle() {
		return pestle;
	}

	public void setPestle(String pestle) {
		this.pestle = pestle;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(Integer likelihood) {
		this.likelihood = likelihood;
	}

	// toStringmethod
	@Override
	public String toString() {
		return "Data [endYear=" + endYear + ", cityLng=" + cityLng + ", cityLat=" + cityLat
				+ ", intensity=" + intensity + ", sector=" + sector + ", topic=" + topic + ", insight=" + insight
				+ ", swot=" + swot + ", url=" + url + ", region=" + region + ", startYear=" + startYear + ", impact="
				+ impact + ", added=" + added + ", published=" + published + ", city=" + city + ", country=" + country
				+ ", relevance=" + relevance + ", pestle=" + pestle + ", source=" + source + ", title=" + title
				+ ", likelihood=" + likelihood + "]";
	}
	



    
}
