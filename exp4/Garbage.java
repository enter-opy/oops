public class Garbage {
    public static void main(String args[])
    {
        Garbage obj1 = new Garbage();
        Garbage obj2 = new Garbage();
        Garbage obj3 = new Garbage();
        obj1 = null;
        obj2 = null;
        obj3 = null;
        
        obj1.finalize();
        obj2.finalize();
        obj3.finalize();
    }
}