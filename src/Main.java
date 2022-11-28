public class Main {
    public static void main(String[] args) {
        CPU outerObject = new CPU();
        CPU.RAM ramObject = outerObject.new RAM(64,"Intel");
        CPU.Processor processorObject = outerObject.new Processor(64,"Intel");
        System.out.println(ramObject.getLockSpeed());
        System.out.println(processorObject.getCache());


    }
}