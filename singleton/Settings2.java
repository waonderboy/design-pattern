package singleton;

public class Settings2 {
    private static Settings2 instance = new Settings2();

    private Settings2() {};

    public Settings2 getInstance() {
        return instance;
    }
}
