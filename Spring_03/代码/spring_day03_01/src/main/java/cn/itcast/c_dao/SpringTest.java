package cn.itcast.c_dao;

import cn.itcast.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void demo01() {
        Book book = new Book();
        book.setName("九阳神功02");
        book.setPrice(8.8);
        bookDao.add(book);
    }

    @Test
    public void demo02() {
        Book book = new Book();
        book.setId(4);
        book.setName("九阴白骨爪");
        book.setPrice(7.7);
        bookDao.edit(book);
    }

    @Test
    public void demo03() {
        bookDao.delById(4);
    }

    @Test
    public void demo04() {
        String name = bookDao.queryNameById(5);
        System.out.println(name);
    }

    @Test
    public void demo05() {
        int total = bookDao.queryTotal();
        System.out.println("======================= 总记录数: " + total);
    }

    @Test
    public void demo06() {
        Book book = bookDao.queryBookById(1);
        System.out.println("======================= 书籍信息: " + book);
    }

    @Test
    public void demo07() {
        List<Book> bookList = bookDao.queryAll();
        for (Book book : bookList) {
            System.out.println("========================= " + book);
        }
    }
}
