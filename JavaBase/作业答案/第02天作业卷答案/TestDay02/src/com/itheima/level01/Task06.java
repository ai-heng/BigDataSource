package com.itheima.level01;

import java.util.Scanner;

/*
 * 键盘录入学生考试成绩，判断学生等级:
	90-100	优秀
	80-90	好
	70-80	良
	60-70	及格
	60以下	不及格
 */
public class Task06 {
	public static void main(String[] args) {
		//1. 键盘录入学生考试成绩 int类型
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学生的成绩：");
		int score = sc.nextInt();
		/*
		 * 2.判断学生等级
		 * 	90-100	优秀
			80-90	好
			70-80	良
			60-70	及格
			0 -60	不及格
			分数<0 或者 分数>100 ， 提示分数有误
		 */
		if (score<0 || score>100) {//分数<0 或者 分数>100 
			System.out.println("输入的分数有误");
		} else if (score >= 90 && score <= 100){//	90-100	优秀
			System.out.println("优秀");
		} else if (score >=80 && score < 90){//80-90	好
			System.out.println("好");
		} else if (score >=70 && score < 80){//70-80	良
			System.out.println("良");
		} else if (score >=60 && score < 70){//60-70	及格
			System.out.println("及格");
		} else {//0 -60	不及格
			System.out.println("不及格");
		}
		
	}
}
