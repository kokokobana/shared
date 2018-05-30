package org.bitbucket.wakfuthesaurus.shared.data
import enumeratum.values.{IntEnum, IntEnumEntry}

sealed trait TemplateParameter

final case class NumberParameter(
    base: Float,
    inc: Float,
    absoluteValue: Boolean = false,
    percent: Boolean = false,
    decimals: Int = 0
) extends TemplateParameter

final case class EntityParameter(
    entityType: Byte,
    text: Option[String],
    refId: Int
) extends TemplateParameter

final case class StateLink(name: String, refId: Int, maxLevel: Int)
    extends TemplateParameter

final case class InsertStateDescription(state: State, withPlots: Boolean)
    extends TemplateParameter

final case class ChildParameter(
    idx: Byte,
    parameter: Option[TemplateParameter]
) extends TemplateParameter

final case class ConditionParameter(
    const: Int,
    arg: Option[TemplateParameter],
    op: String
) extends TemplateParameter

final case class ListChildren(withPlots: Boolean) extends TemplateParameter

case object InsertDescription extends TemplateParameter

sealed abstract class EntityType(val value: Int) extends IntEnumEntry

object EntityType extends IntEnum[EntityType] {
  case object Monster extends EntityType(1)
  case object Area extends EntityType(2)
  case object Item extends EntityType(3)
  case object Spell extends EntityType(4)
  case object Aoe extends EntityType(5)

  override val values = findValues
}
