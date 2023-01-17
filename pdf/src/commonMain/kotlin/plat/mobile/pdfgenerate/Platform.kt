package plat.mobile.pdfgenerate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform