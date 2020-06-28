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

public class Calculus_Integration extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ListView listView;
    TextView textViewpenjelasan;
    String mTittle[]={"Indefinite integral","Direct integrals","Almost direct","Integration by parts","Integrals fractions","Definite integrals","Change of variable","Integration 2 variables","Integral regions","Changes variables","Integral curve","Integral surface","Theorem Green","Areas Calculation","Volume Calculation"};
    String mDescription []={"1 topics","3 topics","1 topics","1 topics","1 topics","3 topics","1 topics","2 topics","1 topics","1 topics","1 topics","1 topics","1 topics","5 topics","2 topics"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculus__integration);

        listView =findViewById(R.id.listView);

        Calculus_Integration.MyAdapter adapter = new MyAdapter(this, mTittle, mDescription);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(getApplicationContext()
                            , Calculus_Integration_Indefinite.class));
                }
                if (position==1){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Direct.class));
                }
                if (position==2){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Almost.class));
                }
                if (position==3){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Integration.class));
                }
                if (position==4){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Integrals.class));
                }
                if (position==5){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Definite.class));
                }
                if (position==6){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Integrals2.class));
                }
                if (position==7){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Integration2.class));
                }
                if (position==8){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Integrals3.class));
                }
                if (position==9){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Changes.class));
                }
                if (position==10){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Integral.class));
                }
                if (position==11){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Integral2.class));
                }
                if (position==12){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Theorem.class));
                }
                if (position==13){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Areas.class));
                }
                if (position==14){
                    startActivity(new Intent(getApplicationContext()
                            ,Calculus_Integration_Volune.class));
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

