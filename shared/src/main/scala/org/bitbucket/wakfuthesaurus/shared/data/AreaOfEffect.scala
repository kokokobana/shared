package org.bitbucket.wakfuthesaurus.shared.data

import enumeratum.values.{IntEnum, IntEnumEntry}

sealed abstract class AreaOfEffect(override val value: Int) extends IntEnumEntry

object AreaOfEffect extends IntEnum[AreaOfEffect] {
  case object Point extends AreaOfEffect(1)
  case object Circle extends AreaOfEffect(2)
  case object Cross extends AreaOfEffect(3)
  case object T extends AreaOfEffect(4)
  case object Ring extends AreaOfEffect(5)
  case object Rectangle extends AreaOfEffect(6)
  case object RectRing extends AreaOfEffect(7)
  case object FreePointsForm extends AreaOfEffect(8)
  case object TI extends AreaOfEffect(9)
  case object DirectedRectangle extends AreaOfEffect(10)

  override val values = findValues
}
