package ait.com.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Student {

	private Integer sid;
	private String sname;
	private String scourse;	
	private String gender;
	private String courseName;
	//private Set<String> language;
	
}
