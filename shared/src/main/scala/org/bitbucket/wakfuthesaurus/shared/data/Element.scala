package org.bitbucket.wakfuthesaurus.shared.data

import enumeratum.values.{IntEnum, IntEnumEntry}

sealed abstract class Element(
  override val value: Int,
  val entryName: String
) extends IntEnumEntry

object Element extends IntEnum[Element] {
  case object Fire extends Element(1, "fire")
  case object Water extends Element(2, "water")
  case object Earth extends Element(3, "earth")
  case object Air extends Element(4, "air")
  case object Stasis extends Element(5, "stasis")
  case object Light extends Element(6, "light")

  override val values = findValues
}
