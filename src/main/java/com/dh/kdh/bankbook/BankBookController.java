package com.dh.kdh.bankbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bankbookList", bankBookService.getList());
		mv.setViewName("bankbook/list");
		
		return mv;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add() {
		
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(BankBookDTO bankBookDTO) throws Exception {
		int result = bankBookService.setBankBook(bankBookDTO);
		
		return "";
	}
	
}
