package org.bitbucket.wakfuthesaurus.shared.data

object CharacteristicType extends Enumeration {
  type CharacteristicType = Value

  val Hp = Value(1)
  val Ap = Value(2)
  val Mp = Value(3)
  val Wp = Value(4)
  val Lock = Value(7)
  val Dodge = Value(8)
  val CriticalChance = Value(9)
  val Range = Value(11)
  val Control = Value(12)
  val RearMastery = Value(16)
  val RearResist = Value(17)
  val HealsPerformed = Value(18)
  val ElementalMastery = Value(20)
  val FireMastery = Value(21)
  val WaterMastery = Value(22)
  val EarthMastery = Value(23)
  val AirMastery = Value(24)
  val ElementalResist = Value(27)
  val FireResist = Value(28)
  val WaterResist = Value(29)
  val EarthResist = Value(30)
  val AirResist = Value(31)
  val Prospecting = Value(33)
  val Initiative = Value(35)
  val Wisdom = Value(36)
  val DamageInflicted = Value(48)
  val DamageReduced = Value(49)
  val CriticalMastery = Value(52)
  val Block = Value(87)
  val MeleeMastery = Value(103)
  val DistanceMastery = Value(104)
  val SingleTargetMastery = Value(105)
  val AreaMastery = Value(106)
  val BerserkMastery = Value(107)

  private val valuesById: Map[Int, CharacteristicType] =
    values.map(v => v.id -> v).toMap

  def byId(id: Int): Option[CharacteristicType] = valuesById.get(id)
}
