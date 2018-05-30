package org.bitbucket.wakfuthesaurus.shared.anm

sealed trait AnmAction

final case class AnmActionAddParticle(particleId: Int,
                                      offsetX: Option[Short],
                                      offsetY: Option[Short],
                                      offsetZ: Option[Short])
    extends AnmAction

case object AnmActionDelete extends AnmAction

case object AnmActionEnd extends AnmAction

final case class AnmActionGoToAnimation(animationName: String,
                                        percent: Option[Int])
    extends AnmAction

final case class AnmActionGoToIfPreviousAnimation(
    previousAnimations: Array[String],
    nextAnimations: Array[String],
    defaultAnimation: Option[String])
    extends AnmAction

final case class AnmActionGoToRandomAnimation(animationNames: Array[String],
                                              percents: Array[Byte])
    extends AnmAction

case object AnmActionGoToStaticAnimation extends AnmAction

case object AnmActionHit extends AnmAction

final case class AnmActionRunScript(scriptId: Long) extends AnmAction

final case class AnmActionSetRadius(radius: Byte) extends AnmAction
