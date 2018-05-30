package org.bitbucket.wakfuthesaurus.shared.data

import enumeratum.values.{IntEnum, IntEnumEntry}

sealed abstract class CharacterClass(
  override val value: Int,
  val entryName: String
) extends IntEnumEntry

object CharacterClass extends IntEnum[CharacterClass] {
  case object Feca extends CharacterClass(1, "feca")
  case object Osa extends CharacterClass(2, "osa")
  case object Enu extends CharacterClass(3, "enu")
  case object Sram extends CharacterClass(4, "sram")
  case object Xelor extends CharacterClass(5, "xelor")
  case object Eca extends CharacterClass(6, "eca")
  case object Eni extends CharacterClass(7, "eni")
  case object Iop extends CharacterClass(8, "iop")
  case object Cra extends CharacterClass(9, "cra")
  case object Sadi extends CharacterClass(10, "sadi")
  case object Sac extends CharacterClass(11, "sac")
  case object Panda extends CharacterClass(12, "panda")
  case object Rogue extends CharacterClass(13, "rogue")
  case object Masq extends CharacterClass(14, "masq")
  case object Ougi extends CharacterClass(15, "ouginak")
  case object Fog extends CharacterClass(16, "fog")
  case object Elio extends CharacterClass(18, "elio")
  case object Hupper extends CharacterClass(19, "hupper")

  override val values = findValues
}

