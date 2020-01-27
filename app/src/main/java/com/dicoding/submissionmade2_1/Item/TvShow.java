package com.dicoding.submissionmade2_1.Item;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;


public class TvShow implements Parcelable {
    private String poster, title, description;

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    untuk Stringent parcable

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.poster);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }

    public TvShow(JSONObject object) {
        try {
            String title = object.getString("name");
            String description = object.getString("overview");
            String poster_path = object.getString("poster_path");

            this.title = title;
            this.description = description;
            this.poster = poster_path;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected TvShow(Parcel in) {
        poster = in.readString();
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<TvShow> CREATOR = new Creator<TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel in) {
            return new TvShow(in);
        }

        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };
}