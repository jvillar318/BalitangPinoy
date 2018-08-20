package com.example.android.balitangpinoy;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BalitaActivity extends AppCompatActivity {

    public static final String LOG_TAG = BalitaActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balita);

        // Create a fake list of balita locations.
        ArrayList<Balita> balitas = new ArrayList<>();
        balitas.add(new Balita("The unassuming Australian nun taking on Rodrigo Duterte", "2018-06-15T23:00:29Z", "World news"));
        balitas.add(new Balita("Rodrigo Duterte to pull Philippines out of international criminal court", "2018-03-14T13:17:04Z", "World news"));
        balitas.add(new Balita("Philippine president Duterte needs psychiatric evaluation, says UN chief", "2018-03-09T09:13:54Z", "World news"));
        balitas.add(new Balita("Trump hails 'great relationship' with Philippines' Duterte", "2017-11-13T13:29:02Z", "World news"));
        balitas.add(new Balita("Morning mail: Donald Trump embraces Duterte", "2017-11-13T19:47:43Z", "World news"));


        // Find a reference to the {@link ListView} in the layout
        ListView balitaListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of balitas
        BalitaAdapter adapter = new BalitaAdapter(this, balitas);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        balitaListView.setAdapter(adapter);
    }
}