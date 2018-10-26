package com.heima.level02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class Task02 {
	/**
	 * ����:
	 * 		ͳ�Ƶ�ǰ��Ŀ��info2.txt�ļ���, ÿ���ַ����ֵĸ���
	 * 			�ļ���������:
	 * 					welcome to itheima!!!
	 * 			����Ч������:
	 * 					w(1) (2)!(3)t(2)e(3)c(1)a(1)o(2)l(1)m(2)h(1)i(2)
	 * 			
	 */
	public static void main(String[] args) throws IOException {
		// 1. ����HashMap����, ����ͳ��ÿ���ַ����ֵĴ���
		HashMap<Character, Integer> hm = new HashMap<>();
		// 2. ���������������������Դ
		FileInputStream fis = new FileInputStream("info2.txt");
		
		int b;
		
		while((b = fis.read()) != -1){
			// 3. ��ȡ���ļ��е�ÿһ���ַ�
			char c = (char) b;
			// 4. �ж��ַ��Ƿ��ǵ�һ�γ���, ����ǵĻ�, ����λ�ô浱ǰ�ַ�, ֵ��λ�ô�1
			if(!hm.containsKey(c)){
				hm.put(c, 1);
			}else {
				// ������ǵ�һ�γ���, ����λ�û��ǵ�ǰ�ַ�, ֵ��λ����Ҫ��ԭ����¼��ֵȡ��, Ȼ��+1�洢
				hm.put(c, hm.get(c) + 1);
			}
		}
		
		
		// 5. �����ַ���������, ����ƴ�ӽ��
		StringBuilder sb = new StringBuilder();
		// 6. �����ݴӼ�����ȡ��, ��ƴ��
		for (Entry<Character, Integer> en : hm.entrySet()) {
			sb.append(en.getKey()).append("(").append(en.getValue()).append(")");
		}
		// 7. �������������
		FileOutputStream fos = new FileOutputStream("info2.txt");
		// 8. ����write����д������
		fos.write(sb.toString().getBytes());
		// 9. �ر����ͷ���Դ
		fis.close();
		fos.close();
	}
}
