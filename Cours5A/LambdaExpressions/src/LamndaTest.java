interface MyFunction{
    public double calculate(double d);
}

class SquareRootFunction implements MyFunction {
    @Override
    public double calculate(double d){
        return Math.sqrt(d);
    }
}

public class LamndaTest {

    public double timesTwo(MyFunction function, double d){
        return function.calculate(d)*2.0;
    }
    public void run(){
        SquareRootFunction squareRoot = new SquareRootFunction();
        double result = squareRoot.calculate(10.0);

        // Lambda Expression

        MyFunction squareRoot2 = (d) -> Math.sqrt(d); // On a créé une fonction on the spot
        double result2 = squareRoot2.calculate(10.0);

        double result3 = timesTwo(squareRoot2, 10.0);

        double result4 = timesTwo((d)->Math.sqrt(d), 20.0);

        double result5 = timesTwo((d)->d+2.0, 10.0);
    }
}
