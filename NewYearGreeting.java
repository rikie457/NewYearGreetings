import org.json.JSONObject;


public class NewYearGreeting implements NewYearGreetingGenerator {

    String name, resolution, wish;

    public NewYearGreeting(JSONObject jsonObject) {
        this.name = jsonObject.get("name").toString();
        this.resolution = jsonObject.get("resolution").toString();
        this.wish = jsonObject.get("wish").toString();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getResolution() {
        return this.resolution;
    }

    @Override
    public String getWish() {
        return this.wish;
    }
}
