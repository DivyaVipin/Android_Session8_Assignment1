package assignment.android.acadgild.settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnSettings;
    MediaPlayer mp;
    boolean backgroundMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSettings=(Button)findViewById(R.id.btnSettings);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings=new Intent(MainActivity.this,UserSettingsActivity.class);
                startActivity(settings);
            }
        });
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
         backgroundMusic = sp.getBoolean("prefBackMusc",false);
        mp = MediaPlayer.create(getBaseContext(), R.raw.abc);
        if (backgroundMusic)
        {

            mp.start();
        }
        else
        {
            mp.stop();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (backgroundMusic)
        {

            mp.start();
        }
        else
        {
            mp.stop();
        }
    }
}
