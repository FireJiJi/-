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
    public IBinder onBind(Intent intent ) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this,R.raw.song1);
        player.start();
    }
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}
