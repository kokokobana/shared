package org.bitbucket.wakfuthesaurus.shared.data

import enumeratum.values.{IntEnum, IntEnumEntry}

sealed abstract class ItemRarity(
  override val value: Int,
  val entryName: String
) extends IntEnumEntry

object ItemRarity extends IntEnum[ItemRarity] {
  case object Common extends ItemRarity(1, "common")
  case object Rare extends ItemRarity(2, "rare")
  case object Mythical extends ItemRarity(3, "mythical")
  case object Legendary extends ItemRarity(4, "legendary")
  case object Relic extends ItemRarity(5, "relic")
  case object PvP extends ItemRarity(6, "pvp")
  case object Epic extends ItemRarity(7, "epic")
  case object Admin extends ItemRarity(10, "admin")

  override val values = findValues
}
