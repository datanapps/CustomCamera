package datanapps.cameralib.customcamera;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import android.support.design.widget.Snackbar;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    Utils(){
        // nothing to do here
    }


    public static boolean isConnected(Context context){
        ConnectivityManager connectivityManager =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnected();
    }

    public static String getLocalTime(long dateTime){
        Log.d("asd", "Date Time.........." + dateTime);
        Date date = dateTime ==0?new Date():new Date(dateTime);
        SimpleDateFormat fmtOut = new SimpleDateFormat("d MMM yyyy hh-mm-ss a");
        return fmtOut.format(date);
    }


    public static String getLocalTimeSmall(long dateTime){
        Log.d("asd", "Date Time.........." + dateTime);
        Date date = dateTime ==0?new Date():new Date(dateTime);
        SimpleDateFormat fmtOut = new SimpleDateFormat("dMMMyyyyHH-mm-ss");
        return fmtOut.format(date);
    }

    public static void showSnakBar(Activity context, String msg){
        Snackbar.make(context.findViewById(android.R.id.content), msg, Snackbar.LENGTH_LONG)
                .setActionTextColor(context.getResources().getColor(android.R.color.holo_red_light ))
                .show();
    }
}
