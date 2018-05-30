package org.bitbucket.wakfuthesaurus.shared.anm

final case class Anm(header: AnmHeader,
                     index: Option[AnmIndex],
                     singleTexture: Option[SingleTexture],
                     shapeDefinitions: Array[ShapeDefinition],
                     transformIndex: Option[TransformDataTable],
                     spriteDefinitions: Array[SpriteDefinition],
                     imports: Array[AnmImport])

final case class AnmHeader(versionNumber: Byte, frameRate: Float) {
  @inline def doesUseAtlas: Boolean = (versionNumber & 0x1) != 0x0

  @inline def doesUseLocalIndex: Boolean = (versionNumber & 0x2) != 0x0

  @inline def doesUsePerfectHitTest: Boolean = (versionNumber & 0x4) == 0x4

  @inline def doesUseTransformIndex: Boolean = (versionNumber & 0x10) == 0x10

  @inline def isOptimized: Boolean = (versionNumber & 0x8) == 0x8
}

final case class AnmImport(id: Short, name: String, crc: Int)

final case class SingleTexture(name: String, crc: Int)
