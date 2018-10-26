package cn.itcast.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {
	static ComboPooledDataSource cpds = new ComboPooledDataSource();

	// 获取连接
	public static Connection getConnection() throws SQLException{
		return cpds.getConnection();
	}
	
	// 获取连接池
	public static DataSource getDataSource() throws SQLException{
		return cpds;
	}
}
