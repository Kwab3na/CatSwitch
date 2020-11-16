package org.horizoncolumbus.hs.catswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    boolean isCat2Visible;

    public void switchImage(View view){
        if(isCat2Visible){
            image.setImageResource(R.drawable.cat2);
            isCat2Visible = false;
        }
       else{
           image.setImageResource(R.drawable.cat1);
           isCat2Visible = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.catImageView);
        isCat2Visible = false;
    }
}