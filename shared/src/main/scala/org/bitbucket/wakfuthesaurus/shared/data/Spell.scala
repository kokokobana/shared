package org.bitbucket.wakfuthesaurus.shared.data

final case class Spell(
  id: Int,
  name: Option[String],
  gfxId: Int,
  maxLevel: Short,
  maxCastPerTarget: Byte,
  maxCastPerTurn: RelValue,
  element: Byte,
  uiPosition: Byte,
  singleTarget: Boolean,
  effects: Seq[Effect],
  criticalEffects: Seq[Effect],
  requireLos: Boolean,
  requireLine: Boolean,
  requireDiagonal: Boolean,
  apCost: RelValue,
  mpCost: RelValue,
  wpCost: RelValue,
  minRange: RelValue,
  maxRange: RelValue,
  useAutomaticDescription: Boolean,
  modifiableRange: Boolean,
  upgrades: Seq[Short]
)

final case class RelValue(base: Float, inc: Float)
