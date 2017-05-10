package tw.com.flag.mp3;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class splash extends AppCompatActivity {




    private final int SPLASH_DISPLAY_LENGHT = 4000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new android.os.Handler().postDelayed(new Runnable() {

            public void run() {
                Intent mainIntent = new Intent(splash.this,
                        MainActivity.class);
                splash.this.startActivity(mainIntent);
                splash.this.finish();
            }

        }, SPLASH_DISPLAY_LENGHT);

    }
}