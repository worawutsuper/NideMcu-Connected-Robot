package asuper.wut.myrobot;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private TextView textView;
    private SeekBar seekBar;
    private int anInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        textView= (TextView) findViewById(R.id.textView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        //SeekBar Controller
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                anInt=i*10;
                textView.setText(Integer.toString(anInt));


            } //onProgress

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                upLoadIntegerToDweet(anInt);

            }
        });

    }// Main Method

    private void upLoadIntegerToDweet(int anInt) {



    }//upload

    private class UpLoadValue extends AsyncTask<int, Void, String> {


        @Override
        protected String doInBackground(int... params) {
            return null;
        }//doInBack

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }//onPost

    }//UploadValue


}// Main Class
