public abstract class CarElement {
    public abstract int getPrice();
    public abstract void print();
}

interface Visitable{
    public void accept(Visitor visitor);
}

class Engine extends CarElement implements Visitable{
    private int hp;

    public Engine(int hp){
        this.hp = hp;
    }

    public int getHP(){return hp;}

    @Override
    public int getPrice(){
        return hp*100;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    @Override
    public void print(){
        System.out.println("Engine with "+ hp+" hp");
    }
}

class Car implements Visitable{
    private Engine engine = new Engine(90);
    private Wheel[] wheels = new Wheel[]{
            new Wheel(), new Wheel(), new Wheel(), new Wheel()
    };

    /*

    public void printCar(){
        engine.print();
        wheels[0].print();
        wheels[1].print();
        wheels[2].print();
        wheels[3].print();
    }

    public int getCarPrice(){
        return engine.getPrice()+wheels[0].getPrice()+wheels[1].getPrice()+wheels[2].getPrice()+wheels[3].getPrice();
    }

    */

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
        engine.accept(visitor);
        wheels[0].accept(visitor);
        wheels[1].accept(visitor);
        wheels[2].accept(visitor);
        wheels[3].accept(visitor);
    }
}

class Wheel extends CarElement implements Visitable{
    @Override
    public int getPrice(){
        return 100;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    @Override
    public void print(){
        System.out.println("A wheel");
    }
}
