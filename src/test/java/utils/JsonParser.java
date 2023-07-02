package utils;

import io.restassured.path.json.JsonPath;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileReader;


public class JsonParser {

    public static String getJsonFormattedValue(String json_file_name, String json_key) {
        try {
            File folderDir = new File("./src/test/java/resource");
            File jsonFilePath = new File(folderDir, json_file_name + ".json");
            JSONTokener tokener = new JSONTokener(new FileReader(jsonFilePath.getAbsolutePath()));
            JSONObject jsonObject = new JSONObject(tokener);
            if (jsonObject.has(json_key)) {
                Object value = jsonObject.get(json_key);
                return value.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getJsonValue(String full_json_data, String json_key) {
        JsonPath jsonPath = new JsonPath(full_json_data);
        return jsonPath.getString(json_key);
    }

}
