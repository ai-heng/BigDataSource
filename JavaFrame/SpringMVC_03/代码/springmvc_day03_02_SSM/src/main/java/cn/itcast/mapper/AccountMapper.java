package cn.itcast.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    // 出账
    public void out(@Param("name") String outAccount, @Param("money") double money);

    // 入账
    public void in(@Param("name") String inAccount, @Param("money") double money);

}
