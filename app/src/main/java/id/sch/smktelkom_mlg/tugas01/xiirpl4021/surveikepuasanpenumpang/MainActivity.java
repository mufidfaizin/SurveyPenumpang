package id.sch.smktelkom_mlg.tugas01.xiirpl4021.surveikepuasanpenumpang;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    EditText etComment, etNama;
    CheckBox cb1, cb2, cb3;
    Spinner spJurusan;
    Button bKirim;
    RadioGroup rgKelas;
    TextView tvHasil;
    String cbPilih;
    int Pilih = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("PO Gunung Harta");

        etComment = (EditText) findViewById(R.id.editTextKS);
        etNama = (EditText) findViewById(R.id.editTextNama);
        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        rgKelas = (RadioGroup) findViewById(R.id.RadioGroupKelas);
        spJurusan = (Spinner) findViewById(R.id.spinnerJurusan);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        bKirim = (Button) findViewById(R.id.buttonKr);

        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);

        awal();
        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proses();
            }
        });
    }

    private void awal()
    {
        etNama.setText("");
        etComment.setText("");
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        rgKelas.clearCheck();
        spJurusan.setSelection(0);
    }




    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean pilih) {
        if(pilih) Pilih+=1;
        else Pilih-=1;
    }
}
