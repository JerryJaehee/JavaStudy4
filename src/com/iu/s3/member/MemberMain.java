package com.iu.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(40);
		member.setHeight(180.8);
		member.setEmail("wowo@gmail.com");
		System.out.println(member.getAge());
		System.out.println(member.getHeight());
		System.out.println(member.getEmail());
	}

}
