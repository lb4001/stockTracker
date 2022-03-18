package org.bitfly.stocktrack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Test {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String name;

    public Test() {}

    public Test(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Test))
            return false;
        Test test = (Test) o;
        return Objects.equals(this.id, test.id) && Objects.equals(this.name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Test{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
    }
}
