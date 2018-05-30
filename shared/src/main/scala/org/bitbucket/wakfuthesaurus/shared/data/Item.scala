package org.bitbucket.wakfuthesaurus.shared.data

final case class Item(
  id: Int,
  name: Option[String],
  typeId: Short,
  typeName: Option[String],
  rarity: Byte,
  set: Option[String],
  gfxId: Int,
  femaleGfxId: Int,
  level: Short,
  hmiActions: Seq[ApplyHmiAction],
  useInfo: ItemUseInfo,
  useEffects: Seq[Effect],
  equipEffects: Seq[Effect],
  isBeta: Boolean
)

final case class ItemUseInfo(
  conditions: Seq[String],
  apCost: Byte,
  mpCost: Byte,
  wpCost: Byte,
  minRange: Byte,
  maxRange: Byte,
  requireLos: Boolean,
  requireLine: Boolean
)
