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
    String mDescription []={"1 topics", "1 topics", "1 topics", "1 topics", "1 topics", "1 topics", "1 topics","1 topics", "1 topics","1 topics", "1 topics", "1 topics"};


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
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Statistic.class));
                }
                if (position==1){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_StatisticVariable.class));
                }
                if (position==2){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Absolute.class));
                }
                if (position==3){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Graph.class));
                }
                if (position==4){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Arithmatical.class));
                }
                if (position==5){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Geometri.class));
                }
                if (position==6){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Mathematical.class));
                }
                if (position==7){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Mode.class));
                }
                if (position==8){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Median.class));
                }
                if (position==8){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Range.class));
                }
                if (position==10){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_AbsoluteDeviation.class));
                }
                if (position==11){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability_Statistics_Variance.class));
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

