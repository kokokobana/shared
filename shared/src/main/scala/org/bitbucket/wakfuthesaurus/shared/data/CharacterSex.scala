package org.bitbucket.wakfuthesaurus.shared.data

import enumeratum.values.{IntEnum, IntEnumEntry}

sealed abstract class CharacterSex(
  override val value: Int,
  val entryName: String
) extends IntEnumEntry

object CharacterSex extends IntEnum[CharacterSex] {
  case object Male extends CharacterSex(0, "male")
  case object Female extends CharacterSex(1, "female")

  override val values = findValues
}
