package org.bitbucket.wakfuthesaurus.shared.anm

final case class AnimationDefinition(
    header: AnmHeader,
    scale: Option[Float],
    partsHiddenByItem: Array[HidingPart],
    canHidePartItems: Array[CanHidePart],
    shapeDefinitions: Array[ShapeDefinition],
    transformIndex: Option[TransformDataTableLight],
    spriteDefinitions: Array[SpriteDefinition])
