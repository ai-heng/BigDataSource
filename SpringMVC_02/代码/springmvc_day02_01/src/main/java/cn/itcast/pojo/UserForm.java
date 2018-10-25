package cn.itcast.pojo;

import java.util.List;

public class UserForm {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "users=" + users +
                '}';
    }
}
