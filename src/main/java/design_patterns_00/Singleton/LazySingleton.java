package design_patterns_00.Singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton1 = new LazySingleton();
        System.out.println(lazySingleton1);
    }
}
