import java.util.*
var input = Scanner(System.`in`)
open class namaKelompok (val nama: String) {
    open fun Sekolah(sekolah: String) {
        println("Nama Kelompok $nama,\n Dari Universitas $sekolah")
    }
    fun namaAggota(jumlah: Int) {
        for (i in 1..jumlah){
            print("Masukkan Nama Anggota Ke $i = \n")
            var anggota = readLine()!!
            var namaAnggota = arrayOf(anggota)

            print("Masukkan Nim Anggota = \n")
            var nimAnggota = input.nextInt()
            var nimZ= arrayOf(nimAnggota)
            for (i in 0..namaAnggota.size-1) print("Nama Anggota ${i+1} "+namaAnggota[i]+"\n")
            for (i in 0..nimZ.size-1) print("Nim Anggota "+nimZ[i]+"\n")
        }


    }

}

fun main() {
//    Anggota Pertama

    print("Masukkan Nama Kelompok = ")
    var nama = input.nextLine()
    var Kelompok = namaKelompok(nama)
    print("Masukkan Nama Universitas = ")
    var universitas = input.nextLine()
    Kelompok.Sekolah(universitas)

    print("Masukkan Berapa Jumlah Kelompok = ")
    var jml = input.nextInt()
    Kelompok.namaAggota(jml)





}