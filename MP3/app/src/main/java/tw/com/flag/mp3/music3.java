package tw.com.flag.mp3;

/**
 * Created by Administrator on 2017/5/5.
 */
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;

public class music3 extends Service {
    private MediaPlayer player3;
    @Override
    public IBinder onBind(Intent intent ) {
        return null;
    }
    public void onStart(Intent intent, int startId){
        super.onStart(intent,startId);
        player3 = MediaPlayer.create(this,R.raw.song4);
        player3 .start();
    }

    public void onDestroy() {
        super.onDestroy();
        player3.stop();
    }



}
