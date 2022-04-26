//Kode dibawah ini merupakan nama paket aplikasi android yang telah kita buat.
//Adaptor bertanggung jawab untuk mengambil data dari kumpulan
// data dan untuk menghasilkan View objects berdasarkan data
// tersebut. View Objek yang dihasilkan kemudian digunakan
// untuk mengisi tampilan adaptor yang terikat ke adaptor
package com.galuh.affirmations.adapter

//Kode - kode dibawah ini merupakan fungsi khusus yang digunakan untuk memanggil
//fungsi fungsi atau operator lainnya.
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.galuh.affirmations.R
import com.galuh.affirmations.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */

//kode dibawah ini digunakan untuk membuat class ItemAdapter
//dalam kelas ini dibuat digunakan untuk membuat adapter
//dalam kelas ini kita mendeklarasikan beberapa variable, dan variable tersebut dideklarasikan
//secara privat, yang artinya juga varible tersebut dipanggil hanya bisa dari kelas ini saja
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

// Memberikan referensi ke tampilan untuk setiap item data
// Item data kompleks mungkin memerlukan lebih dari satu tampilan per item, dan
// Anda memberikan akses ke semua tampilan untuk item data dalam penampung tampilan.
// Setiap item data hanyalah objek Afirmasi.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)

    }

    /**
     * Buat tampilan baru (dipanggil oleh pengelola tata letak)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Ganti konten tampilan (dipanggil oleh pengelola tata letak)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }


    /**
     * Kembalikan ukuran kumpulan data Anda (dipanggil oleh pengelola tata letak)
     */
    override fun getItemCount() = dataset.size
}

