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

public class Foundations_theory extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ListView listView;
    TextView textViewpenjelasan;
    String mTittle[]={"Definition and notation of set", "Equality between sets", "Union and intersection of sets", "Set differences", "Complement of a set", "Property of sets", "Set product", "Set cardinality", "Set of number", "Introduction to intervals"};
    String mDescription []={"1 topics", "1 topics", "1 topics","1 topics", "1 topics", "1 topics", "1 topics", "1 topics", "1 topics", "1 topics"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foundations_theory);

        listView =findViewById(R.id.listView);

        Foundations_theory.MyAdapter adapter = new MyAdapter(this, mTittle, mDescription);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Definition.class));
                }
                if (position==1){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Equality.class));
                }
                if (position==2){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Union.class));
                }
                if (position==3){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Differences.class));
                }
                if (position==4){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Complement.class));
                }
                if (position==5){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Property.class));
                }
                if (position==6){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Product.class));
                }
                if (position==7){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Cardinality.class));
                }
                if (position==8){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Number.class));
                }
                if (position==9){
                    startActivity(new Intent(getApplicationContext()
                            ,Foundations_Set_Introduction.class));
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

