package tw.com.flag.mp3;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static tw.com.flag.mp3.R.id.rbt1;
import static tw.com.flag.mp3.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {


    RadioButton b1 = null;
    RadioButton b2 = null;
    RadioButton b3 = null;
    RadioButton b4 = null;
    RadioGroup rd1 = null;

LinearLayout bbb = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        rd1 = (RadioGroup) findViewById(R.id.radioGroup);
        b1 = (RadioButton) findViewById(rbt1);
        b2 = (RadioButton) findViewById(R.id.rbt2);
        b3 = (RadioButton) findViewById(R.id.rbt3);
        b4 = (RadioButton) findViewById(R.id.rbt4);
bbb = (LinearLayout) findViewById(R.id.aaa);
        Button playdd = (Button) findViewById(R.id.play);
        Button stopdd = (Button) findViewById(R.id.stop);
        playdd.setOnClickListener(playd);
        stopdd.setOnClickListener(stopd);


        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setIcon(android.R.drawable.ic_dialog_info);
        dialog.setTitle("欢迎");
        dialog.setMessage("欢迎使用本程序");
        dialog.setPositiveButton("肯定", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        dialog.setNegativeButton("非常肯定", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }


        });


        dialog.create();
        dialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 1, "拨打客服电话");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == 1) {

            Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:13160677556"));
            startActivity(call);

        }
        return super.onOptionsItemSelected(item);

    }





    public View.OnClickListener playd = new View.OnClickListener() {


        @Override
        public void onClick(View v) {



            if (b1.isChecked()) {
                stopService(new Intent(MainActivity.this,music1.class));
                stopService(new Intent(MainActivity.this,music2.class));
                stopService(new Intent(MainActivity.this,music3.class));
                bbb.setBackgroundResource(R.drawable.bb);
                Toast.makeText(MainActivity.this , "开始播放音乐" , Toast.LENGTH_LONG).show();
                startService(new Intent(MainActivity.this,music.class));
            } else if (b2.isChecked()) {
                stopService(new Intent(MainActivity.this,music.class));
                stopService(new Intent(MainActivity.this,music2.class));
                stopService(new Intent(MainActivity.this,music3.class));
                bbb.setBackgroundResource(R.drawable.cc);
                Toast.makeText(MainActivity.this , "开始播放音乐" , Toast.LENGTH_LONG).show();
                startService(new Intent(MainActivity.this,music1.class));


            } else if (b3.isChecked()) {
                stopService(new Intent(MainActivity.this,music1.class));
                stopService(new Intent(MainActivity.this,music.class));
                stopService(new Intent(MainActivity.this,music3.class));
                bbb.setBackgroundResource(R.drawable.dd);
                Toast.makeText(MainActivity.this , "开始播放音乐" , Toast.LENGTH_LONG).show();
                startService(new Intent(MainActivity.this,music2.class));

            } else if (b4.isChecked()) {
                stopService(new Intent(MainActivity.this,music1.class));
                stopService(new Intent(MainActivity.this,music2.class));
                stopService(new Intent(MainActivity.this,music.class));
                bbb.setBackgroundResource(R.drawable.aa);
                Toast.makeText(MainActivity.this , "开始播放音乐" , Toast.LENGTH_LONG).show();
                startService(new Intent(MainActivity.this,music3.class));

            }

        }

};


    /*........................................*/
  public View.OnClickListener stopd = new View.OnClickListener() {
       @Override
        public void onClick(View v) {

            if (b1.isChecked()) {
                Toast.makeText(MainActivity.this , "停止播放音乐" , Toast.LENGTH_LONG).show();
                stopService(new Intent(MainActivity.this,music.class));

            } else if (b2.isChecked()) {
                Toast.makeText(MainActivity.this , "停止播放音乐" , Toast.LENGTH_LONG).show();
                stopService(new Intent(MainActivity.this,music1.class));


            } else if (b3.isChecked()) {
                Toast.makeText(MainActivity.this ,"停止播放音乐" , Toast.LENGTH_LONG).show();
                stopService(new Intent(MainActivity.this,music2.class));



            } else if (b4.isChecked()) {
                Toast.makeText(MainActivity.this ,"停止播放音乐" , Toast.LENGTH_LONG).show();
                stopService(new Intent(MainActivity.this,music3.class));

            }


        }
    };


}



