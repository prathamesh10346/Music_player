package com.example.musicplayer2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar1,seekBar2,seekBar3;
    private Button button1,button2,button3;
    private MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar1=findViewById(R.id.seekBar1);
        seekBar2=findViewById(R.id.seekBar2);
        seekBar3=findViewById(R.id.seekBar3);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        mediaPlayer1=MediaPlayer.create(this,R.raw.arab);
        //mediaPlayer2=MediaPlayer.create(this,R.raw.mannmera);
        mediaPlayer1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                seekBar1.setMax(mediaPlayer1.getDuration());

            }
        });

//        mediaPlayer2=MediaPlayer.create(this,R.raw.Meramannn);
//        mediaPlayer3=MediaPlayer.create(this,R.raw.mannmera);
//        mediaPlayer3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//               seekBar3.setMax(mediaPlayer3.getDuration());
//                seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//                    @Override
//                    public void onProgressChanged(SeekBar seekBar3, int progress, boolean fromUser) {
//                        if(fromUser){
//                            mediaPlayer3.seekTo(progress);
//                        }
//                    }
//
//                    @Override
//                    public void onStartTrackingTouch(SeekBar seekBar3) {
//
//                    }
//
//                    @Override
//                    public void onStopTrackingTouch(SeekBar seekBar3) {
//
//                    }
//                });
//            }
//       });
//        mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                seekBar2.setMax(mediaPlayer2.getDuration());
//                seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//                    @Override
//                    public void onProgressChanged(SeekBar seekBar2, int progress, boolean fromUser) {
//                        if(fromUser){
//                            mediaPlayer2.seekTo(progress);
//                        }
//                    }
//
//                    @Override
//                    public void onStartTrackingTouch(SeekBar seekBar2) {
//
//                    }
//
//                    @Override
//                    public void onStopTrackingTouch(SeekBar seekBar2) {
//
//                    }
//                });
//            }
//        })
//            mediaPlayer1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                seekBar1.setMax(mediaPlayer1.getDuration());
//                seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//                    @Override
//                    public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {
//                        if(fromUser){
//                            mediaPlayer1.seekTo(progress);
//                        }
//                    }
//
//                    @Override
//                    public void onStartTrackingTouch(SeekBar seekBar1) {
//
//                    }
//
//                    @Override
//                    public void onStopTrackingTouch(SeekBar seekBar1) {
//
//                    }
//                });
//            }
//        });
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mediaPlayer1.isPlaying()){
//                    mediaPlayer1.pause();
//                    button1.setText("play");}
//                else{
//                    mediaPlayer1.start();
//                    button1.setText("pause");
//                }
//
//            }
//
//        });
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mediaPlayer2.isPlaying()){
//                    mediaPlayer2.pause();
//                    button2.setText("play");}
//                else{
//                    mediaPlayer2.start();
//                    button3.setText("pause");
//                }
//
//            }
//
//        });
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mediaPlayer3.isPlaying()){
//                    mediaPlayer3.pause();
//                    button3.setText("play");}
//                else{
//                    mediaPlayer3.start();
//                    button3.setText("pause");
//                }
//
//            }
//
//        });

    }
}