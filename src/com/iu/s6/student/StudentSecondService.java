package com.iu.s6.student;

public class StudentSecondService extends StudentService{

	@Override // StudentService의 추상메서드 오버라이딩
	public StudentDTO setStudent() {
		//studentDTOSecond 입력 하는 코드 생성
		StudentDTOSecond studentDTOSecond = new StudentDTOSecond();
		
		return studentDTOSecond;
	}
}
