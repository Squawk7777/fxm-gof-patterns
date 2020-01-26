package net.mgvyshinskiy.designpatterns.gof.facade;

import net.mgvyshinskiy.designpatterns.gof.facade.api.CalculatorSoap;

public class CalculatorFacade {
    private CalculatorSoap soap;

    public CalculatorFacade(CalculatorSoap soap) {
        this.soap = soap;
    }

    public int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i = soap.add(i, 1)){
            result = soap.multiply(result, i);
        }
        return result;
    }

    public int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else{
            return getFibonacci(soap.subtract(n, 1)) + getFibonacci(soap.subtract(n, 2));
        }
    }
}
