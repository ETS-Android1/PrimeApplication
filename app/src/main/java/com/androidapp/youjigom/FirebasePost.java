package com.androidapp.youjigom;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.HashMap;
import java.util.Map;

public class FirebasePost {
    public String image;
    public String fullName;
    public String country;

    public FirebasePost() {
    }

    public FirebasePost(String image, String fullName, String country) {
        this.image = image;
        this.fullName = fullName;
        this.country = country;
    }


    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("image",image);
        result.put("fullName",fullName);
        result.put("country",country);

        return result;
    }

}
