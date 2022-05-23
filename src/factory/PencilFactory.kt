package factory

import java.awt.Color

class PencilFactory {
    fun createDefaultPencil(): Pencil {
        return Pencil(100, "HB", Color.BLACK)
    }

    fun createPencilToWrite(long: Int): Pencil {
        return Pencil(long, "2HB", Color.BLACK)
    }

    fun createPencilToDraw(long: Int, color: Color): Pencil {
        return Pencil(long, "7B", color)
    }
}