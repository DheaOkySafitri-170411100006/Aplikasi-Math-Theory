package projectppb.com;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Geometry_Analytic_Geometry_Distances_Distance3 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry__analytic__geometry__distances__distance3);
        pdfView= (PDFView) findViewById(R.id.pdfView1);
        pdfView.fromAsset("Geometry_Analytic_Geometry_Distances_Distance3.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu beberapa saat. \n Sedang memuat data. . .", Toast.LENGTH_SHORT).show();

    }
}
