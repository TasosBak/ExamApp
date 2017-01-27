package com.example.user.examapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by user on 27/1/2017.
 */

public class Merchant implements Parcelable {

    private String id;
    private String legalName;
    private String category;
    private String address;
    private String imageUrl;
    private String review;

    public Merchant() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    protected Merchant(Parcel in) {
        id = in.readString();
        legalName = in.readString();
        category = in.readString();
        address = in.readString();
        imageUrl = in.readString();
        review = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(legalName);
        dest.writeString(category);
        dest.writeString(address);
        dest.writeString(imageUrl);
        dest.writeString(review);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Merchant> CREATOR = new Parcelable.Creator<Merchant>() {
        @Override
        public Merchant createFromParcel(Parcel in) {
            return new Merchant(in);
        }

        @Override
        public Merchant[] newArray(int size) {
            return new Merchant[size];
        }
    };
}
