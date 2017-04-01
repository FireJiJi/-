package tw.com.flag.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/22.
 */

public class xmlDesign extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        Bundle bundle = this.getIntent().getExtras();//去除intent中bundle对象的值
        String ans = bundle.getString("ans");

        String setText = "";
        if (ans.equals("in")){
            setText = "正确";
        } else{
            setText = "错误";
        }
        TextView tv1 =(TextView) findViewById(R.id.text1);
        tv1.setText("your choose="+setText);
        Button btn3_back = (Button) findViewById(R.id.button_back);
        btn3_back.setOnClickListener(new Button.OnClickListener(){
         @Override

                    public void onClick(View v) {
                        Intent intent = getIntent();

            xmlDesign.this.setResult(0,intent);

                xmlDesign.this.finish();
            }
        });
    }
}

