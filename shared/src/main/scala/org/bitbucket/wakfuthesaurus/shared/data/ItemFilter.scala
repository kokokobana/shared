package org.bitbucket.wakfuthesaurus.shared.data

import enumeratum.{Enum, EnumEntry}

sealed abstract class ItemFilter(
  val filters: Seq[Int],
  override val entryName: String
) extends EnumEntry

object ItemFilter extends Enum[ItemFilter] {
  case object Any
      extends ItemFilter(
        Seq(108, 110, 113, 115, 254, 101, 111, 114, 117, 223, 253, 112, 189,
          103, 119, 120, 132, 133, 134, 136, 138, 582, 611, 646, 647),
        "any"
      )

  case object Helmet extends ItemFilter(Seq(134), "helmet")
  case object Epaulettes extends ItemFilter(Seq(138), "epaulettes")
  case object Amulet extends ItemFilter(Seq(120), "amulet")
  case object Breastplate extends ItemFilter(Seq(136), "breastplate")
  case object Cape extends ItemFilter(Seq(132), "cape")
  case object Ring extends ItemFilter(Seq(103), "ring")
  case object Belt extends ItemFilter(Seq(133), "belt")
  case object Boots extends ItemFilter(Seq(119), "boots")
  case object OneHandWeapon
      extends ItemFilter(Seq(108, 110, 113, 115, 254), "one_hand_weapon")
  case object TwoHandWeapon
      extends ItemFilter(Seq(101, 111, 114, 117, 223, 253), "two_hand_weapon")
  case object Dagger extends ItemFilter(Seq(112), "dagger")
  case object Shield extends ItemFilter(Seq(189), "shield")
  case object Emblem extends ItemFilter(Seq(646), "emblem")
  case object Pet extends ItemFilter(Seq(582), "pet")
  case object Mount extends ItemFilter(Seq(611), "mount")
  case object Costume extends ItemFilter(Seq(647), "costume")

  override val values = findValues
}
