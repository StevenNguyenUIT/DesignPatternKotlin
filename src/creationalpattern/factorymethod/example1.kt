package creationalpattern.factorymethod

fun main(){
    val notations = listOf("qa8","pc3") // more chess
    val pieces = mutableListOf<ChessPiece>()
    for (n in notations){
        pieces.add(createPiece(n))
    }
    println(pieces)
}

fun createPiece(notation: String): ChessPiece {
    val (type, file, rank) = notation.toCharArray()
    return when(type){
        'q' -> Queen(file, rank)
        'p' -> Pawn(file, rank)
        else -> throw IllegalArgumentException("Unknow piece: $type")
    }
}

interface ChessPiece {
    val file: Char
    val rank: Char
}

data class Pawn(override val file: Char, override val rank: Char):ChessPiece
data class Queen(override val file: Char, override val rank: Char): ChessPiece
