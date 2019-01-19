package com.company.items;

import java.util.Objects;

public class GameItem {
    protected String name;

    public GameItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameItem{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameItem gameItem = (GameItem) o;
        return Objects.equals(name, gameItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
