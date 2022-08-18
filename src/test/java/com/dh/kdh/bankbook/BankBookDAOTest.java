package com.dh.kdh.bankbook;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dh.kdh.MyAbstractTest;

public class BankBookDAOTest extends MyAbstractTest {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test
	public void setBankBook() throws Exception {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("JunitTestBook");
		bankBookDTO.setBookRate(7.77);
		
		int result = bankBookDAO.setBankBook(bankBookDTO);
		
		assertEquals(1, result);
	}

}
