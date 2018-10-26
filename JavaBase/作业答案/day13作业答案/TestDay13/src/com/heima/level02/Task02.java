package com.heima.level02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class Task02 {
	/**
	 * 需求:
	 * 		统计当前项目下info2.txt文件中, 每个字符出现的个数
	 * 			文件内容如下:
	 * 					welcome to itheima!!!
	 * 			最终效果如下:
	 * 					w(1) (2)!(3)t(2)e(3)c(1)a(1)o(2)l(1)m(2)h(1)i(2)
	 * 			
	 */
	public static void main(String[] args) throws IOException {
		// 1. 创建HashMap集合, 用于统计每个字符出现的次数
		HashMap<Character, Integer> hm = new HashMap<>();
		// 2. 创建输入流对象关联数据源
		FileInputStream fis = new FileInputStream("info2.txt");
		
		int b;
		
		while((b = fis.read()) != -1){
			// 3. 读取到文件中的每一个字符
			char c = (char) b;
			// 4. 判断字符是否是第一次出现, 如果是的话, 键的位置存当前字符, 值的位置存1
			if(!hm.containsKey(c)){
				hm.put(c, 1);
			}else {
				// 如果不是第一次出现, 键的位置还是当前字符, 值的位置需要将原本记录的值取出, 然后+1存储
				hm.put(c, hm.get(c) + 1);
			}
		}
		
		
		// 5. 创建字符串缓冲区, 用于拼接结果
		StringBuilder sb = new StringBuilder();
		// 6. 将数据从集合中取出, 并拼接
		for (Entry<Character, Integer> en : hm.entrySet()) {
			sb.append(en.getKey()).append("(").append(en.getValue()).append(")");
		}
		// 7. 创建输出流对象
		FileOutputStream fos = new FileOutputStream("info2.txt");
		// 8. 调用write方法写出出具
		fos.write(sb.toString().getBytes());
		// 9. 关闭流释放资源
		fis.close();
		fos.close();
	}
}
