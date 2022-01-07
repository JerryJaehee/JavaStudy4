package com.iu.s5;

public class MyGodMain {

	public static void main(String[] args) {
		//클래스메소드...머??
		//SingleTon .....
		MyGod myGod  = MyGod.makeGod();
		
		System.out.println(myGod);
		MyGod my2 = MyGod.makeGod();
		System.out.println(my2);
		System.out.println(MyGod.makeGod());
		System.out.println(MyGod.makeGod());
		System.out.println(MyGod.makeGod());

	}

}
