package projectppb.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Calculus_Sequences_Monotonous extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculus__sequences__monotonous);
        pdfView= (PDFView) findViewById(R.id.pdfView1);
        pdfView.fromAsset("Calculus_Sequences_Monotonous.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu beberapa saat. \n Sedang memuat data. . .", Toast.LENGTH_SHORT).show();

    }
}
