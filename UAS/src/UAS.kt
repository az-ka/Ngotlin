var harga:Int = 0
var total: Int = 0
open class pilih() {
    fun tampilPilih(nama: String) {
        println("Nama Bandar Adalah $nama")
    }

    fun beliEmas() {
        println("Beli Emas =============================>")
        print("" +
                "Ketentuan Pembelian Emas Sebagai Berikut : \n" +
                "Harga Per Gram = Rp. 850.000 \n" +
                "Pembelian Minimal = 0,05 Gram Dan Max 80 Gram \n" +
                "Apabila Memiliki NPWP Maka Akan Dikenakan Pajak Sebesar 0,45%\n" +
                "Jika Tidak Mempunyai NPWP Dikenakan 0,9%\n")
    }

    fun jualEmas() {
        println("Jual Emas =============================>")
        print("" +
                "Ketentuan Penjualan Emas Sebagai Berikut : \n" +
                "Harga Per Gram Rp. 900.000 \n" +
                "Penjualan Minimal 1 Gram Dan Maksimal 100 Gram \n" +
                "Apabila Memiliki NPWP Maka Akan Dikenakan 1,5% Dari Total Harga Jual \n" +
                "Apabila Tidak Mempunyai Akan Dikenakan 3% \n")
    }
}

fun main() {
    var pilihP = pilih()
    print("Masukkan Nama Anda = ")
    var nama = readLine()!!
    pilihP.tampilPilih(nama)

    print("Pilih Transaksi = ")
    var milihCobo= readln().toInt()
    if (milihCobo == 1) {
        pilihP.beliEmas()
        print("Apakah Memiliki NPWP? (y/n) = ")
        var piliho = readLine()!!
        if (piliho == "y") {
            harga = 850000
            var pajak = 0.45
            print("Masukkan Jumlah Gram Yang Ingin Dibeli")
            var min = readln().toFloat()
            if (min <= 0.05) {
                println("Tidak Bisa Melakukan Transaksi Karena Terlalu Rendah ")
            }else if (min >= 80){
                println("Tidak Bisa Membeli Melebihi 80 gram")
            }else {
                total = ((harga * min) * pajak).toInt()
                println("Total Harganya Adalah = $total")
            }
        }else {
            harga = 850000
            var pajak = 0.9
            print("Masukkan Jumlah Gram Yang Ingin Dibeli")
            var min = readln().toFloat()
            if (min <= 0.05) {
                println("Tidak Bisa Melakukan Transaksi Karena Terlalu Rendah ")
            }else if (min >= 80){
                println("Tidak Bisa Membeli Melebihi 80 gram")
            }else {
                total = ((harga * min) * pajak).toInt()
                println("Total Harganya Adalah = $total")
            }
        }
    }else if(milihCobo == 2) {
        pilihP.jualEmas()
    }else {
        println("Yang Anda Masukkan Salah")
    }
}