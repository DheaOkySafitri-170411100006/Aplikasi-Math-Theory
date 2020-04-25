package projectppb.com;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> logomateri = new ArrayList<>();
    private ArrayList<String> judulmateri = new ArrayList<>();
    private ArrayList<String> topik = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        //inisialisasi
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        //se home selected
        bottomNavigationView.setSelectedItemId(R.id.home);
        // perform ItemSelectedListener
        bottomNavigationView. setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.settings:
                        startActivity(new Intent(getApplicationContext()
                                ,Settings.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.favorites:
                        startActivity(new Intent(getApplicationContext()
                                ,Favorites.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.viewed:
                        startActivity(new Intent(getApplicationContext()
                                ,Viewed.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(logomateri, judulmateri, topik, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
    }

    private void getData(){

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/algebra.JPG?raw=true");
        judulmateri.add("Algebra");
        topik.add("7 topics");

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/geometri.JPG?raw=true");
        judulmateri.add("Geometry");
        topik.add("13 topics");

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/rectiational.JPG?raw=true");
        judulmateri.add("Recreational Mathematics");
        topik.add("2 topics");

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/calculus.JPG?raw=true");
        judulmateri.add("Calculus and Analysis");
        topik.add("18 topics");

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/aplied.JPG?raw=true");
        judulmateri.add("Applied Mathematics");
        topik.add("2 topics");

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/probality.JPG?raw=true");
        judulmateri.add("Probability and Statistics");
        topik.add("3 topics");

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/foundation.JPG?raw=true");
        judulmateri.add("Foundations of Mathemathic");
        topik.add("1 topics");

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/discrete.JPG?raw=true");
        judulmateri.add("Discrete Mathematic");
        topik.add("2 topics");

        logomateri.add("https://github.com/DheaOkySafitri-170411100006/Aplikasi-Math-Theory/blob/master/image/number.JPG?raw=true");
        judulmateri.add("Number Theory");
        topik.add("8 topics");
        prosesRecyclerViewAdapter();

    }
}
