package com.m.emad.beinmedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.m.emad.beinmedia.Manager.UserManager;
import com.squareup.picasso.Picasso;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    UserManager userManager;
    @BindView(R.id.imageView)
    ImageView imageView;
    ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //userManager.getCurrentSession().getName();
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        try {
            //URL url = new URL("https://oktabletmenu.com/api/v1/category/images/Sun-Apr-2016-570149c5c53b1.jpg");
            //Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            //imageView.setImageBitmap(bmp);
            Picasso.with(this).load("https://oktabletmenu.com/api/v1/category/images/Sun-Apr-2016-570147ac834af.jpg").into(imageView);
            //Bitmap bitmap = imageView.getDrawingCache();
            //imageView2.setImageBitmap(bitmap);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
