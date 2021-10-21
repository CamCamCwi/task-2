public class RecommendedProduct {
    private String product_code;
    private String product_name;
    private String product_rating;
    private String product_photo_url;
    private String product_link;
    private String product_review_count;

    public RecommendedProduct() {
    }

    public RecommendedProduct(String product_code, String product_name,
                              String product_rating, String product_photo_url,
                              String product_link, String product_review_count) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.product_rating = product_rating;
        this.product_photo_url = product_photo_url;
        this.product_link = product_link;
        this.product_review_count = product_review_count;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_rating() {
        return product_rating;
    }

    public void setProduct_rating(String product_rating) {
        this.product_rating = product_rating;
    }

    public String getProduct_photo_url() {
        return product_photo_url;
    }

    public void setProduct_photo_url(String product_photo_url) {
        this.product_photo_url = product_photo_url;
    }

    public String getProduct_link() {
        return product_link;
    }

    public void setProduct_link(String product_link) {
        this.product_link = product_link;
    }

    public String getProduct_review_count() {
        return product_review_count;
    }

    public void setProduct_review_count(String product_review_count) {
        this.product_review_count = product_review_count;
    }
}
