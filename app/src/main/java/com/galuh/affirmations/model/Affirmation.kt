//Kode dibawah ini merupakan nama paket aplikasi android yang telah kita buat.
//Dan nama paketnya adalah com.galuh
package com.galuh.affirmations.model

//Kode - kode dibawah ini merupakan fungsi khusus yang digunakan untuk memanggil
//fungsi fungsi atau operator lainnya.
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//kode dibawah ini merupakan nama kelas Affirmation.
//pada kelas  ini menggunakan parameter yang didalamnya terdapat @stringRes dan @drawable
// @StringRes untuk memastikan bahwa parameter resource berisi referensi R.string ,
//@Drawble Menunjukkan bahwa parameter bilangan bulat, bidang, atau
// nilai pengembalian metode diharapkan menjadi referensi sumber daya yang dapat digambar
class Affirmation( @StringRes val stringResourceId: Int,
                   @DrawableRes val imageResourceId: Int
) {

}