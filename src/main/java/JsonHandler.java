import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class JsonHandler {

    public static void loadJsonDataToObject(String fileName) throws IOException {
        String stringJsonData = JsonToString.readFile(fileName);
        JSONObject obj = new JSONObject(stringJsonData);

        JsonData.getInstance().setGeo_id(obj.getString("geo_id"));
        JsonData.getInstance().setGeo_name(obj.getString("geo_name"));
        JsonData.getInstance().setGeo_image(obj.getString("geo_image"));
        JsonData.getInstance().setGeo_link(obj.getString("geo_link"));

        JsonData.getInstance().setRecommended_products(loadRecommendedProducts(obj));
    }

    private static ArrayList<RecommendedProduct> loadRecommendedProducts (JSONObject obj){
        JSONArray arr = obj.getJSONArray("recommended_products");
        ArrayList<RecommendedProduct> recommendedProducts = new ArrayList<RecommendedProduct>();
        for (int i = 0; i < arr.length(); i++) {
            RecommendedProduct recommendedProduct = new RecommendedProduct();

            recommendedProduct.setProduct_code(arr.getJSONObject(i).getString("product_code"));
            recommendedProduct.setProduct_name(arr.getJSONObject(i).getString("product_name"));
            recommendedProduct.setProduct_rating(arr.getJSONObject(i).getString("product_rating"));
            recommendedProduct.setProduct_photo_url(arr.getJSONObject(i).getString("product_photo_url"));
            recommendedProduct.setProduct_link(arr.getJSONObject(i).getString("product_link"));
            recommendedProduct.setProduct_review_count(arr.getJSONObject(i).getString("product_review_count"));

            recommendedProducts.add(recommendedProduct);
        }
        return recommendedProducts;
    }
}
