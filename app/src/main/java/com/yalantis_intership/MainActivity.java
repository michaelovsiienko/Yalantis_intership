package com.yalantis_intership;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

//Class for interacting with user
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //create new object of class which work with information data
    DataClass dataClass = new DataClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialization all data for display on screen
        initialization();
        //set data for control elements
        operationWithText();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //create new exemplar class which display some photo
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        //create new exemplar class which work with image data
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), dataClass.getImgUrls());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void initialization() {
        dataClass.setCode(getResources().getString(R.string.code));
        dataClass.setCreated(getResources().getString(R.string.created));
        dataClass.setName(getResources().getString(R.string.name));
        dataClass.setRegistered(getResources().getString(R.string.registered));
        dataClass.setStatus(getResources().getString(R.string.status));
        dataClass.setSolve_to(getResources().getString(R.string.solve_to));
        dataClass.setResponsible(getResources().getString(R.string.responsible));
        dataClass.setDescription(getResources().getString(R.string.description));
        dataClass.setResponsible_object(getResources().getString(R.string.responsible_object));
        dataClass.setImgUrls(Arrays.asList(getApplicationContext().getResources().getStringArray(R.array.images_urls)));

    }

    private void operationWithText() {
        Date date = new Date();
        Random random = new Random();
        setTitle(dataClass.getCode());
        TextView name = (TextView) findViewById(R.id.name);
        TextView status = (TextView) findViewById(R.id.status);
        TextView created = (TextView) findViewById(R.id.created);
        TextView registered = (TextView) findViewById(R.id.registered);
        TextView solve_to = (TextView) findViewById(R.id.solve_to);
        TextView responsible = (TextView) findViewById(R.id.responsible);
        TextView created_time = (TextView) findViewById(R.id.created_time);
        TextView registered_time = (TextView) findViewById(R.id.registered_time);
        TextView solve_to_time = (TextView) findViewById(R.id.solve_to_time);
        TextView responsible_object = (TextView) findViewById(R.id.responsible_object);
        TextView description = (TextView) findViewById(R.id.description);

        try {
            name.setText(dataClass.getName());
            status.setText(dataClass.getStatus());
            created.setText(dataClass.getCreated());
            registered.setText(dataClass.getRegistered());
            solve_to.setText(dataClass.getSolve_to());
            responsible.setText(dataClass.getResponsible());
            created_time.setText(dataClass.getCreated_time(date));
            registered_time.setText(dataClass.getRegistered_time(date));
            solve_to_time.setText(dataClass.getSolve_to_time(date, random.nextInt(10)));
            responsible_object.setText(dataClass.getResponsible_object());
            description.setText(dataClass.getDescription());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(getApplicationContext(), item.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
            finish();
        }
        return true;
    }

    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), v.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
    }

}
