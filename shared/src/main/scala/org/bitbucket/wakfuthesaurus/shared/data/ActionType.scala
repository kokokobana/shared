package org.bitbucket.wakfuthesaurus.shared.data

object ActionType extends Enumeration {
  type ActionType = Value

  val HpLoss = Value(1)
  val HpFireLoss = Value(2)
  val HpEarthLoss = Value(3)
  val HpWaterLoss = Value(4)
  val HpAirLoss = Value(5)
  val HpLossWithKamasWater = Value(6)
  val HpLeech = Value(11)
  val HpLeechFire = Value(12)
  val HpLeechEarth = Value(13)
  val HpLeechWater = Value(14)
  val HpLeechAir = Value(15)
  val SetHp = Value(16)
  val HpGainWithFeedback = Value(17)
  val HpBoost = Value(20)
  val HpDeboost = Value(21)
  val HpLossAccumulation = Value(23)
  val CopyCharacMax = Value(24)
  val HpGain = Value(25)
  val HealGain = Value(26)
  val HealLoss = Value(27)
  val Death = Value(28)
  val HpGainPercentOfValue = Value(29)
  val ActionCost = Value(30)
  val ApBoost = Value(31)
  val ApDeboost = Value(32)
  val ApGain = Value(33)
  val ApLeech = Value(35)
  val ApGift = Value(36)
  val ApLoss = Value(37)
  val ResApGain = Value(38)
  val CharacGain = Value(39)
  val CharacLoss = Value(40)
  val MpBoost = Value(41)
  val MpDeboost = Value(42)
  val MpGain = Value(43)
  val MpLoss = Value(44)
  val MpLeech = Value(45)
  val ResMpGain = Value(46)
  val SpellBoostLevel = Value(47)
  val HpLossWithRebound = Value(50)
  val HpEarthLossWithRebound = Value(51)
  val HpFireLossWithRebound = Value(52)
  val HpWaterLossWithRebound = Value(53)
  val HpAirLossWithRebound = Value(54)
  val HpExchange = Value(59)
  val HpGainWithReboundWater = Value(60)
  val CharacStealWithLoss = Value(61)
  val ApLeechInPercent = Value(62)
  val WpLeechInPercent = Value(63)
  val DmgLeechInPercent = Value(64)
  val ResLeechInPercent = Value(65)
  val MpLeechInPercent = Value(66)
  val HpGainWithReboundAir = Value(67)
  val HealResistGain = Value(70)
  val RearResistGain = Value(71)
  val HealResistLoss = Value(72)
  val WpLeech = Value(73)
  val InitLeech = Value(74)
  val GeneralResistGain = Value(80)
  val FireResistGain = Value(82)
  val WaterResistGain = Value(83)
  val EarthResistGain = Value(84)
  val AirResistGain = Value(85)
  val GeneralResistLoss = Value(90)
  val EarthResistLoss = Value(92)
  val FireResistLoss = Value(93)
  val WaterResistLoss = Value(94)
  val AirResistLoss = Value(95)
  val GeneralMasteryGain = Value(120)
  val FireMasteryGain = Value(122)
  val EarthMasteryGain = Value(123)
  val WaterMasteryGain = Value(124)
  val AirMasteryGain = Value(125)
  val DamageInflictedGain = Value(126)
  val DamageTakenLoss = Value(127)
  val DamageTakenGain = Value(128)
  val DamageInflictedLoss = Value(129)
  val GeneralMasteryLoss = Value(130)
  val FireMasteryLoss = Value(132)
  val EarthMasteryLoss = Value(133)
  val WaterMasteryLoss = Value(134)
  val AirMasteryLoss = Value(135)
  val Punishment = Value(136)
  val DamagesReboundInPercent = Value(140)
  val DamagesAbsorbInPercent = Value(141)
  val LifeStolenBonusGain = Value(148)
  val CriticalMasteryGain = Value(149)
  val CriticalHitGain = Value(150)
  val CriticalFailureGain = Value(151)
  val AgilityGain = Value(152)
  val AgilityLoss = Value(153)
  val StrengthGain = Value(154)
  val StrengthLoss = Value(155)
  val IntelligenceGain = Value(156)
  val IntelligenceLoss = Value(157)
  val LuckGain = Value(158)
  val LuckLoss = Value(159)
  val RangeGain = Value(160)
  val RangeLoss = Value(161)
  val ProspectingGain = Value(162)
  val ProspectingLoss = Value(163)
  val WisdomGain = Value(166)
  val WisdomLoss = Value(167)
  val CriticalHitLoss = Value(168)
  val CriticalFailureLoss = Value(169)
  val InitiativeGain = Value(171)
  val InitiativeLoss = Value(172)
  val LockGain = Value(173)
  val LockLoss = Value(174)
  val DodgeGain = Value(175)
  val DodgeLoss = Value(176)
  val RearMasteryGain = Value(180)
  val RearMasteryLoss = Value(181)
  val MechanicsMastery = Value(182)
  val MechanicsGain = Value(183)
  val ControlGain = Value(184)
  val WpBoost = Value(191)
  val WpDeboost = Value(192)
  val WpGain = Value(193)
  val WpLoss = Value(194)
  val WpSteal = Value(195)
  val Raise = Value(196)
  val VitalityGain = Value(197)
  val VitalityLoss = Value(198)
  val SkipTurn = Value(200)
  val ReduceRangeToCac = Value(201)
  val Rooted = Value(202)
  val ImmuneToMpLoss = Value(203)
  val Invisible = Value(204)
  val InvisibleSuperior = Value(205)
  val FightForbidden = Value(206)
  val ChangeController = Value(207)
  val Coward = Value(208)
  val Haste = Value(209)
  val Stabilized = Value(210)
  val CantBeAttacked = Value(211)
  val CantTackle = Value(212)
  val StateResistance = Value(213)
  val NoFightXp = Value(214)
  val SetMaxApCos = Value(215)
  val SetEffectAreaGrip = Value(216)
  val RevealInvisible = Value(217)
  val Undead = Value(218)
  val Untargettable = Value(219)
  val IaDoubleFocus = Value(220)
  val Stasis1 = Value(221)
  val Stasis2 = Value(222)
  val Stasis3 = Value(223)
  val IaMinimizeFocus = Value(224)
  val RaiseOutOfCombat = Value(225)
  val Groggy1 = Value(226)
  val Groggy2 = Value(227)
  val Groggy3 = Value(228)
  val Crippled1 = Value(229)
  val Crippled2 = Value(230)
  val Crippled3 = Value(231)
  val Lame = Value(232)
  val KitSkillGain = Value(234)
  val ApRemovalChanceGain = Value(235)
  val MpRemovalChanceGain = Value(236)
  val ExtraTurn = Value(237)
  val NoDeath = Value(238)
  val StateApplicationBonus = Value(239)
  val DontBlockLos = Value(240)
  val EscapeTackle = Value(241)
  val CantTeleport = Value(242)
  val HpBoostInPercentFunctionAlliesCount = Value(249)
  val HpBoostInPercent = Value(250)
  val HpGainAir = Value(251)
  val HpGainEarth = Value(253)
  val HpGainWater = Value(258)
  val HpGainFire = Value(259)
  val WisdomBoost = Value(260)
  val HpGainAirForCasterBasedOnTarget = Value(261)
  val HpGainEarthForCasterBasedOnTarget = Value(262)
  val HpGainWaterForCasterBasedOnTarget = Value(263)
  val HpGainFireForCasterBasedOnTarget = Value(264)
  val HpGainPhysicalForCasterBasedOnTarget = Value(265)
  val InitGainPercentOfValue = Value(270)
  val InitLossPercentOfValue = Value(271)
  val MpSetToMax = Value(272)
  val Push = Value(300)
  val Pull = Value(301)
  val TeleportCaster = Value(302)
  val AttractSight = Value(303)
  val StateApply = Value(304)
  val GetCloser = Value(305)
  val PullOnCasterBack = Value(306)
  val Summon = Value(307)
  val SetTrap = Value(308)
  val SpellRebound = Value(309)
  val RunningState = Value(310)
  val SetCadran = Value(311)
  val SetHour = Value(312)
  val SetBeacon = Value(313)
  val SetAura = Value(314)
  val SetGlyph = Value(315)
  val UnsetAuras = Value(316)
  val SetBomb = Value(317)
  val SeduceMonster = Value(320)
  val StateForceUnapply = Value(321)
  val SummonSramDouble = Value(322)
  val BringBack = Value(323)
  val SummonFromSymbiot = Value(324)
  val SetAi = Value(325)
  val WeaponAttack = Value(326)
  val AiGiveOrder = Value(327)
  val AiGiveOrderCell = Value(328)
  val RunningEffectGroup = Value(330)
  val Repell = Value(331)
  val Unsummon = Value(332)
  val Throw = Value(333)
  val Carry = Value(334)
  val UpdateMaxSeducableCreatures = Value(337)
  val SetAuraOnTarget = Value(338)
  val SetEffectArea = Value(339)
  val TeleportTarget = Value(340)
  val RandomRunningEffectGroup = Value(341)
  val MakeFlee = Value(342)
  val ApplyStateFunctionPaPmPw = Value(343)
  val SpellBreak = Value(344)
  val RunningEffectGroupRandomTargets = Value(345)
  val ApplyDeathtag = Value(346)
  val SummonImage = Value(347)
  val SetAreaWithLevelFunctionSpell = Value(348)
  val EffectRandomInArea = Value(349)
  val ApplyStateWithoutNotification = Value(350)
  val StateDecurseWithoutNotification = Value(351)
  val ApplyStateFunctionActionCost = Value(352)
  val ApplyStateForFecaArmor = Value(353)
  val RemoveFecaArmor = Value(354)
  val SetFecaGlyph = Value(355)
  val XelorsDialChargeGain = Value(356)
  val XelorsDialChargeLoss = Value(357)
  val SetAiWithSpellsForIaServer = Value(358)
  val NullEffect = Value(400)
  val SplitTriggerEffect = Value(401)
  val NullEffectOnCell = Value(402)
  val NullEffectNotifiedToAi = Value(403)
  val HpLossInPercentMax = Value(411)
  val HpFireLossInPercentMax = Value(412)
  val HpEarthLossInPercentMax = Value(413)
  val HpWaterLossInPercentMax = Value(414)
  val HpAirLossInPercentMax = Value(415)
  val HpLossInPercentCurrent = Value(416)
  val HpFireLossInPercentCurrent = Value(417)
  val HpEarthLossInPercentCurrent = Value(418)
  val HpWaterLossInPercentCurrent = Value(419)
  val HpAirLossInPercentCurrent = Value(420)
  val Decurse = Value(421)
  val ExchangePosition = Value(422)
  val SpellAttack = Value(426)
  val UpdateValue = Value(430)
  val KamaSteal = Value(431)
  val PickUpItem = Value(432)
  val BoostSkillWithSpell = Value(433)
  val KamaShield = Value(434)
  val UpdateTargetWithCarrier = Value(435)
  val VirtualArmor = Value(436)
  val RevealInvisibility = Value(438)
  val PoisonAp = Value(440)
  val PoisonMp = Value(441)
  val PoisonWp = Value(442)
  val UpdateCasterWithTarget = Value(443)
  val Confused = Value(444)
  val ImmuneToEffects = Value(445)
  val RemoveFightProperty = Value(446)
  val ApplyFightProperty = Value(447)
  val PoisonTrigerringValue = Value(448)
  val ApplyWorldProperty = Value(449)
  val PlayEmote = Value(550)
  val CharacSetDmgAir = Value(560)
  val CharacSetDmgEarth = Value(561)
  val CharacSetDmgWater = Value(562)
  val CharacSetDmgFire = Value(563)
  val HealBoostPercentFunctionDmgBonus = Value(564)
  val HpBoostFunctionDmgBonus = Value(565)
  val CharacSetDmgInPercent = Value(566)
  val SetOutFightHpRegen = Value(567)
  val CharacSetResAir = Value(568)
  val CharacSetResEarth = Value(569)
  val CharacSetResWater = Value(570)
  val CharacSetResFire = Value(571)
  val CharacSetResInPercent = Value(572)
  val CharacSetHealInPercent = Value(573)
  val CharacSetHp = Value(574)
  val CharacSetApDbuffPower = Value(575)
  val HpLossInPercentMaxCaster = Value(620)
  val HpFireLossInPercentMaxCaster = Value(621)
  val HpEarthLossInPercentMaxCaster = Value(622)
  val HpWaterLossInPercentMaxCaster = Value(623)
  val HpAirLossInPercentMaxCaster = Value(624)
  val HpLossInPercentCurrentCaster = Value(625)
  val HpFireLossInPercentCurrentCaster = Value(626)
  val HpEarthLossInPercentCurrentCaster = Value(627)
  val HpWaterLossInPercentCurrentCaster = Value(628)
  val HpAirLossInPercentCurrentCaster = Value(629)
  val HpLossInPercentCurrentCasterLifeLost = Value(630)
  val HpFireLossInPercentCurrentCasterLifeLost = Value(631)
  val HpEarthLossInPercentCurrentCasterLifeLost = Value(632)
  val HpWaterLossInPercentCurrentCasterLifeLost = Value(633)
  val HpAirLossInPercentCurrentCasterLifeLost = Value(634)
  val RandomHpAirLoss = Value(635)
  val RandomHpEarthLoss = Value(636)
  val RandomHpFireLoss = Value(637)
  val RandomHpWaterLoss = Value(638)
  val HpLossFunctionPaPm = Value(639)
  val AddSpellToInventory = Value(640)
  val InitLossFunctionPaPm = Value(641)
  val HpLossInPercentCurrentTargetLifeLost = Value(642)
  val HpFireLossInPercentCurrentTargetLifeLost = Value(643)
  val HpEarthLossInPercentCurrentTargetLifeLost = Value(644)
  val HpWaterLossInPercentCurrentTargetLifeLost = Value(645)
  val HpAirLossInPercentCurrentTargetLifeLost = Value(646)
  val HpLossFunctionPaPmWithoutConsumeEarth = Value(647)
  val HpLossFunctionPaPmWithoutConsumeFire = Value(648)
  val ResourcefulnessGain = Value(700)
  val CraftQuicknessGain = Value(702)
  val QuickLearnerHarvestGain = Value(705)
  val QuickLearnerCraftGain = Value(706)
  val GreenThumbsGain = Value(707)
  val EcosystemSkillModification = Value(708)
  val CraftSkillModification = Value(709)
  val ResourcefulnessLoss = Value(710)
  val GetTitle = Value(800)
  val HpLossAndPuppetHeal = Value(801)
  val LinkCasterAndTarget = Value(802)
  val ChangeSpellTargetCell = Value(803)
  val SetChangeSpellTargetCellArea = Value(804)
  val EnutrofDepositPlacement = Value(805)
  val RemoveOwnDeposit = Value(807)
  val ApAsMp = Value(808)
  val FakeKo = Value(809)
  val HpLossNormalDistribEarth = Value(810)
  val CharacGainBasedOnOtherCharacValue = Value(812)
  val SetLootEffectArea = Value(813)
  val DropFromLootArea = Value(814)
  val HpLossFromLootArea = Value(815)
  val CollectForController = Value(816)
  val ReplaceAreaByAnother = Value(817)
  val HpLossFunctionLoot = Value(818)
  val ChrageBuff = Value(819)
  val HpLossAfterMovement = Value(825)
  val DropForEnutrofBlessing = Value(828)
  val InstantKo = Value(830)
  val BlitzkriekEffect = Value(831)
  val ElementSpellGain = Value(832)
  val DoubleOrQuits = Value(833)
  val BoostVoodoolDmg = Value(834)
  val VoodoolSplitEffect = Value(835)
  val VoodoolBoostEffect = Value(836)
  val HpGainRandomPercentOfValue = Value(837)
  val SummoningMastery = Value(838)
  val SummonDoubleForBellaphone = Value(839)
  val BombCooldownDecrease = Value(840)
  val BombCooldownBuff = Value(841)
  val SetBarrel = Value(842)
  val RemoveAreaUsingTarget = Value(843)
  val RunningEffectGroupLevelFunctionState = Value(844)
  val StateGenericApplicationBonus = Value(845)
  val StateResistanceBonus = Value(846)
  val HpLossThenHpLossFunctionPreviousValueEarth = Value(847)
  val ArmorPlateBonusGain = Value(849)
  val FecaGlyphChargeBonusGain = Value(850)
  val HpLossFunctionCharac = Value(851)
  val InvertDmgAndRes = Value(852)
  val HpLossFunctionTriggeringValue = Value(853)
  val ApplyCantBePushOrPulled = Value(854)
  val RunningEffectGroupWithAtLeastNullEffect = Value(855)
  val PmTransferToTargets = Value(856)
  val TackleTransferToTargets = Value(857)
  val DodgeTransferToTargets = Value(858)
  val BringBackToOwnerSymbiot = Value(859)
  val ChangeLevel = Value(860)
  val OsaInitGain = Value(861)
  val OsaCcGain = Value(862)
  val OsaDodgeGain = Value(863)
  val OsaTackleGain = Value(864)
  val GroupSecondValueFunctionFirst = Value(865)
  val PerceptionGain = Value(866)
  val PerceptionLoss = Value(867)
  val FinalDmgGainFunctionStateLevel = Value(868)
  val OsaDmgGain = Value(869)
  val OsaApGain = Value(870)
  val OsaMpGain = Value(871)
  val WillpowerGain = Value(872)
  val WillpowerLoss = Value(873)
  val OsaRangeGain = Value(874)
  val BlockGain = Value(875)
  val BlockLoss = Value(876)
  val HpMinModification = Value(877)
  val MoveAwayFromCell = Value(878)
  val VirtualArmorBonusGain = Value(879)
  val AreaHpLoss = Value(880)
  val EffectValueFunctionFecaArmor = Value(881)
  val EffectValueFunctionGlyphCharge = Value(882)
  val ResApLoss = Value(884)
  val ResMpLoss = Value(885)
  val RunningEffectGroupProbaFunctionPaPmPw = Value(886)
  val EffectProbaFunctionGlyphCharge = Value(887)
  val EffectProbaFunctionArmorPlate = Value(892)
  val ModifySubEffectByChrage = Value(894)
  val ModifySubEffectByTargetPlate = Value(895)
  val RandomInAreaByAreaHp = Value(896)
  val ApplyStatePercentFunctionAreaHp = Value(897)
  val DmgWaterModifiedByArmorPlate = Value(900)
  val DmgAirModifiedByArmorPlate = Value(901)
  val DmgEarthModifiedByArmorPlate = Value(902)
  val DmgFireModifiedByArmorPlate = Value(903)
  val RunningEffectGroupProbaFunctionStateLevel = Value(904)
  val ModifySubEffectByArmorPlate = Value(905)
  val RegExecutionCountFunctionAreaHp = Value(906)
  val AreaHpBuff = Value(907)
  val ModifyDmgInPercentFuntionProspection = Value(908)
  val ReplaceAreaByAnotherUsingTarget = Value(909)
  val RunningEffectGroupLevelFunctionTriggeringSpellCost = Value(910)
  val RemoveAreaUsingTargetCell = Value(911)
  val RunningEffectGroupLevelFunctionTriggeringActionCost = Value(912)
  val RunningEffectGroupLevelFunctionCharacteristic = Value(913)
  val BombCooldownLossFunctionPaPm = Value(914)
  val ExecuteTriggerInEffectZone = Value(915)
  val ModifyDmgInPercentFunctionInitiative = Value(916)
  val HpStasisLoss = Value(917)
  val DmgStasisGainPercent = Value(918)
  val RollbackTriggeringSpellApCost = Value(919)
  val RollbackTriggeringSpellMpCost = Value(920)
  val RollbackTriggeringSpellWpCost = Value(921)
  val HpLossPercentOfValue = Value(922)
  val ExecuteActionCost = Value(923)
  val CharacSetAreaHp = Value(924)
  val AreaHpGain = Value(925)
  val InitBoost = Value(926)
  val ResStasisLossPercent = Value(927)
  val CharacBuffBasedOnOtherCharacValue = Value(928)
  val CharacSetAp = Value(929)
  val CharacSetInit = Value(930)
  val ReplaceTargetByOwner = Value(931)
  val DecurseLinkedToCaster = Value(932)
  val ChangePlayerSpellsByMonsterOnes = Value(933)
  val ExcludeFromFight = Value(934)
  val RemoveAllAreasWithID = Value(935)
  val SpawnMonster = Value(936)
  val RemoveFromFightMap = Value(937)
  val RegExecutionCountFunctionTriggeringActionCost = Value(938)
  val HpLossStasisExponentialGrowth = Value(939)
  val HpLossFireExponentialGrowth = Value(940)
  val HpLossEarthExponentialGrowth = Value(941)
  val HpLossAirExponentialGrowth = Value(942)
  val HpLossWaterExponentialGrowth = Value(943)
  val ResWaterModifiedByArmorPlate = Value(944)
  val ResAirModifiedByArmorPlate = Value(945)
  val ResEarthModifiedByArmorPlate = Value(946)
  val ResFireModifiedByArmorPlate = Value(947)
  val SetChrageToDmgRatio = Value(948)
  val RegExecutionCountFixed = Value(949)
  val SetAp = Value(950)
  val SetMp = Value(951)
  val SetWp = Value(952)
  val DebuffFumbleRate = Value(953)
  val SetMicrobotRailsMaxDistance = Value(954)
  val VirtualHpBoostInPercentFunctionAlliesCount = Value(955)
  val VirtualHpBoostInPercent = Value(956)
  val SetVirtualHpFromHp = Value(957)
  val HpLossInPercentMaxWithVirtual = Value(958)
  val HpLossInPercentMaxCasterWithVirtual = Value(959)
  val HpLossFireFunctionFighterLevel = Value(960)
  val HpLossEarthFunctionFighterLevel = Value(961)
  val HpLossWaterFunctionFighterLevel = Value(962)
  val HpLossAirFunctionFighterLevel = Value(963)
  val HpLossStasisFunctionFighterLevel = Value(964)
  val AddSpellToTemporarySpellInventory = Value(965)
  val PlantationBonusPlant = Value(966)
  val PlantationBonusTree = Value(967)
  val PlantationBonusCultivation = Value(968)
  val PlantationBonusMob = Value(969)
  val CraftCraftXpBonus = Value(970)
  val CollectBonusPlant = Value(971)
  val CollectBonusTree = Value(972)
  val CollectBonusCultivation = Value(973)
  val CollectBonusMob = Value(974)
  val CollectBonusMineral = Value(975)
  val CollectBonusFish = Value(976)
  val CraftQuicknessBonus = Value(977)
  val PlantationBonusTreasure = Value(978)
  val AllElementalSpellGain = Value(979)
  val PassiveSpellGain = Value(980)
  val ActiveSupportSpellGain = Value(981)
  val RemovePassiveSpells = Value(982)
  val ApSetToMax = Value(983)
  val SetVitualHp = Value(984)
  val VirtualHpSetToMax = Value(985)
  val UpdateHpMaxPercentModifier = Value(986)
  val AddBonusLoot = Value(987)
  val CriticalResGain = Value(988)
  val UpdateVirtualHpMaxPercentModifier = Value(989)
  val HpGainForUndead = Value(990)
  val KoTimeBeforeDeathBuff = Value(991)
  val TeleportCasterBehindTarget = Value(992)
  val ChangeSpellTargetCellByCasterCell = Value(993)
  val SummonDoubleForIceStatue = Value(994)
  val RunningEffectGroupLevelFunctionSpell = Value(995)
  val OsaInvocationKnowledgeGain = Value(996)
  val VirtualArmorFlat = Value(997)
  val DmgWaterPercentGainFctCasterDmgEarthPercent = Value(998)
  val RunningEffectGroupLevelFunctionCharacterLevel = Value(999)
  val ChangeTrigerringEffectTarget = Value(1000)
  val CopyCharacAtApplicationValue = Value(1001)
  val SummonZobalDouble = Value(1002)
  val KoTimeBeforeDeathMinModification = Value(1003)
  val ModifyDmgInPercentFunctionDodge = Value(1004)
  val ApplyStateCapedByAnotherState = Value(1005)
  val RegSubEffectValueFunctionCasterAp = Value(1006)
  val RegSubEffectValueFunctionCasterMp = Value(1007)
  val SetEffectAreaForOriginalController = Value(1008)
  val ModifyHealBonusInPercentFunctionDodge = Value(1009)
  val ArmorGain = Value(1010)
  val ArmorLoss = Value(1011)
  val ArmorElementalGain = Value(1012)
  val ReduceZoneEffect = Value(1013)
  val CopyCharacInRealTime = Value(1014)
  val BestElementHpLoss = Value(1015)
  val BestElementHpGain = Value(1016)
  val BestElementHpGainFunctionPaPm = Value(1017)
  val SpecificForArmorDamageRebound = Value(1018)
  val PvpBuffGain = Value(1019)
  val RunningEffectGroupLevelFunctionTriggeringValue = Value(1020)
  val RemoveBlockingAreaUsingTarget = Value(1021)
  val CraftEcosystemXpBonus = Value(1022)
  val CraftXpBonus = Value(1023)
  val StateDecurseForHyperaction = Value(1024)
  val HpGainFunctionCasterEarth = Value(1025)
  val HpGainFunctionCasterAir = Value(1026)
  val HpGainFunctionCasterWater = Value(1027)
  val HpGainFunctionCasterFire = Value(1028)
  val HpGainFunctionCasterPhysical = Value(1029)
  val SetTeamID = Value(1030)
  val RemoveEquipmentEffects = Value(1031)
  val RemoveSetEffects = Value(1032)
  val SetSteamerBlock = Value(1033)
  val SteamerBlockPassiveResist = Value(1034)
  val SteamerBlockDamageRedirection = Value(1035)
  val WeakestResistGain = Value(1036)
  val SteamerDamageRedirection = Value(1037)
  val AddCharacValueToAnotherInRealTime = Value(1038)
  val CharacSetControl = Value(1039)
  val SetResistanceTarget = Value(1040)
  val RegExecutionCountFunctionAlliesCount = Value(1041)
  val BarrierElementalGain = Value(1042)
  val UpdateTackleHpMaxPercentModifier = Value(1043)
  val ChangeAreaPosition = Value(1044)
  val ModifyResInPercentFunctionTackle = Value(1045)
  val AddToAiPriorityTargets = Value(1046)
  val RunningEffectGroupLevelFunctionTotalHp = Value(1047)
  val DivideHpLossUnlessThreshold = Value(1048)
  val SwitchCharacValues = Value(1049)
  val AoeMasteryGain = Value(1050)
  val SingleTargetMasteryGain = Value(1051)
  val MeleeMasteryGain = Value(1052)
  val DistanceMasteryGain = Value(1053)
  val NonCritMasteryGain = Value(1054)
  val BerserkMasteryGain = Value(1055)
  val CritMasteryLoss = Value(1056)
  val SingleTargetMasteryLoss = Value(1057)
  val AoeMasteryLoss = Value(1058)
  val MeleeMasteryLoss = Value(1059)
  val DistanceMasteryLoss = Value(1060)
  val BerserkMasteryLoss = Value(1061)
  val CriticalResistLoss = Value(1062)
  val RearResistLoss = Value(1063)
  val ControlLoss = Value(1064)
  val SpellWithPropertyApCostReduction = Value(1065)
  val SpellWithPropertyRangeGain = Value(1066)
  val TackleActionCost = Value(1067)
  val VariableElementsMasteryGain = Value(1068)
  val VariableElementsResGain = Value(1069)
  val AddCharacValueToAnotherInRealTimeWithThreshold = Value(1070)
  val VirtualHpBoost = Value(1071)
  val ReversiCheckForReversable = Value(1072)
  val NonCriticalMasteryLoss = Value(1075)
  val HpLightLoss = Value(1083)
  val HpGainLight = Value(1084)
  val HealsPerformedLoss = Value(1094)
  val HealsPerformedGain = Value(1095)

  private val valuesById: Map[Int, ActionType] =
    values.map(v => v.id -> v).toMap

  def byId(id: Int): Option[ActionType] = valuesById.get(id)
}