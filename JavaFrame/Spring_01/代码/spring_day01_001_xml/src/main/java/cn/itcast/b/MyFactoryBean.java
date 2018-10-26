package cn.itcast.b;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Bean3> {
    @Override
    public Bean3 getObject() throws Exception {
        return new Bean3();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
