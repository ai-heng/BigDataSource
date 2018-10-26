package com.itheima.dao;

import com.itheima.domain.Pcd;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class PcdDao {
    public List<Pcd> findPcdByPid(int pid) {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "SELECT * FROM province_city_district WHERE pid = ? ;";
        try {
            return qr.query(sql, new BeanListHandler<>(Pcd.class),pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
