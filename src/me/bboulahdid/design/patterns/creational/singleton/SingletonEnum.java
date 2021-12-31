package me.bboulahdid.design.patterns.creational.singleton;

/**
 * A great article about singleton design pattern best practices:
 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
public enum SingletonEnum {
    INSTANCE;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
