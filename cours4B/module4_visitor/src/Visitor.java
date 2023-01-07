public interface Visitor {
    public void visit(Wheel wheel);
    public void visit(Engine engine);
    public void visit(Car car);
}

class PrintVisitor implements Visitor{
    @Override
    public void visit(Wheel wheel){
        System.out.println("A wheel");
    }

    @Override
    public void visit(Engine engine){
        System.out.println("Engine with " + engine.getHP() + " hp");
    }

    @Override
    public void visit(Car car){
        System.out.println("A car");
    }
}

class PriceVisitor implements Visitor{
    int totalPrice = 0;

    @Override
    public void visit(Wheel wheel){
        totalPrice+=wheel.getPrice();
    }

    @Override
    public void visit(Engine engine){
        totalPrice+=engine.getPrice();
    }

    @Override
    public void visit(Car car){}
}