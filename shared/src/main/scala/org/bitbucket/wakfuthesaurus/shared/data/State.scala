package org.bitbucket.wakfuthesaurus.shared.data

final case class State(
  id: Int,
  name: Option[String],
  description: Option[String],
  gfxId: String,
  maxLevel: Int,
  requirement: Option[String],
  effects: Seq[Effect]
)
