package com.dh.kdh.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	//모든 데이터를 조회 최신순으로
	public List<BankBookDTO> getList() throws Exception {
		return bankBookDAO.getList();
	}
	
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setBankBook(bankBookDTO);
	}
	
}
