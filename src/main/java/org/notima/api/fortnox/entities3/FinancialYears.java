package org.notima.api.fortnox.entities3;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FinancialYears")
public class FinancialYears {

	private List<FinancialYearSubset> financialYearSubset;
	
	private Integer					totalResources;
	private Integer					totalPages;
	private Integer					currentPage;
	
	
	@XmlAttribute(name="TotalResources")
	public Integer getTotalResources() {
		return totalResources;
	}

	public void setTotalResources(Integer totalResources) {
		this.totalResources = totalResources;
	}
	
	@XmlAttribute(name="TotalPages")
	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	@XmlAttribute(name="CurrentPage")
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	@XmlElement(name="FinancialYearSubset")
	public List<FinancialYearSubset> getFinancialYearSubset() {
		return financialYearSubset;
	}

	public void setFinancialYearSubset(List<FinancialYearSubset> financialYearSubset) {
		this.financialYearSubset = financialYearSubset;
	}
	

	
	
}
