package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Ϊʲô���ּ����ࣺ
 * 		����ѧϰ�����������ı�����ԣ��������ı�����Զ��������������ͨ���������ֵģ�
 * Ϊ�˷���Զ��������в��������Ǿͱ��������������д洢����Ҫ��洢������󣬾Ͳ�����
 * �����ı����ˣ�Ӧ����һ���������͵ı������ع�����ѧ����֪ʶ������Щ���������͵���?
 * 		���飬StringBuilder
 * 		����˵StringBuilder�����Ľ����һ���ַ�������һ���������ǵ�������������ֻ��
 * ѡ�������ˣ�������ĳ��ȹ̶���������Ӧ�仯����������������£�Java���ṩ�˼����๩����ʹ�á�
 * �ɴ˿ɼ���������ĳ����ǿɱ�ġ�
 * 	
 * ��������ص㣺���ȿɱ䡣
 * 
 * Collection:�ǵ��м��ϵĶ���ӿڡ�
 * Collection ��ʾһ�������Щ����Ҳ��Ϊ collection ��Ԫ�ء�
 * һЩ collection �������ظ���Ԫ�أ�����һЩ������
 * һЩ collection ������ģ�����һЩ��������ġ�
 * JDK ���ṩ�˽ӿڵ��κ�ֱ�� ʵ�֣����ṩ��������ӽӿڣ��� Set �� List��ʵ�֡�
 * 
 * ����Collection���ϵĶ������ǲ��õ��Ƕ�̬�ķ�ʽ��ʹ�õ��Ǿ����ArrayList�ࡣ
 * ��Ϊ���������õļ����ࡣ
 * ArrayList() 
 * 
 * Collection<E>��
 * 		<E>:��һ��������������ͣ����͡��������ǻ�ʹ�þͿ����ˡ�
 * 		���ʹ����?
 * 			�ڳ���E�ĵط����������������滻���ɡ�
 * 			������Collection<String>,Collection<Student>
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//����Collection���϶���
		//JDK7�������ԣ������Ϳ���
		//Collection<String> c = new ArrayList<>(); //��̬�ķ�ʽ
		Collection<String> c = new ArrayList<String>(); //��̬�ķ�ʽ
		
		//boolean add(E e):���Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//������϶���
		System.out.println(c);
		//����˼����е�Ԫ�ذ���ָ����ʽƴ�ӵ����ݣ�˵��ArrayList��д��toString()����
	}
}
