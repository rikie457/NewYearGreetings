import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileHandler {
    String filename, jsonString;

    public FileHandler(String filename) {
        this.filename = filename;
    }

    public ArrayList<JSONObject> loadObjects() throws IOException {


        String jsonString = new String(Files.readAllBytes(Paths.get(this.filename)));
        this.jsonString = jsonString;
        JSONArray jsonArray = new JSONArray(jsonString);

        System.out.println("File: " + this.filename + " Loaded");

        ArrayList<JSONObject> objects = new ArrayList<JSONObject>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject object = jsonArray.getJSONObject(i);
            objects.add(object);
        }

        return objects;
    }


}
