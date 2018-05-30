package org.bitbucket.wakfuthesaurus.shared.anm

sealed trait FrameData {
  def length: Int
}

final case class ByteFrameData(data: Array[Byte]) extends FrameData {
  @inline override def length: Int = data.length
}

final case class ShortFrameData(data: Array[Short]) extends FrameData {
  @inline override def length: Int = data.length
}

final case class IntFrameData(data: Array[Int]) extends FrameData {
  @inline override def length: Int = data.length
}
