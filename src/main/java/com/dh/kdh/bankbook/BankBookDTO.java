package com.dh.kdh.bankbook;

import java.util.Calendar;

public class BankBookDTO {

	private Long bookNum = Calendar.getInstance().getTimeInMillis();
	private String bookName;
	private Double bookRate;
	private Integer bookSale = 1;
	
	public BankBookDTO() {}

	public BankBookDTO(Long bookNum, String bookName, Double bookRate, Integer bookSale) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookRate = bookRate;
		this.bookSale = bookSale;
	}

	public Long getBookNum() {
		return bookNum;
	}

	public void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookRate() {
		return bookRate;
	}

	public void setBookRate(Double bookRate) {
		this.bookRate = bookRate;
	}

	public Integer getBookSale() {
		return bookSale;
	}

	public void setBookSale(Integer bookSale) {
		this.bookSale = bookSale;
	}
	
	
}
