package com.itheima.level02;

/*
�����⣺����������ɴ���:
	1.���嶯����   abstract Animal
		���ԣ�
			���䣬��ɫ
		��Ϊ:
			eat(String something)����(�޾�����Ϊ,��ͬ����Եķ�ʽ�Ͷ�����һ��,something��ʾ�ԵĶ���)
			���ɿղ��вι��죬set��get����

	2.���幷��̳ж�����	  
		��Ϊ:
			eat(String something)����,����lookHome����(�޲���)

	3.����è��̳ж�����
		��Ϊ:eat(String something)����,������catchMouse����(�޲���)

	4.����Person��
		���ԣ�
			����������
		��Ϊ��
			keepPet(Dog dog,String something)����
				���ܣ�ι�����ﹷ��something��ʾι���Ķ���
		��Ϊ��
			keepPet(Cat cat,String something)����
				���ܣ�ι������è��something��ʾι���Ķ���
		���ɿղ��вι��죬set��get����  

	5.���������(������´�ӡЧ��):

		keepPet(Dog dog,String somethind)������ӡ�������£�
			����Ϊ30�����������һֻ����ɫ��2��ĳ���
			2��ĺ���ɫ�Ĺ���ֻǰ�������ı�ס��ͷ�ͳ�

		keepPet(Cat cat,String somethind)������ӡ�������£�
			����Ϊ25�����������һֻ����ɫ��3��ĳ���
			3��Ļ���ɫ��è�����۾�����ͷ����
*/
public class Task04 {
	public static void main(String[] args) {
		Cat c = new Cat(3, "��ɫ");
		Person p = new Person("����", 20);
		p.keepPet(c, "��");
	}
}

class Person{
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public void keepPet(Dog2 dog,String something){
		System.out.println("����Ϊ"+age+"���"+name+"����һֻ"+dog.getColor()+"��"+dog.getAge()+"��ĳ���");
		dog.eat(something);
	}
	public void keepPet(Cat cat,String something){
		System.out.println("����Ϊ"+age+"���"+name+"����һֻ"+cat.getColor()+"��"+cat.getAge()+"��ĳ���");
		cat.eat(something);
	}*/
	public void keepPet(Animal2 a,String something){
		if(a instanceof Dog2){
			Dog2 dog = (Dog2)a;
			System.out.println("����Ϊ"+age+"���"+name+"����һֻ"+dog.getColor()+"��"+dog.getAge()+"��ĳ���");
			dog.eat(something);
		} else if(a instanceof Cat){
			Cat cat = (Cat)a;
			System.out.println("����Ϊ"+age+"���"+name+"����һֻ"+cat.getColor()+"��"+cat.getAge()+"��ĳ���");
			cat.eat(something);
		} 
	}
}

class Cat extends Animal2{
	public Cat() {
		super();
	}

	public Cat(int age, String color) {
		super(age, color);
	}

	@Override
	public void eat(String something) {
		System.out.println(this.getAge() + "���"+this.getColor()+"��è�����۾�����ͷ��"+something);
	}
	
	public void catchMouse(){
		System.out.println("������");
	}
}

class Dog2 extends Animal2{
	public Dog2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog2(int age, String color) {
		super(age, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(String something) {
		System.out.println(this.getAge() + "���"+this.getColor()+"�Ĺ���ֻǰ�������ı�ס"+something+"�ͳ�");
	}
	
	public void lookHome(){
		System.out.println("����");
	}
}

abstract class Animal2 {
	private int age;
	private String color;

	public Animal2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal2(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void eat(String something);

}
