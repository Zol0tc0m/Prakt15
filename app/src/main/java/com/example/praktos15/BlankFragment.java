package com.example.praktos15;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.blank_fragment, container, false);
        textView = view.findViewById(R.id.textView);
        textView.setText("Выберите текст");


        registerForContextMenu(textView);

        view.setBackgroundResource(R.color.blue);
        return view;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getActivity().getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.firstFrag) {
            textView.setText("Первый текст");
            return true;
        } else if (id == R.id.secondFrag) {
            textView.setText("Второй текст");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}
