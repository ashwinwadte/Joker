package io.github.ashwinwadte.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JokeActivity.JOKE_KEY);
        TextView jokeTextView = (TextView) findViewById(R.id.textView);
        if(joke != null && joke.length() > 0){
            jokeTextView.setText(joke);
        }
    }
}
