//Kode dibawah ini merupakan nama paket aplikasi android yang telah kita buat.
package com.galuh.affirmations.data

//Kode - kode dibawah ini merupakan fungsi khusus yang digunakan untuk memanggil
//fungsi fungsi atau operator lainnya.
import com.galuh.affirmations.R
import com.galuh.affirmations.model.Affirmation

//pada kode dibawah ini digunakan untuk membuat suatu kelas Datasource
//pada kelas ini berisikan list data data yang akan ditampilkan.
//dan pada parameter yang digunakan (tipe string, tipe berupa gambar)
//dan semua gambar gambar yang diperlukan tersimpan di folder drawable
class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10)
        )
    }
}
