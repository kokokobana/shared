package org.bitbucket.wakfuthesaurus.shared.anm

import org.bitbucket.wakfuthesaurus.shared.anm.AnmIndex.AnmIndexFlags

case class AnmIndex(flags: AnmIndexFlags,
                    scale: Option[Float],
                    renderRadius: Option[Float],
                    fileNames: Option[Array[String]],
                    animationFileRecords: Array[AnimationFileRecord],
                    partsHiddenByItem: Option[Array[HidingPart]],
                    canHidePartItems: Option[Array[CanHidePart]],
                    extension: Option[AnmIndexExtension])

final case class AnimationFileRecord(name: String, crc: Int, fileIndex: Short)

final case class CanHidePart(itemName: String, crcKey: Int)

final case class HidingPart(crcKey: Int, crcToHide: Int)

object AnmIndex {

  final class AnmIndexFlags(flags: Byte) {
    @inline def hasScale: Boolean = (flags & 0x1) != 0x0

    @inline def hasExtension: Boolean = (flags & 0x2) != 0x0

    @inline def hasRenderRadius: Boolean = (flags & 0x8) != 0x0

    @inline def hasHidingPart: Boolean = (flags & 0x4) != 0x0

    @inline def useFlip: Boolean = (flags & 0x10) == 0x0

    @inline def usePerfectHitTest: Boolean = (flags & 0x20) == 0x20

    @inline def canHidePart: Boolean = (flags & 0x40) != 0x0

    @inline def isExtended: Boolean = (flags & 0x80) != 0x0
  }

}
