package sample.backend;

public class Static_Constants {

    /** Properties of device **/
    private final static int SCREEN_WIDTH = 1024;
    private final static int SCREEN_HEIGHT = 600;
    private final static String MAIN_SCENE_TITLE = "Trace-Box Application";

    /** File locations **/
    private final static String MAIN_SCENE_FXML = "fxml/mainScene.fxml";

    /** Connection Details **/
    final static String DB_NAME = "";
    final static String DB_PASSWORD = "";
    final static String DB_ADDRESS = "";

    public static int getScreenWidth() {
        return SCREEN_WIDTH;
    }

    public static int getScreenHeight() { return SCREEN_HEIGHT; }

    public static String getMainSceneFxml() {
        return MAIN_SCENE_FXML;
    }

    public static String getMainSceneTitle() {
        return MAIN_SCENE_TITLE;
    }

    public static String getDbName() { return DB_NAME; }

    public static String getDbPassword() { return DB_PASSWORD; }

    public static String getDbAddress() { return DB_ADDRESS; }
}
