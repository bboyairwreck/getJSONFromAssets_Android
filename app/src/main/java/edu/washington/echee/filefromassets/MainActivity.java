package edu.washington.echee.filefromassets;

import android.app.Activity;
import android.os.Bundle;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get your Application singleton
        MyApp myApp = (MyApp) getApplication();

        myApp.questions.get("blah blah idk"); // grab your repository from MyApp and get data from it
    }
}
