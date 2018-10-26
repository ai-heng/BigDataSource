package cn.itcast.c_dao;

import cn.itcast.pojo.Book;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class BookDao extends JdbcDaoSupport {

    // 添加一本书
    public void add(Book book) {
        String sql = "insert into book(id, name, price) values(null, ?, ?)";
        Object[] paramArr = {book.getName(), book.getPrice()};
        getJdbcTemplate().update(sql, paramArr);
    }

    // 修改一本书
    public void edit(Book book) {
        String sql = "update book set name=?, price=? where id=?";
        Object[] paramArr = {book.getName(), book.getPrice(), book.getId()};
        getJdbcTemplate().update(sql, paramArr);
    }

    // 根据编号删除书籍
    public void delById(int id) {
        String sql = "delete from book where id=?";
        getJdbcTemplate().update(sql, id);
    }

    // 需求1: 根据编号查询书名
    public String queryNameById(int id) {
        String sql = "select name from book where id=?";
        String name = getJdbcTemplate().queryForObject(sql, String.class, id);
        return name;
    }

    // 需求2: 查询总记录数
    public int queryTotal() {
        String sql = "select count(*) from book";
        Integer total = getJdbcTemplate().queryForObject(sql, Integer.class);
        return total;
    }

    // 需求1: 根据编号查询书籍
    public Book queryBookById(int id) {
        String sql = "select * from book where id=?";
        Book book = getJdbcTemplate().queryForObject(sql, ParameterizedBeanPropertyRowMapper.newInstance(Book.class), id);
        return book;
    }

    // 需求2: 查询所有书籍集合
    public List<Book> queryAll() {
        String sql = "select * from book";
        List<Book> bookList = getJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(Book.class));
        return bookList;
    }
}
