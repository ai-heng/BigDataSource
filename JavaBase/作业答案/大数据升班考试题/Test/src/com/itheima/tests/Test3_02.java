package com.itheima.tests;

/*
 * ��֪�ַ���String str = 
"heimaheimawoaiheima,buguanheimahaishibaima,zhaodaogongzuojiushihaoma"; 
����: д����ʵ�ֲ��������ַ����С�heima���ַ������ֵĴ���,���������ӡ������̨��.
	ȥ��heima֮����ַ����ﲻ�ܰ���heima�ַ���
��ʾ:
1.	����һ��int���͵ı�����������.

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
