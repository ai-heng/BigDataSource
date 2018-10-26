package com.itheima.level02;

/*
第四题：根据需求完成代码:
	1.定义动物类   abstract Animal
		属性：
			年龄，颜色
		行为:
			eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
			生成空参有参构造，set和get方法

	2.定义狗类继承动物类	  
		行为:
			eat(String something)方法,看家lookHome方法(无参数)

	3.定义猫类继承动物类
		行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)

	4.定义Person类
		属性：
			姓名，年龄
		行为：
			keepPet(Dog dog,String something)方法
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法  

	5.定义测试类(完成以下打印效果):

		keepPet(Dog dog,String somethind)方法打印内容如下：
			年龄为30岁的老王养了一只黑颜色的2岁的宠物
			2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃

		keepPet(Cat cat,String somethind)方法打印内容如下：
			年龄为25岁的老李养了一只灰颜色的3岁的宠物
			3岁的灰颜色的猫眯着眼睛侧着头吃鱼
*/
public class Task04 {
	public static void main(String[] args) {
		Cat c = new Cat(3, "灰色");
		Person p = new Person("静静", 20);
		p.keepPet(c, "鱼");
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
		System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁的宠物");
		dog.eat(something);
	}
	public void keepPet(Cat cat,String something){
		System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁的宠物");
		cat.eat(something);
	}*/
	public void keepPet(Animal2 a,String something){
		if(a instanceof Dog2){
			Dog2 dog = (Dog2)a;
			System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁的宠物");
			dog.eat(something);
		} else if(a instanceof Cat){
			Cat cat = (Cat)a;
			System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁的宠物");
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
		System.out.println(this.getAge() + "岁的"+this.getColor()+"的猫眯着眼睛侧着头吃"+something);
	}
	
	public void catchMouse(){
		System.out.println("逮老鼠");
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
		System.out.println(this.getAge() + "岁的"+this.getColor()+"的狗两只前腿死死的抱住"+something+"猛吃");
	}
	
	public void lookHome(){
		System.out.println("看家");
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
