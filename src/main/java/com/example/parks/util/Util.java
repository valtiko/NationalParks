package com.example.parks.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class Util {
    public static  final String PARKS_URL = "https://developer.nps.gov/api/v1/parks?stateCode=AZ&api_key=Kba83eX7uDyI9obpE3Eoa2hBJkAjCKb5DLQczbcZ";

     public static String getParksUrl(String stateCode){
         return  "https://developer.nps.gov/api/v1/parks?stateCode="+stateCode+"&api_key=Kba83eX7uDyI9obpE3Eoa2hBJkAjCKb5DLQczbcZ";

     }

    public static void hideSoftKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(
                Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

    }
}
