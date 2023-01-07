public class Cons {

    public int v;

    public Cons next;

    public Cons(int v, Cons next){
        this.v = v;
        this.next = next;
    }

    public Cons map(F f){

        Cons mapped = new Cons(f.apply(this.v), null);
        if(this.next!= null){
            mapped.next = this.next.map(f);
        }
        return mapped;

    }

    public Cons filter(P p){

        if(this.next!=null){
            if(p.filter(this.v)){
                return new Cons(this.v, this.next.filter(p));
            } else {
                return this.next.filter(p);
            }
        } else {
            if(p.filter(this.v)){
                return new Cons(this.v, null);
            } else {
                return null;
            }
        }
    }

        /*Cons copy = null;

        while(this != null){
            if(p.filter(this.v)==true){
                copy = new Cons(this.v, this.next.filter(p));
                this = this.next;
            } else {
                this = this.next;
            }
        }
        return copy;

    }

    */

}

interface F {
    int apply(int v);
}

interface P {
    boolean filter(int v);
}
