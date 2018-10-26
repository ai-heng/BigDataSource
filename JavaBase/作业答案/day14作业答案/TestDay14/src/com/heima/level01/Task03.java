package com.heima.level01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Task03 {
	/**
	 * һ��	����˵����
		a)	��������Student�������Ϣд�뵱ǰ��Ŀ�µ�stuInfo.txt����
		b)	�ٶ�ȡstuInfo.txt�����ݵ������У��������ϴ�ӡ����
	       ����	����˵����
		a)	д����Ϣ�ĸ�ʽ�� it001,������,35,����
		b)	�����Ϣ�ĸ�ʽ�� it001,������,35,����


		������
			1.	����Student�࣬���ڷ�װ����
			2.	�������϶��󣬽�ѧ��������ӵ�������
			3.	����������������stuInfo.txt�ļ�
			4.	�������϶����ȡ��ÿһ��Student, ����StringBuilderƴ�ӳ�ָ���ĸ�ʽ��д��
			5.	�ر����������
			6.	����BufferedReader�������������stuInfo.txt, ��Ϊ�ж�ȡһ�еķ���
			7.	�������϶������ڴ洢��ȡ����Student(Ҳ���Խ�ԭ�������)
			8.	����ȡ����ÿһ������ͨ��split�����и�ٽ��и�����Ϣ��װ��Student����
			9.	��ѧ��������ӵ�������
			10.	�ر�����������
			11.	�������ϲ���ӡ

	 */
	public static void main(String[] args) throws IOException {
		// 2.�������϶��󣬽�ѧ��������ӵ�������
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("it001", "������", 35, "����"));
		list.add(new Student("it002", "������", 33, "�Ϻ�"));
		list.add(new Student("it003", "����ϼ", 30, "����"));
		
		// 3.����������������stuInfo.txt�ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("stuInfo.txt"));
		// 4.�������϶����ȡ��ÿһ��Student, ����StringBuilderƴ�ӳ�ָ���ĸ�ʽ��д��
		for (Student s : list) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",")
					.append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		// 5.�ر����������
		bw.close();
		
		// 6.����BufferedReader�������������stuInfo.txt, ��Ϊ�ж�ȡһ�еķ���
		BufferedReader br = new BufferedReader(new FileReader("stuInfo.txt"));
		// 7.�������϶������ڴ洢��ȡ����Student(Ҳ���Խ�ԭ�������)
		list.clear();
		// 8.����ȡ����ÿһ������ͨ��split�����и�ٽ��и�����Ϣ��װ��Student����
		String line;
		while ((line = br.readLine()) != null) {
			// it001,������,35,����
			String[] strArray = line.split(",");

			Student s = new Student();
			s.setId(strArray[0]);
			s.setName(strArray[1]);
			s.setAge(Integer.parseInt(strArray[2]));
			s.setAddress(strArray[3]);
			// 9.��ѧ��������ӵ�������
			list.add(s);
		}
		
		// 10.�ر�����������
		br.close();
		
		// 11.�������ϲ���ӡ
		for (Student s : list) {
			System.out.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
		}
	}
}
