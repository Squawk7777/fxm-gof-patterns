package net.mgvyshinskiy.designpatterns.gof.composite;

public class Composite {
    public static void main(String[] args) {
        Node nodeOne = new Node();
        Node nodeTwo = new Node();
        Node nodeThree = new Node();

        Point pointOne = new Point(2);
        Point pointTwo = new Point(5);
        Point pointThree = new Point(1);
        Point pointFour = new Point(12);
        Point pointFive = new Point(0);

        nodeOne.addElement(nodeTwo);
        nodeTwo.addElement(nodeThree);

        nodeOne.addElement(pointOne);
        nodeTwo.addElement(pointTwo);
        nodeTwo.addElement(pointThree);
        nodeTwo.addElement(pointFour);
        nodeThree.addElement(pointFive);

        System.out.println(nodeOne.getCounter()); // expected: 20

        nodeOne.incrementCounter(); // nodeOne has 5 children Points (+5)

        System.out.println(nodeOne.getCounter()); // expected: 25
        System.out.println(pointFive.getCounter()); // expected: 1

        nodeTwo.decrementCounter(); // nodeTwo has 4 children Points (-4)

        System.out.println(nodeOne.getCounter()); // expected: 21
        System.out.println(nodeTwo.getCounter()); // expected: 18

    }
}
