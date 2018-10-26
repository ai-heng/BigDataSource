package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.PageBean;
import cn.itcast.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 需求: 查询分页显示数据
    public PageBean<User> queryPageData(int pageNum, int numPerPage) {
        // 改造需求: 使用分页助手 完成分页查询
        PageHelper.startPage(pageNum, numPerPage);

        // 1 查询分页显示数据
        // select * from tb_user limit 开始索引, 每页显示条数
        List<User> rows = userMapper.queryAll();

        // 2 查询总记录数
        // select count(*) from tb_user
        PageInfo<User> pageInfo = new PageInfo<User>(rows);
        Long total = pageInfo.getTotal();

        // 3 将1和2封装到pagebean中
        PageBean<User> pageBean = new PageBean<User>();
        pageBean.setTotal(total);
        pageBean.setRows(rows);

        // 4 返回pagebea
        return pageBean;
    }

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public void editUser(User user) {
        userMapper.editUser(user);
    }

    public void delByIds(List<Long> ids) {
        userMapper.delByIds(ids);
    }
}
