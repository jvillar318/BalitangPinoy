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
        ArrayList<String> balitas = new ArrayList<>();
        balitas.add("San Francisco");
        balitas.add("London");
        balitas.add("Tokyo");
        balitas.add("Mexico City");
        balitas.add("Moscow");
        balitas.add("Rio de Janeiro");
        balitas.add("Paris");

        // Find a reference to the {@link ListView} in the layout
        ListView balitaListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of balitas
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, balitas);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        balitaListView.setAdapter(adapter);
    }
}