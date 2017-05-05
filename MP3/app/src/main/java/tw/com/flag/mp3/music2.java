package tw.com.flag.mp3;

/**
 * Created by Administrator on 2017/5/5.
 */
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
public class music2 extends Service {
    private MediaPlayer player2;
    @Override
    public IBinder onBind(Intent intent ) {
        return null;
    }
    public void onStart(Intent intent,int startId){
        super.onStart(intent,startId);
        player2 = MediaPlayer.create(this,R.raw.song3);
        player2 .start();
    }


    public void onDestroy() {
        super.onDestroy();
        player2.stop();
    }


}
