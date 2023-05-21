public class B extends A {
    //method overriding

    public String meth(){
        return "Method is overridden in Extended class B";
    }
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.meth());

        B obj1=new B();
        System.out.println(obj1.meth());
    }
}
