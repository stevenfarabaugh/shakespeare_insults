package com.steven.shakespearianinsultgenerator;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

   String[] insults1 = {"arless","bawdy","beslubbering","bootless","churlish","cockered","clouted","craven","currish","dankish","dissembling","droning","errant","fawning","fobbing","froward","frothy","gleeking","foatish","gorbellied","impertinent","infectious","jarring","loggerheaded","lumpish","mammering","mangled","mewling","paunchy","pribbling","puking","puny","qualling","rank","reeky","roguish","ruttish","saucy","spleeny","spongy","surly","tottering","unmuzzled","vain","venomed","villainous","warped","wayward","weedy","yeasty"};

    String[] insults2 = {"base-court","bat-fowling","beef-witted","beetle-handed","boil-brained","clapper-clawed","clay-brained","common-kissing","crook-pated","dismal-dreaming","dizzy-eyed","doghearted","dread-bloated","earth-vexing","elf-skinned","fat-kidneyed","fen-sucked","flap-mouthed","fly-bitten","folly-fallen","fool-born","fool-gorged","guts-gripping","half-faced","hasty-witted","hedge-born","hell-hated","idly-hated","ill-greeding","ill-nurtured","knotty-pated","milk-livered","motley-minded","onion-eyed","plume-plucked","pottle-deep","pox-marked","reeling-ripe","rough-hewn","rude-growing","rump-fed","shard-born","sheep-biting","spur-galled","swag-bellied","tardy-gaited","tickle-brained","toad-spotted","unchin-snouted","weather-bitten"};

    String[] insults3 = {"apple-john","baggage","barnacle","bladder","boar-pig","bugbear","bum-bailey","canker-blossom","clack-dish","clotple","coxcomb","codpiece","deaf-token","dewberry","flap-dragon","flax-wench","flirt-gill","foot-licker","fustilarain","giglet","gudgeon","haggard","harpy","hedge-pig","horn-beast","hugger-mugger","jointhead","lewdster","lout","maggot-pie","malt-worm","mammet","measel","minnow","miscreant","moldwrap","mubble-news","nut-hook","pigeon-egg","pignut","puttock","pumpion","ratsbane","scut","skainsmate","strumpet","varlot","vasssal","whey-face","wagtail"};

    Typeface custom_font;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        custom_font = Typeface.createFromAsset(getAssets(), "BadScript-Regular.ttf");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRandomInsults();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setRandomInsults();
            }
        });
    }

    public void setRandomInsults () {
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();

        int index1 = rand1.nextInt(49);
        int index2 = rand2.nextInt(49);
        int index3 = rand3.nextInt(49);

        Log.d("steven", insults1[index1]);
        Log.d("steven",insults2[index2]);
        Log.d("steven", insults3[index3]);

        TextView insult1ET = (TextView) findViewById(R.id.insult1);
        TextView insult2ET = (TextView) findViewById(R.id.insult2);
        TextView insult3ET = (TextView) findViewById(R.id.insult3);

        insult1ET.setTypeface(custom_font);
        insult2ET.setTypeface(custom_font);
        insult3ET.setTypeface(custom_font);

        insult1ET.setText(insults1[index1]);
        insult2ET.setText(insults2[index2]);
        insult3ET.setText(insults3[index3]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Log.d("steven","do we get here");
        Log.d("steven",Integer.toString(id));
        Log.d("steven",Integer.toString(R.id.action_settings));
        if (id == R.id.action_settings) {
            Toast.makeText(getBaseContext(), "by:  " + getString(R.string.author),Toast.LENGTH_LONG).show();
            Toast.makeText(getBaseContext(), R.string.website,Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
