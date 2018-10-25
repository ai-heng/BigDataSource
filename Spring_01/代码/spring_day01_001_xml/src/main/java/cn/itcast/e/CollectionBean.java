package cn.itcast.e;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
    private List list;
    private Map map;
    private Set set;
    private Properties props;

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", props=" + props +
                '}';
    }
}
