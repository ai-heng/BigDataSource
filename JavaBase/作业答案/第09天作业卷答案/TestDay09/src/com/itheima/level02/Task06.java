package com.itheima.level02;
/*
1.�������·���public static String getPropertyGetMethodName(String property)
	��������:
		(1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��get����������
		(2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"
2.�������·���public static String getPropertySetMethodName(String property)
	��������:
		(1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��set����������
		(2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"setName"
 */
public class Task06 {
	public static void main(String[] args) {
		String name = getPropertyGetMethodName("address");
		System.out.println("name:"+name);
	}
	
	/*
	 * Ӧ�ý��������β��е�ͷһ����ĸ��ɴ�д����ߵ���ĸȫ���ĳ�Сд����ƴ��
	 * �����get�뷽���иı�����ĸ����ƴ�ӣ���ƴ�Ӻ�Ľ�����ؼ��ɡ�
	 */
	public static String getPropertyGetMethodName(String property){
//		property.substring(0, 1).toUpperCase()
//		"name" ---> Name
//		"N" + "ame" 
		// ˼·�� 1����name�е�����ĸ��ȡ������ɴ�д
		// 2�� ��name�еĳ�����ĸ�⣬������ĸ��ȡ���������Сд��
		// 3�� ����StringBuilder����
		// 4�� ����StringBuilder�����е�append��������"get"���һ������ڶ������е��ַ�������ƴ�ӡ�
		// 5�� ����StringBuilder�����toString�������ַ������ؼ��ɡ�
		StringBuilder sb = new StringBuilder().append("get").append((property.substring(0, 1).toUpperCase())).append(property.substring(1).toLowerCase());
		return sb.toString();
	}
	
	public static String getPropertySetMethodName(String property){
		StringBuilder sb = new StringBuilder();
		sb.append("set").append(property.substring(0,1).toUpperCase()).append(property.substring(1).toLowerCase());
		return sb.toString();
	}
}
