package com.example.vinay_thakur.dialogs;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity  implements AlertFragment.NoticeDialogListener{

    //no actionbar activity
    // with this you have to use them.appcompat theme as well.

    Button button;
    AlertFragment dailogDemoFragment;
    FragmentManager fm = getSupportFragmentManager();
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.dailog);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 dailogDemoFragment=new AlertFragment();
                dailogDemoFragment.show(fm,"Alert Dialog Fragment");
            }
        });
    }
    public void open(View view)
    {

            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.setMessage("My sample dialog example");
            builder.setTitle(R.string.AlertDailog);
            Dialog dialog=builder.create();
            dialog.show();
    }


    @Override
    public void onDialogPositiveClick(AlertFragment dialog) {
        Log.d("vinae333","ff");

    }

    @Override
    public void onDialogNegativeClick(android.support.v4.app.DialogFragment dialog) {

    }
}
