package projectppb.com;

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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Calculus_Complex extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ListView listView;
    TextView textViewpenjelasan;
    String mTittle[]={"Definition","Operations binomic form","Representation in plane","Complex number","Operations polar form","Representation polar form","Product n quotient","Exponentiation imaginary","Moivre's formula","n-th roots"};
    String mDescription []={"1 topics","1 topics","1 topics","1 topics","1 topics","1 topics","1 topics","1 topics","1 topics","1 topics","1 topics"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculus__complex);

        listView =findViewById(R.id.listView);

        Calculus_Complex.MyAdapter adapter = new MyAdapter(this, mTittle, mDescription);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Definition.class));
                }
                if (position==1)
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Operations.class));
                if (position==2){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Representation.class));
                }
                if (position==3){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Complex.class));
                }
                if (position==4){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Complex2.class));
                }
                if (position==5){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Operations2.class));
                }
                if (position==6){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Representation2.class));
                }
                if (position==7){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Complex3.class));
                }
                if (position==8){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Complex_Exponentiation.class));
                }
                if (position==9){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_Exponentiation2.class));
                }
                if (position==10){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Complex_nth.class));
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
                                , Settings.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.favorites:
                        startActivity(new Intent(getApplicationContext()
                                , Favorites.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.viewed:
                        startActivity(new Intent(getApplicationContext()
                                , Viewed.class));
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
