package projectppb.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Foundations_Set_Differences extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foundations__set__differences);

        pdfView= (PDFView) findViewById(R.id.pdfView1);
        pdfView.fromAsset("Foundations_Theory_Sets.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu beberapa saat. \n Sedang memuat data. . .", Toast.LENGTH_SHORT).show();
    }
}
