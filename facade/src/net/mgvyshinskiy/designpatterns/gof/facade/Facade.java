package net.mgvyshinskiy.designpatterns.gof.facade;

import net.mgvyshinskiy.designpatterns.gof.facade.api.Calculator;
import net.mgvyshinskiy.designpatterns.gof.facade.api.CalculatorSoap;

public class Facade {
    public static void main(String[] args) {
        CalculatorSoap soap =  new Calculator().getCalculatorSoap();
        CalculatorFacade calculatorFacade = new CalculatorFacade(soap);

        System.out.println(calculatorFacade.getFactorial(3)); // expected: 6
        System.out.println(calculatorFacade.getFibonacci(6)); // expected: 8
    }
}
