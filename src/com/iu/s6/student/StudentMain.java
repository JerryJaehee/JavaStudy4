package com.iu.s6.student;

public class StudentMain {

	public static void main(String[] args) {
	//	StudentDTO studentDTO = new StudentDTO();
		StudentDTOSecond ss = new StudentDTOSecond();
		
		ss.kor = 10;
		ss.eng = 30;
		ss.math =20;
		ss.history = 30;
		ss.setTotal();
	}

}
