package com.itheima.level02;
/*
1.定义如下方法public static String getPropertyGetMethodName(String property)
	功能描述:
		(1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
		(2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
2.定义如下方法public static String getPropertySetMethodName(String property)
	功能描述:
		(1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的set方法的名字
		(2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"setName"
 */
public class Task06 {
	public static void main(String[] args) {
		String name = getPropertyGetMethodName("address");
		System.out.println("name:"+name);
	}
	
	/*
	 * 应该将方法中形参中的头一个字母变成大写，后边的字母全部改成小写进行拼接
	 * 其次让get与方法中改变后的字母进行拼接，将拼接后的结果返回即可。
	 */
	public static String getPropertyGetMethodName(String property){
//		property.substring(0, 1).toUpperCase()
//		"name" ---> Name
//		"N" + "ame" 
		// 思路： 1、将name中的首字母获取出来变成大写
		// 2、 将name中的除首字母外，其余其母获取出来并变成小写。
		// 3、 创建StringBuilder对象。
		// 4、 利用StringBuilder对用中的append方法，将"get"与第一步骤与第二步骤中的字符串进行拼接。
		// 5、 利用StringBuilder对象的toString方法将字符串返回即可。
		StringBuilder sb = new StringBuilder().append("get").append((property.substring(0, 1).toUpperCase())).append(property.substring(1).toLowerCase());
		return sb.toString();
	}
	
	public static String getPropertySetMethodName(String property){
		StringBuilder sb = new StringBuilder();
		sb.append("set").append(property.substring(0,1).toUpperCase()).append(property.substring(1).toLowerCase());
		return sb.toString();
	}
}
