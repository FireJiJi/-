package tw.com.flag.mp3;

/**
 * Created by Administrator on 2017/5/5.
 */
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
public class music2 extends Service {
    private MediaPlayer player;
    @Override

    public void onStart(Intent intent,int startId){
        super.onStart(intent,startId);
        player = MediaPlayer.create(getApplicationContext(), R.raw.song3);
        //设置可以重复播放
        player .start();
        player.setLooping(true);

    }


    public void onDestroy() {
        player.stop();
        super.onDestroy();

    }
    public IBinder onBind(Intent intent ) {
        return null;
    }

}
