import java.util.Scanner

open class mahasiswaa(var Spp: Int, var Vari: Int, var StudyTour: Int = 0) {
    open fun zpp(): Int {
        var variable = Vari*22
        println("Jumlah Spp Mahasiswa $Spp $Vari $StudyTour")
        return 0
    }
}

open class internasional(Spp: Int, Vari: Int, StudyTour: Int):mahasiswaa(Spp, Vari, StudyTour){
    override fun zpp(): Int {
        println("Spp Tetap Adalah $Spp $Vari $StudyTour")
        return 0
    }
}

fun main() {
    val baca = Scanner(System.`in`)
    var iSKS = baca.nextInt()
    println("Masukkan Jumlah SKS = ")
    var iver = baca.nextInt()
    println("Masukkan Variable = ")
    var itour = baca.nextInt()
    println("Masukkan Tour")


    var mahasiswa = mahasiswaa(iSKS,iver,itour)
    println(mahasiswa.zpp())
    var mahasiswa2 = internasional(iSKS,iver,itour)
    println(mahasiswa2.zpp())
}