package com.itheima_06;

/*
 * ¶¯Îï£º
 * 	eat()
 * Ã¨£º
 * 	eat()
 * 	playGame()
 * ¹·£º
 * 	eat()
 * 	lookDoor()
 */
public class DuoTaiTest {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		
		Cat c = (Cat) a;
		c.eat();
		c.playGame();
		
		a = new Dog();
		a.eat();
		
		Dog d = (Dog) a;
		d.eat();
		d.lookDoor();
	}
}
