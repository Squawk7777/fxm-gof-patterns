package net.mgvyshinskiy.designpatterns.gof.state;

public class Oven {
    private OvenState state;

    public Oven() {
        this.state = new Cold();
    }

    public void turnOn() {
        state.turnOn();
    }

    public void use() {
        state.use();
    }

    public void chill() {
        state.chill();
    }

    public void turnOff() {
        state.turnOff();
    }

    private void changeState(OvenState state) {
        this.state = state;
    }


    private class Cold implements OvenState {
        @Override
        public void turnOn() {
            System.out.println("Oven has been turned on and warming...");
            Oven.this.changeState(new WarmedUp());
        }

        @Override
        public void use() {
            System.out.println("Oven is turned off and cannot be used.");
        }

        @Override
        public void chill() {
            System.out.println("Couldn’t be colder than now...");
        }

        @Override
        public void turnOff() {
            System.out.println("Hey! It's already off!");
        }
    }

    private class WarmedUp implements OvenState {
        @Override
        public void turnOn() {
            System.out.println("It's already on!");
        }

        @Override
        public void use() {
            System.out.println("Alrighty then! Let's bake a couple of pizzas!");
            Oven.this.changeState(new Overheated());
        }

        @Override
        public void chill() {
            System.out.println("No need to cool down.");
        }

        @Override
        public void turnOff() {
            System.out.println("Oven has been turned off.");
            Oven.this.changeState(new Cold());
        }
    }

    private class Overheated implements OvenState {
        @Override
        public void turnOn() {
            System.out.println("It's already on!");
        }

        @Override
        public void use() {
            System.out.println("Oven is overheated and needs cooling!");
        }

        @Override
        public void chill() {
            System.out.println("Cooling down...");
            Oven.this.changeState(new WarmedUp());
        }

        @Override
        public void turnOff() {
            System.out.println("Oven has been turned off.");
            Oven.this.changeState(new Cold());
        }
    }
}
