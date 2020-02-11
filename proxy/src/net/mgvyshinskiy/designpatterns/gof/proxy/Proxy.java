package net.mgvyshinskiy.designpatterns.gof.proxy;

import net.mgvyshinskiy.designpatterns.gof.proxy.api.Calculator;
import net.mgvyshinskiy.designpatterns.gof.proxy.api.CalculatorSoap;

public class Proxy {
    public static void main(String[] args) {
        CalculatorSoap soap =  new Calculator().getCalculatorSoap();
        CalculatorProxy proxy = new CalculatorProxy(soap);
        CalculatorFacade calculatorFacade = new CalculatorFacade(proxy);

        System.out.println(calculatorFacade.getFactorial(3)); // expected: 6
        System.out.println("-------------");
        System.out.println(calculatorFacade.getFibonacci(6)); // expected: 8
    }
}
