package com.itheima.level02;

import java.util.ArrayList;

/*
1.定义Student类
属性:
	姓名：String name
	年龄：int age
	成绩：int score
行为:
	空参构造方法
	有参构造方法
	set和get方法
	toString方法
2.定义测试类,进行测试
(1)创建10个学生对象存入ArrayList集合中
(2)打印最高分的学员姓名、年龄、成绩  [要求封装1个方法  参数是集合对象   返回值类型为Student]
(3)打印10个学生的总成绩和平均分		 [要求封装两个方法完成]
(4)打印不及格的学员信息及数量		 [要求封装一个方法完成]
*/
public class Task03 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("张三", 23, 30));
		list.add(new Student("李四", 24, 50));
		list.add(new Student("王五", 25, 30));
		list.add(new Student("赵六", 26, 86));
		list.add(new Student("田七", 27, 75));
		list.add(new Student("小明", 28, 60));
		list.add(new Student("旺财", 29, 70));
		list.add(new Student("萌萌", 30, 90));
		list.add(new Student("小翠", 18, 99));
		list.add(new Student("黄俊", 19, 80));

		// (2)打印最高分的学员姓名、年龄、成绩 [要求封装1个方法 参数是集合对象 返回值类型为Student]
		Student stu = getMaxScoreStu(list);
		System.out.println(stu);

		// (3)打印10个学生的总成绩和平均分[要求封装两个方法完成]
		int sum = getSumScore(list);
		int avg = getAverageScore(list);
		System.out.println("总成绩：" + sum + ",平均成绩：" + avg);

		// (4)打印不及格的学员信息及数量 [要求封装一个方法完成]
		printFailStuInfo(list);
	}

	private static Student getMaxScoreStu(ArrayList<Student> list) {
		Student s = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (s.getScore() < list.get(i).getScore()) {
				s = list.get(i);
			}
		}
		return s;
	}

	// 总成绩
	public static int getSumScore(ArrayList<Student> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			sum += s.getScore();
		}
		return sum;
	}

	// 平均成绩
	public static int getAverageScore(ArrayList<Student> list) {
		return getSumScore(list) / list.size();
	}

	// (4)打印不及格的学员信息及数量 [要求封装一个方法完成]
	public static void printFailStuInfo(ArrayList<Student> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getScore() < 60) {
				System.out.println(list.get(i));
				count++;
			}
		}
		System.out.println("不及格学生共有：" + count + "个");
	}
}
