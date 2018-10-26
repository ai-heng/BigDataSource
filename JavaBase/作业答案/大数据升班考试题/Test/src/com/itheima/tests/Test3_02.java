package com.itheima.tests;

/*
 * 已知字符串String str = 
"heimaheimawoaiheima,buguanheimahaishibaima,zhaodaogongzuojiushihaoma"; 
需求: 写代码实现查找上述字符串中”heima”字符串出现的次数,并将结果打印到控制台上.
	去掉heima之后的字符串里不能包含heima字符串
提示:
1.	定义一个int类型的变量做计数器.

 */
public class Test3_02 {
	public static void main(String[] args) {
		String str = "heimaheiheimamawoaiheima,buguanheimahaishibaima,zhaodaogongzuojiushihaoma";
		
		int count  = 0;
		
		while(str.contains("heima")){
			str = str.replaceFirst("heima", " ");
			count++;
		}
		System.out.println(str);
		System.out.println(count);
	}
}
