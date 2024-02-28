public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHi!");
        String version = System.getProperty("java.version");
        String os = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        System.out.println("Running Java Version "+version+" "+os+""+osVersion);
    }
}