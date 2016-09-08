package hua.fragmentbestpractice;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by caihua2300 on 01/09/2016.
 */
public class News  implements Serializable{

    private String title;
    private String content;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }



}
