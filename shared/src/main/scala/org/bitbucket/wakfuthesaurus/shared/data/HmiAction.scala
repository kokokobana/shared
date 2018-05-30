package org.bitbucket.wakfuthesaurus.shared.data

sealed trait HmiAction

final case class SkinPartVisibilityAction(visible: Boolean, parts: Seq[String]) extends HmiAction

final case class Appearance(id: String, partsToChange: Seq[String])

final case class CostumeAction(
  weight: Int,
  particle: Option[Int],
  appearances: Seq[Appearance]
) extends HmiAction

case object HideAllEquipmentsAction extends HmiAction

final case class ApplyHmiAction(conditions: Seq[String], action: HmiAction)
