package poundpound_ice_pbru.ice_database;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by ICE15 on 4/26/2016.
 */
public class MainAlert {

    public void myDialog(Context context,
                         String strTitle,
                         String strMessage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.alert);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
    }

