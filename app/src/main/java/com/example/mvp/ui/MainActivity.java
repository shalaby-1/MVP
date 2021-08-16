package com.example.mvp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.pojo.MoiveModel;

/**
 * view asks presenter about data after a certain event
 * presenter gets the data form the model / database
 * presenter sends the data to the interface
 * interface sends the dat to the view
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener , MoiveView{

    TextView moiveNameTv;
    Button getMoiveButton;
    MoivePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moiveNameTv = findViewById(R.id.textView);
        getMoiveButton = findViewById(R.id.button);
        getMoiveButton.setOnClickListener(this);
        // to specifiy which view the presenter will send the data to
        presenter = new MoivePresenter(this);

    }

    // asks presenter about data
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button){
            presenter.getMoiveName();
        }
    }

    // receives data form interface to view
    @Override
    public void onGetMoiveName(String moiveName) {
        moiveNameTv.setText(moiveName);
    }
}