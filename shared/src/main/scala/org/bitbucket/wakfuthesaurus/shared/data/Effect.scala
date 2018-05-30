package org.bitbucket.wakfuthesaurus.shared.data

sealed trait Effect {
  def id: Int
  def action: Int
  def areaShape: Byte
  def areaSize: Seq[Byte]
  def template: String
  def params: Seq[TemplateParameter]
  def originalParams: Seq[Float]
  def containerMinLevel: Short
  def containerMaxLevel: Short
  def probabilityBase: Float
  def probabilityInc: Float
  def displayInSpellDescription: Boolean
  def effectRequirement: Option[String]
}

final case class SingleEffect(
    override val id: Int,
    override val action: Int,
    override val template: String,
    override val areaShape: Byte,
    override val areaSize: Seq[Byte],
    override val params: Seq[TemplateParameter],
    override val originalParams: Seq[Float],
    override val containerMinLevel: Short,
    override val containerMaxLevel: Short,
    override val probabilityBase: Float,
    override val probabilityInc: Float,
    override val displayInSpellDescription: Boolean,
    override val effectRequirement: Option[String]
) extends Effect

final case class EffectGroup(
    override val id: Int,
    override val action: Int,
    override val template: String,
    override val areaShape: Byte,
    override val areaSize: Seq[Byte],
    override val params: Seq[TemplateParameter],
    override val originalParams: Seq[Float],
    override val containerMinLevel: Short,
    override val containerMaxLevel: Short,
    override val probabilityBase: Float,
    override val probabilityInc: Float,
    override val displayInSpellDescription: Boolean,
    override val effectRequirement: Option[String],
    children: Seq[Effect]
) extends Effect
