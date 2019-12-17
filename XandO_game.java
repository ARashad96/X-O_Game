package com.arashad96.androiddeveloperintermidatekit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class XandO_game extends AppCompatActivity {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;

    Boolean x_player = true;
    Boolean winner = false;

    ArrayList xplayer = new ArrayList();
    ArrayList oplayer = new ArrayList();

    Button github;
    Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_xand_o_game);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img1);
                img1.setClickable(false);
                checkwinner();
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img2);
                img2.setClickable(false);
                checkwinner();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img3);
                img3.setClickable(false);
                checkwinner();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img4);
                img4.setClickable(false);
                checkwinner();
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img5);
                img5.setClickable(false);
                checkwinner();
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img6);
                img6.setClickable(false);
                checkwinner();
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img7);
                img7.setClickable(false);
                checkwinner();
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img8);
                img8.setClickable(false);
                checkwinner();
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentplayer(img9);
                img9.setClickable(false);
                checkwinner();
            }
        });

        github = findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ARashad96/X-O_Game"));
                startActivity(intent);
            }
        });
        info = findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(XandO_game.this)
                        .setIcon(R.drawable.profile)
                        .setTitle("App info")
                        .setMessage("This app performing a simple X/O game using imageview, alertdialog, toast and linearlayout.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .show();
            }
        });
    }

    public void currentplayer(ImageView image){
        if (x_player){
            image.animate().alpha(1).setDuration(1000);
            image.setImageResource(R.drawable.x);
            x_player = false;
            xplayer.add(image);
        }
        else{
            image.animate().alpha(1).setDuration(1000);
            image.setImageResource(R.drawable.o);
            x_player = true;
            oplayer.add(image);
        }
    }

    public void closeclick(){
        img1.setClickable(false);
        img2.setClickable(false);
        img3.setClickable(false);
        img4.setClickable(false);
        img5.setClickable(false);
        img6.setClickable(false);
        img7.setClickable(false);
        img8.setClickable(false);
        img9.setClickable(false);
    }

    public void checkwinner() {
        if (xplayer.contains(img1) && xplayer.contains(img2) && xplayer.contains(img3)){
            Toast.makeText(this, "winner is player x", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (xplayer.contains(img1) && xplayer.contains(img4) && xplayer.contains(img7)){
            Toast.makeText(this, "winner is player x", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (xplayer.contains(img1) && xplayer.contains(img5) && xplayer.contains(img9)){
            Toast.makeText(this, "winner is player x", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (xplayer.contains(img2) && xplayer.contains(img5) && xplayer.contains(img8)){
            Toast.makeText(this, "winner is player x", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (xplayer.contains(img3) && xplayer.contains(img6) && xplayer.contains(img9)){
            Toast.makeText(this, "winner is player x", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (xplayer.contains(img3) && xplayer.contains(img5) && xplayer.contains(img7)){
            Toast.makeText(this, "winner is player x", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (xplayer.contains(img4) && xplayer.contains(img5) && xplayer.contains(img6)){
            Toast.makeText(this, "winner is player x", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (xplayer.contains(img7) && xplayer.contains(img8) && xplayer.contains(img9)){
            Toast.makeText(this, "winner is player x", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.contains(img1) && oplayer.contains(img2) && oplayer.contains(img3)){
            Toast.makeText(this, "winner is player o", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.contains(img1) && oplayer.contains(img4) && oplayer.contains(img7)){
            Toast.makeText(this, "winner is player o", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.contains(img1) && oplayer.contains(img5) && oplayer.contains(img9)){
            Toast.makeText(this, "winner is player o", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.contains(img2) && oplayer.contains(img5) && oplayer.contains(img8)){
            Toast.makeText(this, "winner is player o", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.contains(img3) && oplayer.contains(img6) && oplayer.contains(img9)){
            Toast.makeText(this, "winner is player o", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.contains(img3) && oplayer.contains(img5) && oplayer.contains(img7)){
            Toast.makeText(this, "winner is player o", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.contains(img4) && oplayer.contains(img5) && oplayer.contains(img6)){
            Toast.makeText(this, "winner is player o", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.contains(img7) && oplayer.contains(img8) && oplayer.contains(img9)){
            Toast.makeText(this, "winner is player o", Toast.LENGTH_SHORT).show();
            winner=true;
            closeclick();
            dialog();
        }else if (oplayer.size() + xplayer.size() == 9){
            Toast.makeText(this, "Tie Game", Toast.LENGTH_SHORT).show();
            winner=true;
            dialog();
        }else{
            Toast.makeText(this, "Next Player", Toast.LENGTH_SHORT).show();
        }
    }

    public void dialog(){
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Game ended");

        // add a button
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // if this button is clicked, close
                // current activity
                // MainActivity.this.finish();
                //android.os.Process.killProcess(android.os.Process.myPid());
                //System.exit(1);
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
