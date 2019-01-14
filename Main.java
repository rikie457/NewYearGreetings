import org.json.JSONObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<NewYearGreeting> greetings = new ArrayList<NewYearGreeting>();
        try {
            FileHandler handler = new FileHandler("greetings.json");


            ArrayList<JSONObject> objects = handler.loadObjects();

            for (int i = 0; i < objects.size(); i++) {
                if (objects.get(i).has("name") && objects.get(i).has("resolution") && objects.get(i).has("wish")) {
                    greetings.add(new NewYearGreeting(objects.get(i)));
                } else {
                    System.out.println(objects.get(i) + " Has not all the required keys");
                }
            }

            for (int i = 0; i < greetings.size(); i++) {
                System.out.println(greetings.get(i).getName());
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
