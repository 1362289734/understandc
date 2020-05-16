package 继承.Day03_2;

public class exercise2 {

}
class A {
    int i = 1;
    void print() {
        System.out.println(i);
    }
}
class B extends A {

    static int i = 2;

    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}