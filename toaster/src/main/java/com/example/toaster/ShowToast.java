package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {
    public static void show(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }
}
