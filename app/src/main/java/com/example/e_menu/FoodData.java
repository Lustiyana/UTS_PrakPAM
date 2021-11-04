package com.example.e_menu;

import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class FoodData {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Donut", "Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur, dan mentega. Donat yang paling umum adalah donat berbentuk cincin dengan lubang di tengah dan donat berbentuk bundar dengan isian manis, seperti selai, jelly, krim, dan custard.\n" +
                "\n" +
                "Donat sama sekali berbeda dengan bagel—mulai dari bahan pembuatan, teknik pembuatan hingga cara menghidangkan,dan juga toping yang digunakan walaupun keduanya memiliki bentuk yang hampir sama.", 3000, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Batagor", "Batagor merupakan nama makanan dari singkatan bakso, tahu, dan goreng. Makanan khas Sunda ini adalah adaptasi dari hidangan Tionghoa-Indonesia.\n Jenis yang paling dikenal luas adalah batagor Bandung. Batagor terdiri dari adonan bakso ikan tenggiri yang diisi ke dalam tahu dan kulit pangsit, kemudian digoreng. Selanjutnya batagor disajikan dengan siraman sambal kacang. Berikut ini resep batagor dari SajianSedap dengan cara masak yang simpel.", 10000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Black Salad merupakan sebuah makanan sehat yang terdiri dari berbagai macam buah buahan atau sayur sayuran. Mengapa dinamakan black salad adalah karena warnanya yang hitam. Warna hitam ini dihasilkan dari Charcoal.",25000,context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Cappuchino", "Cappuccino adalah minuman tradisional Italia yang terkenal dengan lapisan atasnya yang berupa froth susu—yang biasanya di-garnish dengan bubuk coklat. Namun, yang membuat minuman ini menjadi khas bukan sekadar froth susu saja. ",25000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "Menurut sejarahnya, cheesecake sudah ada sejak abad ketujuh. Tiap negara memiliki variasi cheesecake seperti German Cheesecake, Italian Cheesecake, dan cheesecake yang dibuat dari keju Prancis, Neufchatel. Pada tahun 1900an, cheesecake juga dipopulerkan di Philadelphia, yang sampai sekarang dikenal dengan Philadelphia Cheesecake.",35000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng", "Cireng (singkatan dari aci goreng, bahasa Sunda untuk 'tepung kanji goreng') adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka. Makanan ringan ini sangat populer di daerah Priangan, dan dijual dalam berbagai bentuk dan variasi rasa. Makanan ini cukup terkenal pada era 80-an. Bahan makanan ini antara lain terdiri dari tepung kanji, tepung terigu, air, merica bubuk, garam, bawang putih, kedelai, daun bawang dan minyak goreng.",10000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Kopi Hitam", "Kopi hitam adalah Minuman yang berasal dari biji tumbuhan ini bisa disajikan dalam versi dingin maupun panas, bisa dicampur dengan berbagai bahan lain seperti susu dan gula, bisa juga disajikan begitu saja hanya perlu diseduh. Kopi ini banyak disebut sebagai black coffee, atau kopi yang disajikan tanpa gula.",13000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng", "Mie goreng dengan telur, sosis, dan baso dengan berbagai tingkatan kepedasan. Bisa ditambahkan dengan sayuran",12000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Sparkling Tea", "Sparkling tea merupakan minuman teh yang terdiri dari berbagai macam varian rasa buah.",10000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}

