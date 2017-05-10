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
    public MediaPlayer player;
    @Override

    public void onStart(Intent intent, int startId){
        super.onStart(intent,startId);
        player = MediaPlayer.create(getApplicationContext(), R.raw.song4);
        //设置可以重复播放
        player.setLooping(true);
        super.onCreate();

        player .start();
    }

    public void onDestroy() {
        player.stop();
        super.onDestroy();

    }

    public IBinder onBind(Intent intent ) {
        return null;
    }

}
