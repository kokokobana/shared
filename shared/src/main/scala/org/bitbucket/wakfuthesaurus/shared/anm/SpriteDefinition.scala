package org.bitbucket.wakfuthesaurus.shared.anm

sealed trait SpriteDefinition {
  def header: SpriteDefinitionHeader
  def frameData: FrameData
}

final case class SpriteDefinitionIndexed(
    override val header: SpriteDefinitionHeader,
    framePos: Array[Int],
    spriteInfo: Array[Short],
    actionInfo: Array[Short],
    override val frameData: FrameData
) extends SpriteDefinition {
  @inline def getFrameCount: Int =
    framePos.length / (if (actionInfo.isEmpty) 2 else 3)
}

final case class SpriteDefinitionSingle(
    override val header: SpriteDefinitionHeader,
    spriteId: Short,
    actionInfo: Array[Short],
    override val frameData: FrameData
) extends SpriteDefinition

final case class SpriteDefinitionSingleFrame(
    override val header: SpriteDefinitionHeader,
    spriteIds: Array[Short],
    actionInfo: Array[Short],
    override val frameData: FrameData
) extends SpriteDefinition

final case class SpriteDefinitionSingleNoAction(
    override val header: SpriteDefinitionHeader,
    spriteId: Short,
    override val frameData: FrameData
) extends SpriteDefinition

final case class SpriteDefinitionHeader(
    id: Short,
    name: Option[SpriteDefinitionName],
    flags: Byte
) {
  @inline def isLoop: Boolean = (flags & 0x80) != 0x0

  @inline def getColorIndex: Int = flags & 0x3F
}

final case class SpriteDefinitionName(
    name: String,
    nameCrc: Int,
    baseNameCrc: Int
)
