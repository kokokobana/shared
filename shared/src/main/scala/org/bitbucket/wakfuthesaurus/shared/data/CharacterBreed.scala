package org.bitbucket.wakfuthesaurus.shared.data

final case class CharacterBreed(
  id: Int,
  definitions: Seq[CharacterBreedDefinition],
  spells: Seq[Spell],
  support: Seq[Spell],
  passive: Seq[Spell]
)

final case class CharacterBreedDefinition(
  sex: Byte,
  defaultSkinIndex: Byte,
  defaultSkinFactor: Byte,
  defaultHairIndex: Byte,
  defaultHairFactor: Byte,
  defaultPupilIndex: Byte,
  skinColors: Array[Color],
  hairColors: Array[Color],
  pupilColors: Array[Color]
)

final case class Color(red: Float, green: Float, blue: Float, alpha: Float)
