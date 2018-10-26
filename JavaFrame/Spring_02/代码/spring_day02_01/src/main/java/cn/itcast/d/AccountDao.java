package cn.itcast.d;

// 模拟操作数据库
public class AccountDao {
    // 出账
    public void out(String outAccount, double money) {
        System.out.println(outAccount + "出账" + money + "元钱! ===============");
    }
    // 入账
    public void in(String inAccount, double money) {
        System.out.println(inAccount + "入账" + money + "元钱! ===============");
    }
}
