package aishwarya.com.demobutknife;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageView1)
    ImageView imageView1;

    @BindDrawable(R.drawable.images1)
    Drawable myDrawable;


    @BindView(R.id.rbProductRating)
    RatingBar ratingBar;

    @BindViews({R.id.textView1,R.id.textView2})
    List<TextView>listTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        imageView1.setImageDrawable(myDrawable);

        ButterKnife.bind(MainActivity.this);
        ratingBar.setRating(2.0f);
        listTextView.get(0).setText("Ye jawaani hai deewani");
        listTextView.get(1).setText("Yeh Jawaani Hai Deewani is a 2013 Indian romantic comedy drama film, written and directed byAyan Mukerji and produced by Karan Johar It stars Ranbir Kapoor and Deepika Padukone in lead roles.This is their second film together after 2008's Bachna Ae Haseeno. Kalki Koechlin and Aditya Roy Kapur play supporting roles.Madhuri Dixit appears in an item number with Ranbir Kapoor. Initially set for a March 2013 release, the film was released on 31 May 2013.Upon release, it received mixed to positive reviews and was a box office success.They showed a perfect chemistry between friends on the screen. In 59th Filmfare Awards, the film received Highest number of nominations including Best Actor, Best Film, Best Direction, Best Supporting Actor and Actress and so on.Yeh Jawaani Hai Deewani has become one of the highest grossing Bollywood films worldwide.It is also the tenth highest grossing Bollywood film in overseas markets up until then.");

    }
}
