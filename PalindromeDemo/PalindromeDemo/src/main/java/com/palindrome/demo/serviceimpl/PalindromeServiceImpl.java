package com.palindrome.demo.serviceimpl;

import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import com.palindrome.demo.bean.Palindrome;
import com.palindrome.demo.repository.PalindromeRepository;
import com.palindrome.demo.util.PalindromeUtil;


@Component
public class PalindromeServiceImpl {

	@Autowired
	private PalindromeRepository palindromeRepository;
	
	@Autowired
	private MongoTemplate template;

	public Palindrome storePalindrome(String input) {
		Palindrome bean = getLargestPalindrome(input);
		return palindromeRepository.save(bean);		
	}
	
	private Palindrome getLargestPalindrome(String input) {
		StringTokenizer token = new StringTokenizer(input," ");
		String palindromString = "";
		while(token.hasMoreTokens()) {  
			StringBuilder sb = new StringBuilder(token.nextToken());
			if(sb.length() > palindromString.length() && sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
					palindromString = sb.toString();
			} 
	    } 
		Palindrome bean = new Palindrome();
		bean.setId(PalindromeUtil.getShortGUID());
		bean.setPalindrome(palindromString);
		return bean;
	}

	public Palindrome getPalindromeById(String id){
		return palindromeRepository.findById(id).get();
	}
	
	public List<Palindrome> getAll(){
		return palindromeRepository.findAll();
	}
}