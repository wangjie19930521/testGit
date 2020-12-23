package com.huaxin;

import java.util.Objects;

/**
 * @ClassName People
 * @Description:
 * @Author wanGJ1E
 * @Date 2020/6/28
 * @Version V1.0
 **/
public class People {

    private Integer id;

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(id, people.id) &&
                Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
