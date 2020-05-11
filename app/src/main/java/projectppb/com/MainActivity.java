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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ListView listView;
    String mTittle[]={"Algebra","Geometry","Recretaional Mathematics","Calculus and Analysis","Applied Mathematics","Probability and Statistics","Foundations and Statistics","Discrete Mathematics","Number Theory"};
    String mDescription []={"7 topics","13 topics","2 topics","18 topics","2 topics","3 topics","1 topics","2 topics","8 topics"};
    int images[]={R.drawable.algebra,R.drawable.geometri,R.drawable.rectiational,R.drawable.calculus,R.drawable.applied,R.drawable.probality,R.drawable.foundation,R.drawable.discrete,R.drawable.number};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTittle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(getApplicationContext()
                            ,Algebra.class));
                }
                if (position==1){
                    startActivity(new Intent(getApplicationContext()
                            ,Geometry.class));
                }
                if (position==2){
                    startActivity(new Intent(getApplicationContext()
                            ,Recreational.class));
                }
                if (position==3){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus.class));
                }
                if (position==4){
                    startActivity(new Intent(getApplicationContext()
                            ,Applied.class));
                }
                if (position==5){
                    startActivity(new Intent(getApplicationContext()
                            ,Probability.class));
                }
                if (position==6){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations.class));
                }
                if (position==7){
                    startActivity(new Intent(getApplicationContext()
                            ,Discrete.class));
                }
                if (position==8){
                    startActivity(new Intent(getApplicationContext()
                            ,Number.class));
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
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[],String description[], int imgs[]){
            super(c, R.layout.row, R.id.textViewjudulmateri, title);
            this.context= c;
            this.rTitle= title;
            this.rDescription= description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent, false);
            ImageView images = row.findViewById(R.id.imageViewlogomateri);
            TextView myTitle = row.findViewById(R.id.textViewjudulmateri);
            TextView myDescriptionn = row.findViewById(R.id.textViewtopik);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescriptionn.setText(rDescription[position]);

            return row;
        }
    }
}
