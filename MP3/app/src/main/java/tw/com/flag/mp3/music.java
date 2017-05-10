package tw.com.flag.mp3;

/**
 * Created by Administrator on 2017/5/5.
 */
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
public class music extends Service {
    private MediaPlayer player;

    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(getApplicationContext(), R.raw.song1);
        //设置可以重复播放
        player.setLooping(true);
        player.start();
    }
    public void onDestroy() {
        player.stop();
        super.onDestroy();

    }
    @Override
    public IBinder onBind(Intent intent ) {
        return null;
    }

}
