package demo31.src.com.imooc;

import java.util.Objects;

public class Cousrse {
    public String id;
    public String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cousrse)) return false;
        Cousrse cousrse = (Cousrse) o;
        return name.equals(cousrse.name);
    }

    @Override
    public int hashCode() {
        final  int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}


