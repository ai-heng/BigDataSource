package com.itheima.level02;

/*
分析以下需求，并用代码实现
	1.定义Person类
		属性：
			姓名name、性别gender、年龄age、国籍nationality；
		方法：吃饭eat、睡觉sleep，工作work。
	2.根据人类，派生一个学生类Student
		增加属性：
			学校school、学号stuNumber；
		重写工作方法（学生的工作是学习）。	
	3.根据人类，派生一个工人类Worker
		增加属性：
			单位unit、工龄workAge；
		重写工作方法（工人的工作是盖房子）。
	4.根据学生类，派生一个学生干部类 StudentLeader
		增加属性：
			职务job；
		增加方法：开会meeting。
	5.编写测试类分别对上述3类具体人物进行测试。
	6.要求运行结果:
		学生需要学习!
		工人的工作是盖房子!
		学生干部喜欢开会!
 */
public class Task01 {
	public static void main(String[] args) {
		Student s = new Student("静静", "female", 20, "中国", "黑马", "heima001");
		System.out.println(s.getName() + ":::" + s.getGender() +"::" + s.getAge() + "::" + s.getNationality()+ ":::" + s.getSchool() + "::" + s.getStuNumber());
		s.work();
		
		Worker w = new Worker("金三胖", "male", 50, "朝鲜", "家里蹲", 10);
		w.work();
		
		StudentLeader leader = new StudentLeader("芳芳", "male", 38, "中国", "杭州体育学院", "NO1", "服务");
		leader.work();
	}
}
