package org.bitbucket.wakfuthesaurus.shared.data

import enumeratum.values.{IntEnum, IntEnumEntry}

sealed abstract class ItemType(
  override val value: Int,
  val entryName: String
) extends IntEnumEntry

object ItemType extends IntEnum[ItemType] {
  case object Axe extends ItemType(101, "axe")
  case object Ring extends ItemType(103, "ring")
  case object Wand extends ItemType(108, "wand")
  case object OneHandSword extends ItemType(110, "one_hand_sword")
  case object Shovel extends ItemType(111, "shovel")
  case object Dagger extends ItemType(112, "dagger")
  case object OneHandStaff extends ItemType(113, "one_hand_staff")
  case object Hammer extends ItemType(114, "hammer")
  case object Hand extends ItemType(115, "hand")
  case object Bow extends ItemType(117, "bow")
  case object Boots extends ItemType(119, "boots")
  case object Amulet extends ItemType(120, "amulet")
  case object Cape extends ItemType(132, "cape")
  case object Belt extends ItemType(133, "belt")
  case object Helmet extends ItemType(134, "helmet")
  case object Breastplate extends ItemType(136, "breastplate")
  case object Epaulettes extends ItemType(138, "epaulettes")
  case object Shield extends ItemType(189, "shield")
  case object TwoHandSword extends ItemType(223, "two_hand_sword")
  case object TwoHandStaff extends ItemType(253, "two_hand_staff")
  case object Cards extends ItemType(254, "cards")
  case object Pet extends ItemType(582, "pet")
  case object Mount extends ItemType(611, "mount")
  case object Emblem extends ItemType(646, "emblem")
  case object Costume extends ItemType(647, "costume")

  override val values = findValues
}
