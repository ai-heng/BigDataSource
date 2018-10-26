package com.itheima.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtils {
	static ComboPooledDataSource cpds = new ComboPooledDataSource();

	// 获取连接池
	public static DataSource getDataSource() {
		return cpds;
	}

	// 获取连接
	public static Connection getConnection() throws SQLException {
		return cpds.getConnection();
	}
}
