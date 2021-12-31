package me.bboulahdid.design.patterns.creational.builder;

/**
 * Concepts :
 * - Handles complex constructors (large numbers of parameters)
 * - Can be used to force immutability
 * <p>
 * Ex: StringBuilder
 * <p>
 * Design : The Build pattern solve a very common problem in OOP, and that is to determine what constructor to use
 * - Flexibility over telescoping constructors (creating multiple constructors with each parameters' variation)
 * - Static inner class
 * - Calls appropriate constructor
 * - Negates the need for exposed setters
 * <p>
 * Pitfalls :
 * - Immutable
 * - Inner static class
 * - Designed first
 * - Complexity
 * <p>
 * Contrast :
 * - Builder : Handles complex constructors, no interface required, can be a separate class, works with legacy code
 * - Prototype : Implemented around a clone, avoids calling complex constructors, difficult to implement in legacy code
 */
public class Sandwich {

    public static class Builder {

        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {

        }

        // The build method to build our 'Sandwich' object
        public Sandwich build() {
            return new Sandwich(this);
        }

        // Every method here returns the same instance of the 'Builder' class

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

}
