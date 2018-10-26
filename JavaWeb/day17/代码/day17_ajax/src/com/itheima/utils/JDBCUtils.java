package com.itheima.utils;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {

	static ComboPooledDataSource cpds = new ComboPooledDataSource();

	// 获得连接
	public static Connection getConnection() throws Exception {
		return cpds.getConnection();
	}

	// 获取连接池
	public static DataSource getDataSource() {
		return cpds;
	}
}