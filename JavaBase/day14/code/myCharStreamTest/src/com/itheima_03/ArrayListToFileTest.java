package com.itheima_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��ArrayList�����е�ѧ�����ݴ洢���ı��ļ�
 * ÿһ��ѧ��������Ϊ�ļ��е�һ������
 * 
 * ����һ��ѧ���ࡣ
 * ѧ����
 * 		ѧ�ţ����������䣬���ڳ���
 * 		it001,������,35,����
 * 		it002,������,33,�Ϻ�
 * 		it003,����ϼ,30,����
 * 
 * ������
 * 		A:�������϶���
 * 		B:����ѧ������
 * 		C:��ѧ��������ӵ�������
 * 		D:�����ַ��������������
 * 		E:�������ϣ��õ�ÿһ��ѧ������Ȼ��Ѹö��������ƴ�ӳ�һ��ָ����ʽ���ַ���д���ı��ļ�
 * 		F:�ͷ���Դ
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		// �������϶���
		ArrayList<Student> array = new ArrayList<Student>();

		// ����ѧ������
		Student s1 = new Student("it001", "������", 35, "����");
		Student s2 = new Student("it002", "������", 33, "�Ϻ�");
		Student s3 = new Student("it003", "����ϼ", 30, "����");

		// ��ѧ��������ӵ�������
		array.add(s1);
		array.add(s2);
		array.add(s3);

		// �����ַ��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

		// �������ϣ��õ�ÿһ��ѧ������Ȼ��Ѹö��������ƴ�ӳ�һ��ָ����ʽ���ַ���д���ı��ļ�
		for (Student s : array) {
			// it001,������,35,����
			StringBuilder sb = new StringBuilder();
			sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",")
					.append(s.getCity());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
	}
}
