import java.util.*

open class Kalkulator { // induk
    open fun berhitung(x: Int, y: Int): Int {
        return 0
    }
}
class penjumlahan: Kalkulator() { // turunan ke 1 dari induk
    override fun berhitung(x: Int, y: Int): Int {
        return x + y
    }
}
class pengurangan : Kalkulator() { // turunan ke 2 dari induk
    override fun berhitung(x: Int, y: Int): Int {
        return x - y
    }
}
class perkalian: Kalkulator() { // turunan ke 3 dari induk
    override fun berhitung(x: Int, y: Int): Int {
        return x * y
    }
}
class pembagian: Kalkulator() { // turunan ke 4 dari induk
    override fun berhitung(x: Int, y: Int): Int {
        return x / y
    }
}
fun main()
{
    // membuat objek dan menampilkan hasil kalkulator

    var input=Scanner(System.`in`)
    var penjumlahan = penjumlahan()
    var pengurangan = pengurangan()
    var perkalian = perkalian()
    var pembagian = pembagian()

    println("=====PROGRAM KALKULATOR=====")
    print("Masukkan nilai X = ") // input memasukan nilai x
    var x=input.nextInt()

    print("Masukkan nilai Y = ") // intput memasukan nilai y
    var y=input.nextInt()

    println("=====Hasil=====")
    println("Penjumlahan = "+penjumlahan.berhitung(x,y)) //
    println("Pengurangan = "+pengurangan.berhitung(x,y))
    println("Perkalian = "+perkalian.berhitung(x,y))
    println("Pembagian= "+pembagian.berhitung(x,y))

}