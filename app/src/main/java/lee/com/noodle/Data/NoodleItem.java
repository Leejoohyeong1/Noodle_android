package lee.com.noodle.Data;


import com.google.gson.annotations.SerializedName;

public class NoodleItem {
    @SerializedName("NoodlePk") int NoodlePk;
    @SerializedName("ImageUrl") String ImageUrl;
    @SerializedName("Name") String Name;

    public int getNoodlePk() {
        return NoodlePk;
    }

    public void setNoodlePk(int noodlePk) {
        NoodlePk = noodlePk;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}



