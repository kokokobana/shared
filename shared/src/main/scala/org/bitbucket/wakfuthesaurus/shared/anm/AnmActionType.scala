package org.bitbucket.wakfuthesaurus.shared.anm

import enumeratum.values.{IntEnum, IntEnumEntry}

sealed abstract class AnmActionType(val value: Int) extends IntEnumEntry

object AnmActionType extends IntEnum[AnmActionType] {

  case object GoToAnimation extends AnmActionType(1)

  case object GoToStaticAnimation extends AnmActionType(2)

  case object RunScript extends AnmActionType(3)

  case object GoToRandomAnimation extends AnmActionType(4)

  case object Hit extends AnmActionType(5)

  case object Delete extends AnmActionType(6)

  case object End extends AnmActionType(7)

  case object GoToIfPreviousAnimation extends AnmActionType(8)

  case object AddParticle extends AnmActionType(9)

  case object SetRadius extends AnmActionType(10)

  override val values = findValues
}
