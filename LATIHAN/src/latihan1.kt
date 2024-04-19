import java.util.*

class Tabungan {
    private var jumlahSaldo = 0

    public fun tampilSaldo(){
        println("Jumlah Saldo : $jumlahSaldo")

    }

    fun tambahSaldo(nominal: Int){
        if (nominal < 0){
            println("Nominal salah")
        }else{
            jumlahSaldo += nominal
            println("Saldo bertambah")
        }
    }

    internal fun tarikSaldo(nominal: Int){
        if (nominal > jumlahSaldo){
            println("Saldo tidak mencukupi")
        }else{
            jumlahSaldo -=nominal
            println("Saldo telah berkurang")
        }
    }
}

fun main() {
    var tabungan = Tabungan()
    var input = Scanner(System.`in`)
    println("Cek Jumlah Saldo")

    tabungan.tampilSaldo()

    println("\nTambah Saldo")
    var nominal = input.nextInt()
    var hasil = tabungan.tambahSaldo(nominal)
    println("Jumlah Saldo : "+hasil)

    println("\nTarik Saldo")
    var nominal2 = input.nextInt()
    var hasil2 = tabungan.tarikSaldo(nominal2)
    println("Jumlah Saldo : "+hasil2)
}