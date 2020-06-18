package projectppb.com;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Probability_Statistics extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ListView listView;
    TextView textViewpenjelasan;
    String mTittle[]={"Statistic basic concept", "Statistic variables", "Absolute, relative", "Graph representation", "Arithmatical mean", "Geometri mean", "Mathematical exectation", "The mode", "The median", "Range", "Absolute deviation and standart deviation", "Variance and Standart deviation"};
    String mDescription []={"1 topics", "1 topics", "1 topics", "3 topics", "1 topics", "1 topics", "1 topics","1 topics", "1 topics","1 topics", "1 topics", "1 topics"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probability_statistics);

        listView =findViewById(R.id.listView);

        Probability_Statistics.MyAdapter adapter = new MyAdapter(this, mTittle, mDescription);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(Probability_Statistics.this, "judul1", Toast.LENGTH_LONG).show();
                }
                if (position==1){
                    Toast.makeText(Probability_Statistics.this, "judul2", Toast.LENGTH_LONG).show();
                }
                if (position==2){
                    Toast.makeText(Probability_Statistics.this, "judul3", Toast.LENGTH_LONG).show();
                }
                if (position==3){
                    Toast.makeText(Probability_Statistics.this, "judul4", Toast.LENGTH_LONG).show();
                }
                if (position==4){
                    Toast.makeText(Probability_Statistics.this, "judul5", Toast.LENGTH_LONG).show();
                }
                if (position==5){
                    Toast.makeText(Probability_Statistics.this, "judul6", Toast.LENGTH_LONG).show();
                }
                if (position==6){
                    Toast.makeText(Probability_Statistics.this, "judul7", Toast.LENGTH_LONG).show();
                }
                if (position==7){
                    Toast.makeText(Probability_Statistics.this, "judul8", Toast.LENGTH_LONG).show();
                }
                if (position==8){
                    Toast.makeText(Probability_Statistics.this, "judul9", Toast.LENGTH_LONG).show();
                }
                if (position==9){
                    Toast.makeText(Probability_Statistics.this, "judul10", Toast.LENGTH_LONG).show();
                }
                if (position==10){
                    Toast.makeText(Probability_Statistics.this, "judul11", Toast.LENGTH_LONG).show();
                }
                if (position==11){
                    Toast.makeText(Probability_Statistics.this, "judul12", Toast.LENGTH_LONG).show();
                }
            }
        });
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
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];

        MyAdapter(Context c, String title[], String description[]) {
            super(c, R.layout.rowsubmateri, R.id.textViewjudulsubmateri, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowsubmateri,parent, false);

            TextView myTitle = row.findViewById(R.id.textViewjudulsubmateri);
            TextView myDescriptionn = row.findViewById(R.id.textViewtopiksubmateri);

            myTitle.setText(rTitle[position]);
            myDescriptionn.setText(rDescription[position]);

            return row;
        }
    }
}

