//Kode dibawah ini merupakan nama paket aplikasi android yang telah kita buat.
package com.galuh.affirmations

//Kode - kode dibawah ini merupakan fungsi khusus yang digunakan untuk memanggil
//fungsi fungsi atau operator lainnya.
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.galuh.affirmations.adapter.ItemAdapter
import com.galuh.affirmations.data.Datasource


//kode dibawah ini merupakan method utama.
//dalam method ini, dibuat karena suatu proses dimulai dari method ini.
//dalam method ini terdapat fungsi override yaitu
//Pada pembuatan aktivitas, aktivitas memasuki status Dibuat.
//kemudian pendeklarasian variable
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}

