package com.itheima_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���ı��ļ��ж�ȡѧ�����ݵ�ArrayList�����У�����������
 * ÿһ��������Ϊһ��ѧ��Ԫ��
 * 
 * it001,������,35,����
 * ��������Ҫʹ��String���е�һ��������split()
 * 
 * ������
 * 		A:�����ַ���������������
 * 		B:�������϶���
 * 		C:��ȡ���ݣ�ÿһ�ζ�ȡһ�����ݣ��Ѹ���������취��װ��ѧ�����󣬲���ѧ������洢��������
 * 		D:�ͷ���Դ
 * 		E:��������
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		// �����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("students.txt"));

		// �������϶���
		ArrayList<Student> array = new ArrayList<Student>();

		// ��ȡ���ݣ�ÿһ�ζ�ȡһ�����ݣ��Ѹ���������취��װ��ѧ�����󣬲���ѧ������洢��������
		String line;
		while ((line = br.readLine()) != null) {
			// it001,������,35,����
			String[] strArray = line.split(",");

			Student s = new Student();
			s.setSid(strArray[0]);
			s.setName(strArray[1]);
			s.setAge(Integer.parseInt(strArray[2]));
			s.setCity(strArray[3]);

			array.add(s);
		}

		// �ͷ���Դ
		br.close();

		// ��������
		for (Student s : array) {
			System.out.println(s.getSid() + "---" + s.getName() + "---" + s.getAge() + "---" + s.getCity());
		}
	}
}
