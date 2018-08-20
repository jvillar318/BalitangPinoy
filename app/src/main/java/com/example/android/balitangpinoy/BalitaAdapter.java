package com.example.android.balitangpinoy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link BalitaAdapter} knows how to create a list item layout for each balita
 * in the data source (a list of {@link Balita} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BalitaAdapter extends ArrayAdapter<Balita> {
    /**
     * Constructs a new {@link BalitaAdapter}.
     *
     * @param context of the app
     * @param balitas is the list of balitas, which is the data source of the adapter
     */
    public BalitaAdapter(Context context, List<Balita> balitas) {
        super(context, 0, balitas);
    }
    /**
     * Returns a list item view that displays information about the balita at the given position
     * in the list of balitas.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.balita_list_item, parent, false);
        }
        // Find the balita at the given position in the list of balitas
        Balita currentBalita = getItem(position);
        // Find the TextView with view ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.title);
        // Display the magnitude of the current balita in that TextView
        magnitudeView.setText(currentBalita.getTitle());
        // Find the TextView with view ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.date);
        // Display the location of the current balita in that TextView
        locationView.setText(currentBalita.getDate());
        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.section_name);
        // Display the date of the current balita in that TextView
        dateView.setText(currentBalita.getSectionName());
        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
