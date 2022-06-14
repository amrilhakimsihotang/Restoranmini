import kotlin.system.exitProcess

/*
Kotlin Basic - Beginner
Menggunakan looping while, control flow - when
Class and function

languange: Kotlin
Editor : IntelliJ IDEA 2022.1.2 (Community Edition)

by AHS.
* */

fun main() {

    var hargaBayar: Int
    var hargaKembali: Int
    var byr: Int
    var inp: Int
    var repeat = "y"
    while (repeat.equals("y")) {
        println("===============")
        println("Menu Kasir")
        println("================")
        println("1. Pecel Lele")
        println("2. Ayam Penyet")
        println("3. Keluar")
        println("================")
        print("Pilih Menu: ")
        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                println("\n Total bayar Pecel Lele")
                println("---------------------------")
                val hargaLele = HargaMenu()
                println("Harga Spesial Jumbo:  ${hargaLele.hrgPecelLele}")
                println("Jus Jeruk: ${hargaLele.jusJeruk}")
                print("Pesan jus Jeruk(isi dengan angka): ")
                inp = readLine()?.toIntOrNull() ?: 0
                if (inp == 0) {
                    hargaBayar = hargaLele.HargaPecel(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                } else {
                    hargaBayar = hargaLele.HargaPecel(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {

                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                }
            }
            2 -> {
                println("\n Total bayar Ayam Penyet")
                println("---------------------------")
                val harga = HargaMenu()
                println("Harga Spesial Jumbo:  ${harga.hrgAyamPenyet}")
                println("Jus Pokat: ${harga.jusPokat}")
                print("Pesan jus Pokat(isi dengan angka): ")
                inp = readLine()?.toIntOrNull() ?: 0
                if (inp == 0) {
                    hargaBayar = harga.HargaAyamPenyet(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                } else {
                    hargaBayar = harga.HargaAyamPenyet(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {

                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                }
            }
            3 -> {
                println("See ya")
                exitProcess(0)
            }
            else -> println("Pilihan salah")

        }

        print("Transaksi selanjutnya? (Y/T)")
        repeat = readLine()!!.toString()
    }
}

