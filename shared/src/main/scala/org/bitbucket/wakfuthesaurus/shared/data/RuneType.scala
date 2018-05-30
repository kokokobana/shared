package org.bitbucket.wakfuthesaurus.shared.data

import enumeratum.{Enum, EnumEntry}

sealed abstract class RuneType(
  override val entryName: String,
  val requiredLevel: Int
) extends EnumEntry

object RuneType extends Enum[RuneType] {
  case object Damage extends RuneType("damage", 1)
  case object Resistance extends RuneType("resistance", 1)
  case object Initiative extends RuneType("initiative", 1)
  case object Lock extends RuneType("lock", 1)
  case object Dodge extends RuneType("dodge", 1)
  case object Destruction extends RuneType("destruction", 150)
  case object Precision extends RuneType("precision", 150)
  case object Distance extends RuneType("distance", 150)
  case object Fury extends RuneType("fury", 150)
  case object Melee extends RuneType("melee", 150)
  case object Altruism extends RuneType("altruism", 150)
  case object Audacity extends RuneType("audacity", 150)
  case object Sneakiness extends RuneType("sneakiness", 150)
  case object Atrophy extends RuneType("atrophy", 150)
  case object Determination extends RuneType("determination", 150)
  case object Life extends RuneType("life", 150)
  case object Influence extends RuneType("influence", 150)
  case object Robustness extends RuneType("robustness", 150)
  case object Acuity extends RuneType("acuity", 150)
  case object Velocity extends RuneType("velocity", 150)
  case object Vivacity extends RuneType("vivacity", 150)
  case object Vitality extends RuneType("vitality", 1)

  val defensive: Seq[RuneType] =
    Seq(Resistance, Life, Acuity, Velocity, Vivacity)
  val offensive: Seq[RuneType] =
    Seq(Damage, Destruction, Precision, Distance, Fury, Melee, Altruism, Audacity, Sneakiness, Influence, Robustness,
      Acuity, Velocity, Vivacity)
  val supportive: Seq[RuneType] =
    Seq(Vitality, Initiative, Lock, Dodge, Atrophy, Determination, Acuity, Velocity, Vivacity)

  override val values = findValues
}
