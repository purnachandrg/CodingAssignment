package com.palindrome.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.palindrome.demo.bean.Palindrome;

public interface PalindromeRepository extends MongoRepository<Palindrome, String>{

}
