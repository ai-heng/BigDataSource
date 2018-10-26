package cn.itcast.utils;

import java.util.UUID;

public class CommonUtils {

	// 获取uuid
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

}
