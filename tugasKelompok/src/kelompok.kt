import java.util.Scanner // Untuk Mengakses Scanner Atau Mempersikat Coding

open class aku(var satu: Int , var dua: Int, var tiga: Int) { // Induk Kelas Bervariable Aku
    open fun nasib(): Int { // Open Fungsi Bernama nasib
        print("Aku Pernah Beli $satu Trus Aku $dua") // Menampilkan Ini
        return 0
    }
}

class azka(satu: Int, dua: Int, tiga: Int): aku(satu, dua, tiga) { // Class Azka Yang Memiliki Indux aku
    override fun nasib(): Int { // Memodif Dari Fingsi nasib Yang Sebelumnya Bersifat Default
        println("Angka Terakhir Tanggal Mu Adalah $satu Bulan Mu $dua Dan Angka Tahun Terakhirmu $tiga")
        return 0
    }
}

fun main() { // Fungsi Untuk Menampilkan Hasil Program
    println("==*TEBAK NASIB MENURUT TANGGAL LAHIR*==")
    println()


    var scanner = Scanner(System.`in`) // Beguna Untuk Meninput Data
    print("Masukkan Angka Terakhir Pada Tanggal Lahir = ")
    var satu = scanner.nextInt() // Input Data Yang Harus Bersifat Integer
    print("Masukkan Bulan Lahir = ")
    var dua = scanner.nextInt() // Input Data Yang Harus Bersifat Integer
    print("Masukkan Angka Terakhir Pada Tahun Lahir = ")
    var tiga = scanner.nextInt() // Input Data Yang Harus Bersifat Integer
    var hasil = azka(satu, dua, tiga) // Variable Object Yang Bernama hasil Berfungsi Mengotputkan Data Class azka
    println()
    println(hasil.nasib()) // Mengoutputkan Object hasil

    // Swift Case Pada Kotlin
    var tgl = when(satu) {
        0 -> "Cintaku"
        1 -> "Mantanku"
        2 -> "Ayahku"
        3 -> "Gembetanku"
        4 -> "Pembantuku"
        5 -> "Tukang Sunatku"
        6 -> "Hatiku"
        7 -> "Kekasihku"
        8 -> "Adik Kelasku"
        9 -> "Ketua Rt ku"
        else -> "Yang Anda Inputkan Tidak Ada"
    }

    var bln = when(dua) {
        1 -> "Kesenggol"
        2 -> "Ternyata"
        3 -> "Kepetok"
        4 -> "Adalah"
        5 -> "Selingkuhan"
        6 -> "Tukang Sedot"
        7 -> "Pembawa"
        8 -> "Ketemu"
        9 -> "Tertarik"
        10 -> "Digebet"
        11 -> "Ketabrak"
        12 -> "Kepincut"
        else -> "Yang Anda Inputkan Tidak Ada"
    }

    var thn = when(tiga) {
        0 -> "Ojek Payung"
        1 -> "Upil Gorila"
        2 -> "Kim Jong Un"
        3 -> "Bedak Lima Ribuan"
        4 -> "Voucher Pulsa"
        5 -> "Nenek Salto"
        6 -> "Keran PDAM"
        7 -> "Donald Trump"
        8 -> "Hadiah Smact"
        9 -> "Jodoh"
        else -> "Yang Anda Inputkan Tidak Ada"
    }

    println("\n")
    println("Hasil Dari Yang Diinputkan")
    println("$tgl $bln $thn") // Mengoutputkan Hasil Data Yang Telah Diinputkan

}