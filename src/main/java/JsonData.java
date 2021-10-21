import java.util.ArrayList;

public class JsonData {
    private static JsonData instance;
    private String geo_id;
    private String geo_name;
    private String geo_image;
    private String geo_link;
    private ArrayList<RecommendedProduct> recommended_products;

    static JsonData getInstance() {
        if (instance == null) {
            instance = new JsonData();
        }
        return instance;
    }

    private JsonData() {
    }

    public JsonData(String geo_id, String geo_name,
                    String geo_image, String geo_link,
                    ArrayList<RecommendedProduct> recommended_products) {
        this.geo_id = geo_id;
        this.geo_name = geo_name;
        this.geo_image = geo_image;
        this.geo_link = geo_link;
        this.recommended_products = recommended_products;
    }

    public String getGeo_id() {
        return geo_id;
    }

    public void setGeo_id(String geo_id) {
        this.geo_id = geo_id;
    }

    public String getGeo_name() {
        return geo_name;
    }

    public void setGeo_name(String geo_name) {
        this.geo_name = geo_name;
    }

    public String getGeo_image() {
        return geo_image;
    }

    public void setGeo_image(String geo_image) {
        this.geo_image = geo_image;
    }

    public String getGeo_link() {
        return geo_link;
    }

    public void setGeo_link(String geo_link) {
        this.geo_link = geo_link;
    }

    public ArrayList<RecommendedProduct> getRecommended_products() {
        return recommended_products;
    }

    public void setRecommended_products(ArrayList<RecommendedProduct> recommended_products) {
        this.recommended_products = recommended_products;
    }
}
