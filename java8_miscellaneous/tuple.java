package java8_miscellaneous;


public class tuple<A,B> {
    public final A _1;
    public final B _2;
    public tuple(A a, B b){
        this._1 = a;
        this._2 = b;
    }
    public A get_1(){
        return _1;
    }
    public B get_2(){
        return _2;
    }
}
