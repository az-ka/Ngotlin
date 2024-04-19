import java.util.*

open class namaBarang(var satu: Int , var dua: Int, var tiga: Int) {
    open fun barang(): Int {
        print("Aku Membaeli Beli $satu $dua $tiga")
        return 0
    }
}

class barangNama(satu: Int, dua: Int, tiga: Int): namaBarang(satu, dua, tiga) {
    override fun barang(): Int {
        println("Outfit Yang Dipilih Adalah\n1. Baju Nomer $satu \n2. Celana Nomer $dua \n3. Sepatu Nomer $tiga \n")
        return 0
    }
}



fun main() {
    var input = Scanner(System.`in`)
    print("Masukkan Berapa Banyak Anggota Kelompok = ")
    var data = readLine()!!.toInt()
    var names:Array<String?> = arrayOfNulls(data)
    var nim:Array<Int?> = arrayOfNulls(data)
    for (i in 0..names.size-1) {
        print("Masukkan Nama ")
        var namaBaru = input.nextLine()
        names.set(i, namaBaru)
        print("Masukkan Nim ")
        var nimBaru = readLine()!!.toInt()
        nim.set(i, nimBaru)
    }

    for (i in 0..names.size-1) {
        println("Nama Dan Nim Anggota Ke ${i+1}")
        println("Nama = "+names[i])
        println("Nim  = "+nim[i])
    }

    println("==*PROGRAM MENGHITUNG TOTAL BELANJA OUTFIT*==")
    println()
    println("||=>List Outfit<=||")
    println("===================>>List Baju")
    print("" +
            "1. namaBarang................Harga \n" +
            "2. namaBarang................Harga \n" +
            "3. namaBarang................Harga \n" +
            "4. namaBarang................Harga \n" +
            "5. namaBarang................Harga \n" +
            "6. namaBarang................Harga \n" +
            "7. namaBarang................Harga \n" +
            "8. namaBarang................Harga \n" +
            "9. namaBarang................Harga \n" +
            "10. namaBarang...............Harga \n")
    println("===================>>List Celana")
    print("" +
            "1. namaBarang................Harga \n" +
            "2. namaBarang................Harga \n" +
            "3. namaBarang................Harga \n" +
            "4. namaBarang................Harga \n" +
            "5. namaBarang................Harga \n" +
            "6. namaBarang................Harga \n" +
            "7. namaBarang................Harga \n" +
            "8. namaBarang................Harga \n" +
            "9. namaBarang................Harga \n" +
            "10. namaBarang...............Harga \n")
    println("===================>>List Sepatu")
    print("" +
            "1. namaBarang................Harga \n" +
            "2. namaBarang................Harga \n" +
            "3. namaBarang................Harga \n" +
            "4. namaBarang................Harga \n" +
            "5. namaBarang................Harga \n" +
            "6. namaBarang................Harga \n" +
            "7. namaBarang................Harga \n" +
            "8. namaBarang................Harga \n" +
            "9. namaBarang................Harga \n" +
            "10. namaBarang...............Harga \n")
    print("Masukkan No Belanja Baju   = ")
    var satu = input.nextInt()
    print("Masukkan No Barang Celana  = ")
    var dua = input.nextInt()
    print("Masukkan No Barang Sepatu  = ")
    var tiga = input.nextInt()
    var hasil = barangNama(satu, dua, tiga)
    print(hasil.barang())

    print("Apakah Ingin Berdonasi Senilai 10000? (y/n)")
    var apakah = readLine()!!



//    List Nama Barang
    var baju = when(satu) {
        1 -> "namaBarangBaju"
        2 -> "namaBarangBaju"
        3 -> "namaBarangBaju"
        4 -> "namaBarangBaju"
        5 -> "namaBarangBaju"
        6 -> "namaBarangBaju"
        7 -> "namaBarangBaju"
        8 -> "namaBarangBaju"
        9 -> "namaBarangBaju"
        10 -> "namaBarangBaju"
        else -> "Yang Anda Inputkan Tidak Ada"
    }

    var celana = when(dua) {
        1 -> "namaBarangCelana"
        2 -> "namaBarangCelana"
        3 -> "namaBarangCelana"
        4 -> "namaBarangCelana"
        5 -> "namaBarangCelana"
        6 -> "namaBarangCelana"
        7 -> "namaBarangCelana"
        8 -> "namaBarangCelana"
        9 -> "namaBarangCelana"
        10 -> "namaBarangCelana"
        else -> "Yang Anda Inputkan Tidak Ada"
    }

    var sepatu = when(tiga) {
        1 -> "namaBarangSepatu"
        2 -> "namaBarangSepatu"
        3 -> "namaBarangSepatu"
        4 -> "namaBarangSepatu"
        5 -> "namaBarangSepatu"
        6 -> "namaBarangSepatu"
        7 -> "namaBarangSepatu"
        8 -> "namaBarangSepatu"
        9 -> "namaBarangSepatu"
        10 -> "namaBarangSepatu"
        else -> "Yang Anda Inputkan Tidak Ada"
    }

//    List Harga Barang
    var hargaBaju:Int = when(satu) {
        1 -> 100
        2 -> 200
        3 -> 300
        4 -> 400
        5 -> 500
        6 -> 600
        7 -> 700
        8 -> 800
        9 -> 900
        10 -> 1000
        else -> 0
    }

    var hargaCelana: Int = when(dua) {
        1 -> 100
        2 -> 200
        3 -> 300
        4 -> 400
        5 -> 500
        6 -> 600
        7 -> 700
        8 -> 800
        9 -> 900
        10 -> 1000
        else -> 0
    }

    var hargaSepatu: Int = when(tiga) {
        1 -> 100
        2 -> 200
        3 -> 300
        4 -> 400
        5 -> 500
        6 -> 600
        7 -> 700
        8 -> 800
        9 -> 900
        10 -> 1000
        else -> 0
    }
    var total: Int
    if (apakah == "y") {
        total = hargaBaju+hargaCelana+hargaSepatu+10000
    }else {
        total = hargaBaju+hargaCelana+hargaSepatu
    }
    println()
    println("Nota Pembelian Barang : ")
    println("Nama Baju.................. $baju Dengan Harga $hargaBaju")
    println("Nama Celana................ $celana Dengan Harga $hargaCelana")
    println("Nama Sepatu................ $sepatu Dengan Harga $hargaSepatu")
    if (apakah == "y") {
        println("Donasi..................... 10000")
    }
    println("Total Harga................ $total")

    println()
    println("Terima Kasih Telah Belanja Di Toko Al Mubarok")
    println("")



}