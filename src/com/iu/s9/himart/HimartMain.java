package com.iu.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		// Tv, Computer, Phone
		Tv tv = new Tv();
		Computer computer = new Computer();
		Phone phone = new Phone();
		
		computer.brand = "올인원pc";
		computer.company = "SAMSUNG";
		computer.cpu = "i7";
		computer.price = 70;
		computer.point = 7;
		
		phone.brand = "아이폰13";
		phone.company = "APPLE";
		phone.pixel = 100;
		phone.price = 140;
		phone.point = 14;
		
		
		tv.brand = "올레드TV";
		tv.company = "LG";
		tv.size = 65;
		tv.price = 120;
		tv.point = 12;
		
		Client iu = new Client();
		iu.money = 1000;
		iu.point = 0; 
		iu.buy(computer);
		

	}

}
