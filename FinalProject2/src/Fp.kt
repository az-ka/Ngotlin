import java.util.*

open class namaBarang(var satu: Int , var dua: Int, var tiga: Int) {
    open fun barang(): Int {
        print("Aku Membeli Beli $satu $dua $tiga")
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
    var nim:Array<String?> = arrayOfNulls(data)
    for (i in 0..names.size-1) {
        print("Masukkan Nama : ")
        var namaBaru = input.nextLine()
        names.set(i, namaBaru)
        print("")
        print("Masukkan Nim : ")
        var nimBaru = input.nextLine()
        nim.set(i, nimBaru)
    }

    for (i in 0..names.size-1) {
        println("Nama Dan Nim Anggota Ke ${i+1}")
        println("Nama = "+names[i])
        println("Nim  = "+nim[i])
        println("===========")
    }

    println("==PROGRAM MENGHITUNG TOTAL BELANJA OUTFIT==")
    println()
    println("||=>List Outfit<=||")
    println()
    println("===================>>List Baju==================")
    print("" +
            "1. LV........................Harga Rp.100000 \n" +
            "2. BALENCIAGA................Harga Rp.200000 \n" +
            "3. HERMES....................Harga Rp.300000 \n" +
            "4. GUCI......................Harga Rp.400000 \n" +
            "5. FENDI.....................Harga Rp.500000 \n")
    println()
    println("===================>>List Celana==================")
    print("" +
            "1. LV........................Harga Rp.100000 \n" +
            "2. BALENCIAGA................Harga Rp.200000 \n" +
            "3. HERMES....................Harga Rp.300000 \n" +
            "4. GUCI......................Harga Rp.400000 \n" +
            "5. FENDI.....................Harga Rp.500000 \n")
    println()
    println("===================>>List Sepatu==================")
    print("" +
            "1. LV........................Harga Rp.100000 \n" +
            "2. BALENCIAGA................Harga Rp.200000 \n" +
            "3. HERMES....................Harga Rp.300000 \n" +
            "4. GUCI......................Harga Rp.400000 \n" +
            "5. FENDI.....................Harga Rp.500000 \n")
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
        1 -> "LV.........."
        2 -> "BALENCIAGA.."
        3 -> "HERMES......"
        4 -> "GUCCI......."
        5 -> "FENDI......."
        else -> "Yang Anda Inputkan Tidak Ada"
    }

    var celana = when(dua) {
        1 -> "LV.........."
        2 -> "BALENCIAGA.."
        3 -> "HERMES......"
        4 -> "GUCCI......."
        5 -> "FENDI......."
        else -> "Yang Anda Inputkan Tidak Ada"
    }

    var sepatu = when(tiga) {
        1 -> "LV.........."
        2 -> "BALENCIAGA.."
        3 -> "HERMES......"
        4 -> "GUCCI......."
        5 -> "FENDI......."
        else -> "Yang Anda Inputkan Tidak Ada"
    }

//    List Harga Barang
    var hargaBaju:Int = when(satu) {
        1 -> 100000
        2 -> 200000
        3 -> 300000
        4 -> 400000
        5 -> 500000
        else -> 0
    }

    var hargaCelana: Int = when(dua) {
        1 -> 100000
        2 -> 200000
        3 -> 300000
        4 -> 400000
        5 -> 500000
        else -> 0
    }

    var hargaSepatu: Int = when(tiga) {
        1 -> 100000
        2 -> 200000
        3 -> 300000
        4 -> 400000
        5 -> 500000
        else -> 0
    }
    var total: Int
    if (apakah == "y") {
        total = hargaBaju+hargaCelana+hargaSepatu+10000
    }else {
        total = hargaBaju+hargaCelana+hargaSepatu
    }
    println()
    println("Nota Pembelian Barang : \n")
    print("Kategori Baju Merk....... $baju\t Dengan Harga $hargaBaju\n")
    print("Kategori celana Merk..... $celana\t Dengan Harga $hargaCelana\n")
    print("Kategori sepatu Merk..... $sepatu\t Dengan Harga $hargaSepatu\n")

    if (apakah == "y") {
        println("Donasi............................................... 10000")
    }
    println("====================================================")
    print("Total Harga.......................................... $total")

    println()
    println("Terima Kasih Telah Belanja Di Toko Al Mubarok")
    println("")



}