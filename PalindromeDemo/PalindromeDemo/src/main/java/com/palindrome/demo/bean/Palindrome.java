package com.palindrome.demo.bean;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Palindrome {

	@Id
	private String id;
	@ApiModelProperty(required = true)
	private String palindrome;
}
