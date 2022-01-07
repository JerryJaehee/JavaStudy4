package com.iu.s6.student;

public abstract class StudentDTO {
	String name;
	int number;
	int kor;
	int eng;
	int math;
	int total;
	//public StudentDTO() {}
	public abstract int setTotal() ;  //추상메서드

	
}
