package pl.parzych.pam_zadanie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pl.parzych.pam_zadanie.list.listAdapter;
import pl.parzych.pam_zadanie.list.list;

public class MainActivity extends AppCompatActivity {

    private int max = 15;
    private int min = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<list> lista = new ArrayList<>();




        Random rand = new Random();

        lista.add(new list("1",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("2",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("3",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("4",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("5",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("6",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("7",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("8",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("9",Integer.toString(rand.nextInt(max - min + 1) + min)));
        lista.add(new list("10",Integer.toString(rand.nextInt(max - min + 1) + min)));



        RecyclerView listRecyclerView = findViewById(R.id.recycler_view);

    listRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    listAdapter listAdapter  = new listAdapter(lista);

    listRecyclerView.setAdapter(listAdapter);




    }
}
