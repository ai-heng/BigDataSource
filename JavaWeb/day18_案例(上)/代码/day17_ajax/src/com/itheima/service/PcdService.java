package com.itheima.service;

import com.itheima.dao.PcdDao;
import com.itheima.domain.Pcd;
import flexjson.JSONSerializer;

import java.util.List;

public class PcdService {
    /**
     * 根据pid, 获取所有的信息
     * @return
     */
    public String findPcdByPid(int pid) {
        //调用dao层, 获取数据.
        PcdDao pd = new PcdDao();
        List<Pcd> list = pd.findPcdByPid(pid);

        //将获取到的数据转成: json字符串.
        //结果返回给web层.
        return new JSONSerializer().exclude("*.class").serialize(list);
    }
}
