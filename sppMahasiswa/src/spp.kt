package sppMahasiswa

open class Mahasiswa(val nama: String) {
    open fun tampilSks(sks:Int, nim: Int) {
        println("Nama Mahasiswa $nama Dengan Nim $nim Jumlah SKS Adalah $sks")
    }
}

fun sppInter(n: Int){
    println(" Spp Inter = $n")
}

fun sppReguler(n: Int){
    println(" Spp Reguler = $n")
}

fun variableSpp(n: Int) {
    println(" Spp Variable = $n")
}

fun sppTour(n: Int) {
    println(" Biaya Tor = $n")
}

val tetapInter = 2200000
val tetapReg = 2000000
val sppVar = 200000
val tour = 800000

fun sum(bilangan: List<Int>): Double = bilangan.sumByDouble {it.toDouble()}

fun main() {
    var mahasiswa: Mahasiswa= Mahasiswa("Aldzi Fadlian Azka")
    mahasiswa.tampilSks(4, 20121592)

    sppInter(tetapInter)
    sppReguler(tetapReg)
    variableSpp(sppVar)
    sppTour(tour)

    print("Total Dari Biaya Dari Mahasiswa Inter adalah = ")
    println(sum(listOf(tetapInter+(4* sppVar)+ tour)))
    print("Total Dari Biaya Mahasiswa Regular Adalah = ")
    println(sum(listOf(tetapReg+(4* sppVar))))
}