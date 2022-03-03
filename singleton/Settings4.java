package singleton;

public class Settings4 {
    private Settings4() {}

    private static class SettingHolder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return SettingHolder.INSTANCE;
    }
}
