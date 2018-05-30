package org.bitbucket.wakfuthesaurus.shared.anm

final case class AnmIndexExtension(heights: Option[Map[Int, Byte]],
                                   highLightColor: Option[Array[Float]]) {
  @inline def getHeight(fileName: String): Option[Int] =
    heights.flatMap(dict ⇒ dict.get(fileName.hashCode).map(_ - 1))
}

object AnmIndexExtension {

  final class AnmIndexExtendFlags(flags: Int) {
    @inline def hasAnimHeight: Boolean = (flags & 0x1) != 0x0

    @inline def hasHighlightBoost: Boolean = (flags & 0x2) == 0x2
  }

}
