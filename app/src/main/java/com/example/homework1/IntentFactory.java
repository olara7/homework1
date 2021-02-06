package com.example.homework1;

import android.content.Context;
import android.content.Intent;

public class IntentFactory {
    public static Intent getIntent(String className, Context context, String extraValue){
        switch(className) {
            case "HomePageActivity":
      //          return HomePageActivity.getIntent(context, extraValue);
            default:
                return new Intent(context, MainActivity.class);
        }
    }
}
