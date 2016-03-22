package com.yalantis_intership;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Date;
import java.util.Random;
//Class for interacting with user
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //create new object of class which work with information data
    dataclass dc = new dataclass();
    @Override
    protected void onStart ()
    {
        super.onStart();
        //initialization all data for display on screen
        initialization();
        //set data for control elements
        operationwithtext(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        //create new exemplar class which display some photo
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //create new exemplar class which work with image data
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(),dc.getimageurls());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(recyclerViewAdapter);
    }
    private void initialization ()
    {
        dc.setCode_app(getResources().getString(R.string.code));
        dc.setCreated(getResources().getString(R.string.created));
        dc.setName(getResources().getString(R.string.name));
        dc.setRegistered(getResources().getString(R.string.registered));
        dc.setStatus(getResources().getString(R.string.status));
        dc.setSolve_to(getResources().getString(R.string.solve_to));
        dc.setResponsible(getResources().getString(R.string.responsible));
        dc.setDescription(getResources().getString(R.string.description));
        dc.setResponsible_object(getResources().getString(R.string.responsible_object));
    }
    private void operationwithtext (MainActivity v)
    {
        Date date = new Date();
        Random random = new Random();
        setTitle(dc.getCode_app());
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(dc.getName());
        name.setOnClickListener(this);
        TextView status = (TextView)findViewById(R.id.status);
        status.setText(dc.getStatus());
        status.setOnClickListener(this);
        TextView created = (TextView)findViewById(R.id.created);
        created.setText(dc.getCreated());
        created.setOnClickListener(this);
        TextView registered = (TextView)findViewById(R.id.registered);
        registered.setText(dc.getRegistered());
        registered.setOnClickListener(this);
        TextView solve_to = (TextView)findViewById(R.id.solve_to);
        solve_to.setText(dc.getSolve_to());
        solve_to.setOnClickListener(this);
        TextView responsible = (TextView)findViewById(R.id.responsible);
        responsible.setText(dc.getResponsible());
        responsible.setOnClickListener(this);
        responsible.setOnClickListener(this);
        TextView created_time = (TextView)findViewById(R.id.created_time);
        created_time.setText(dc.getCreated_time(date));
        created_time.setOnClickListener(this);
        TextView registered_time = (TextView)findViewById(R.id.registered_time);
        registered_time.setText(dc.getRegistered_time(date));
        registered_time.setOnClickListener(this);
        TextView solve_to_time = (TextView)findViewById(R.id.solve_to_time);
        solve_to_time.setText(dc.getSolve_to_time(date, random.nextInt(10)));
        solve_to_time.setOnClickListener(this);
        TextView responsible_object = (TextView)findViewById(R.id.responsible_object);
        responsible_object.setText(dc.getResponsible_object());
        responsible_object.setOnClickListener(this);
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(dc.getDescription());
        description.setOnClickListener(this);

    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            Toast.makeText(getApplicationContext(),item.getClass().getSimpleName(),Toast.LENGTH_SHORT).show();
            finish();
        }
        return true;
    }
    public void onClick (View v)
     {
        Toast.makeText(getApplicationContext(),v.getClass().getSimpleName(),Toast.LENGTH_SHORT).show();
     }

}
