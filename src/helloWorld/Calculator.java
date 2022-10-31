package helloWorld;

public class Calculator {

    private int first;
    private int second;

    public Calculator(int firstNumber, int secondNumber) {
        first = firstNumber;
        second = secondNumber;
    }

    public int add() {
        return first + second;
    }

    public int mul() {
        return first * second;
    }
    public int sub() {
        return first - second;
    }

    public int div() {
        return first/second;
    }
    
    public int reverseSub() {
        return second - first;
    }

    public int reverseDiv() {
        return second/first;
    }

}
