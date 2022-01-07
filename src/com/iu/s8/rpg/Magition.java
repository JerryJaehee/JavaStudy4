package com.iu.s8.rpg;

public class Magition extends Character implements Act{
	//마법사 is a 캐릭터
	//마법사 has a 캐릭터
	int mp;
	
	@Override
	public void attack() {
		this.spel(); //새로 만들기 힘들다면 이미 존재하는 메소드를 내부적으로 호출 가능
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	private void spel() {  //외부에서 접근 못하고 내부에서만 접근 가능하게 접근지정자를 private으로 변경
		System.out.println("마법 공격");
	}
}
