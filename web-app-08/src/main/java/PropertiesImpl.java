import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesImpl {
    public static void main(String[] args) {
        Properties properties = readPropertiesFile("src\\main\\resources\\loginDetails.properties");
        System.out.println("username " + properties.getProperty("username"));
        System.out.println("password " + properties.getProperty("password"));

    }

    private static Properties readPropertiesFile(String filename) {
        FileInputStream fileInputStream = null;
        Properties properties = null;
        try {
            fileInputStream = new FileInputStream(filename);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return properties;
    }
}
