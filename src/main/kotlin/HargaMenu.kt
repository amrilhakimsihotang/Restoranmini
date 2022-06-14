class HargaMenu() {
    val hrgPecelLele: Int = 15000
    val jusJeruk: Int = 8000

    val hrgAyamPenyet: Int = 17000
    val jusPokat: Int = 7500

    fun HargaPecel(jmlPesananJeruk: Int): Int {
        val totalHrgJusJeruk: Int
        if (jmlPesananJeruk == 0) {
            totalHrgJusJeruk = hrgPecelLele + (jusJeruk * 1)
        } else {
            totalHrgJusJeruk = hrgPecelLele + (jusJeruk * jmlPesananJeruk)
        }
        return totalHrgJusJeruk
    }

    fun HargaAyamPenyet(jmlPesananPokat: Int): Int {
        val totalHrgJusPokat: Int
        if (jmlPesananPokat == 0) {
            totalHrgJusPokat = hrgAyamPenyet + (jusPokat * 1)
        } else {
            totalHrgJusPokat = hrgAyamPenyet + (jusPokat * jmlPesananPokat)
        }
        return totalHrgJusPokat
    }
}