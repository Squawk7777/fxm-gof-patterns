package net.mgvyshinskiy.designpatterns.gof.builder;

public class Pizza {
    private final String title;
    private final boolean cheese;
    private final boolean bacon;
    private final boolean pineapple;
    private final boolean mushrooms;
    private final boolean seafood;

    public Pizza(Builder builder) {
        this.title = builder.title;
        this.cheese = builder.cheese;
        this.bacon = builder.bacon;
        this.pineapple = builder.pineapple;
        this.mushrooms = builder.mushrooms;
        this.seafood = builder.seafood;
    }

    public String getTitle() {
        return title;
    }

    public boolean getCheese() {
        return cheese;
    }

    public boolean getBacon() {
        return bacon;
    }

    public boolean getPineapple() {
        return pineapple;
    }

    public boolean getMushrooms() {
        return mushrooms;
    }

    public boolean getSeafood() {
        return seafood;
    }

    @Override
    public String toString() {
        return "Pizza{" +
               "title='" + title + '\'' +
               ", cheese=" + cheese +
               ", bacon=" + bacon +
               ", pineapple=" + pineapple +
               ", mushrooms=" + mushrooms +
               ", seafood=" + seafood +
               '}';
    }

    public static class Builder {
        private final String title;
        private boolean cheese;
        private boolean bacon;
        private boolean pineapple;
        private boolean mushrooms;
        private boolean seafood;

        public Builder(String title) {
            this.title = title;
        }

        public Builder withCheese() {
            cheese = true;
            return this;
        }

        public Builder withBacon() {
            bacon = true;
            return this;
        }

        public Builder withPineapple() {
            pineapple = true;
            return this;
        }

        public Builder withMushrooms() {
            mushrooms = true;
            return this;
        }

        public Builder withSeafood() {
            seafood = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
