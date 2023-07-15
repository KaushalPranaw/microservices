public class GarbageCollectorDemo {
    public static void main(String[] args) {
        GarbageCollectorDemo garbageCollectorDemo = new GarbageCollectorDemo();
        GarbageCollectorDemo garbageCollectorDemo1 = new GarbageCollectorDemo();

        //Way 1
        // garbageCollectorDemo = null;
        //Way 2
        //garbageCollectorDemo = garbageCollectorDemo1;
        //Way 3
        new GarbageCollectorDemo();


        //Way 1
        //System.gc();
        //Way 2
        Runtime.getRuntime().gc();
        System.out.println("Main method is done");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize is called");
    }
}
