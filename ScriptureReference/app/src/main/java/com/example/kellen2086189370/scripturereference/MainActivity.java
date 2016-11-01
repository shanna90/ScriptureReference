package com.example.kellen2086189370.scripturereference;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import java.lang.String;
import android.content.Intent;

import static com.example.kellen2086189370.scripturereference.R.id.editText;
import static com.example.kellen2086189370.scripturereference.R.id.editText2;
import static com.example.kellen2086189370.scripturereference.R.id.editText3;
import static com.example.kellen2086189370.scripturereference.R.id.sub;

public class MainActivity extends AppCompatActivity {


    //subm.OnClickListener = new OnClickListener();
    static final String EXTRA_MESSAGE = "script_ref";


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user clicks the Sumbit button
     */
    public void sendMessage(View view) {
        Button subm = (Button) findViewById(R.id.sub);
        EditText book = (EditText) findViewById(R.id.editText);
        EditText chap = (EditText) findViewById(R.id.editText2);
        EditText verse = (EditText) findViewById(R.id.editText3);
        String bookString = book.getText().toString();
        String chapString = chap.getText().toString();
        String verseString = verse.getText().toString();
        String output = "Your favorite scripture is " + bookString + " " + chapString + ":" + verseString;
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = output;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
