package nota_barang
import java.util.Scanner

open class Nota(var satu: Int ) {
    open fun hape(): Int {
        print("Nita $satu ")
        return 0
    }
}
class hp(satu: Int): Nota(satu) {
    override fun hape(): Int {
        if (satu == 1) {
            var produk = "Oppo A52"
            println("Anda Memilih No $satu Dengan Nama Produk $produk")
        }else if (satu == 2) {
            var produk = "Redmi Note 9"
            println("Anda Memilih No $satu Dengan Nama Produk $produk")
        }else if (satu == 3) {
            var produk = "Realme C15"
            println("Anda Memilih No $satu Dengan Nama Produk $produk")
        }else if (satu == 4) {
            var produk = "Galaxy A21s"
            println("Anda Memilih No $satu Dengan Nama Produk $produk")
        }
        return 0
    }
}


fun main() {
    print("Daftar Barang")
    println()
    println("1. Oppo A52         Rp. 2.999.000 (Diskon 20%")
    println("2. Redmi Note 9     Rp. 2.099.000 (Diskon 10%")
    println("3. Realme C15       Rp. 2.055.000 (Diskon 15%)")
    println("4. Galaxy A21s      Rp. 2.939.000 (Diskon 10%")

    var scanner = Scanner(System.`in`) // Beguna Untuk Meninput Data
    print("Masukkan No Pesanan Anda = ")
    var satu = scanner.nextInt()
    var hasil = hp(satu) // Variable Object Yang Bernama hasil Berfungsi Mengotputkan Data Class azka
    println()
    println(hasil.hape())

    var phone = when(satu) {
        1 -> 2999000 * 0.2
        2 -> 2099000 * 0.1
        3 -> 2055000 * 0.15
        4 -> 2939000 * 0.1
        else -> "Daftar Hape Yang Diinputkan Tidak Ada"
    }


    println("<---------- Nota Belanja ---------->")
    println("Total Harga Yang Dipesan : Rp. $phone")
}