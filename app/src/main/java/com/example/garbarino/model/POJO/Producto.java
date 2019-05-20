package com.example.garbarino.model.POJO;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Producto {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("list_price")
    @Expose
    private Integer listPrice;
    @SerializedName("discount")
    @Expose
    private Integer discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }


    public Producto( String id, String description, String imageUrl, Integer price, Integer listPrice, Integer discount ) {
        this.id = id;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.listPrice = listPrice;
        this.discount = discount;
    }

    public Producto() {
    }
}
