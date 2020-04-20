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

public class DetailActivity extends AppCompatActivity {

    private ArrayList<String> judulmateri2 = new ArrayList<>();
    private ArrayList<String> topik2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

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
    private void prosesRecyclerViewAdapterDetail(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapterDetail adapter = new RecyclerViewAdapterDetail(judulmateri2, topik2,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
    }
    private void getData(){
        judulmateri2.add("Matrices");
        topik2.add("3 topics");

        judulmateri2.add("Determinants");
        topik2.add("3 topics");

        judulmateri2.add("Equations");
        topik2.add("4 topics");

        judulmateri2.add("Fractions");
        topik2.add("7 topics");

        judulmateri2.add("Polynomials");
        topik2.add("8 topics");

        judulmateri2.add("Linear Programing");
        topik2.add("3 topics");

        judulmateri2.add("Vectors");
        topik2.add("9 topics");

        prosesRecyclerViewAdapterDetail();
    }
}
