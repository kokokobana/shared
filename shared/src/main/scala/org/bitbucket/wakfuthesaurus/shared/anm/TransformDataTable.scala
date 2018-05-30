package org.bitbucket.wakfuthesaurus.shared.anm

final case class TransformDataTable(colors: Array[Float],
                                    rotations: Array[Float],
                                    translations: Array[Float],
                                    actions: Array[AnmAction]) {
  @inline def makeLight: TransformDataTableLight =
    TransformDataTableLight(colors, rotations, translations)
}

final case class TransformDataTableLight(colors: Array[Float],
                                         rotations: Array[Float],
                                         translations: Array[Float])
