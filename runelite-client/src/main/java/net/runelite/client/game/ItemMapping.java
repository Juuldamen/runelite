/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2018, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.game;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Collections;
import static net.runelite.api.ItemID.*;

/**
 * Converts untradeable items to it's tradeable counterparts
 */
public enum ItemMapping
{
	// Barrows equipment
	ITEM_AHRIMS_HOOD(AHRIMS_HOOD, AHRIMS_HOOD_25, AHRIMS_HOOD_50, AHRIMS_HOOD_75, AHRIMS_HOOD_100),
	ITEM_AHRIMS_ROBETOP(AHRIMS_ROBETOP, AHRIMS_ROBETOP_25, AHRIMS_ROBETOP_50, AHRIMS_ROBETOP_75, AHRIMS_ROBETOP_100),
	ITEM_AHRIMS_ROBEBOTTOM(AHRIMS_ROBESKIRT, AHRIMS_ROBESKIRT_25, AHRIMS_ROBESKIRT_50, AHRIMS_ROBESKIRT_75, AHRIMS_ROBESKIRT_100),
	ITEM_AHRIMS_STAFF(AHRIMS_STAFF, AHRIMS_STAFF_25, AHRIMS_STAFF_50, AHRIMS_STAFF_75, AHRIMS_STAFF_100),
	ITEM_KARILS_COIF(KARILS_COIF, KARILS_COIF_25, KARILS_COIF_50, KARILS_COIF_75, KARILS_COIF_100),
	ITEM_KARILS_LEATHERTOP(KARILS_LEATHERTOP, KARILS_LEATHERTOP_25, KARILS_LEATHERTOP_50, KARILS_LEATHERTOP_75, KARILS_LEATHERTOP_100),
	ITEM_KARILS_LEATHERSKIRT(KARILS_LEATHERSKIRT, KARILS_LEATHERSKIRT_25, KARILS_LEATHERSKIRT_50, KARILS_LEATHERSKIRT_75, KARILS_LEATHERSKIRT_100),
	ITEM_KARILS_CROSSBOW(KARILS_CROSSBOW, KARILS_CROSSBOW_25, KARILS_CROSSBOW_50, KARILS_CROSSBOW_75, KARILS_CROSSBOW_100),
	ITEM_DHAROKS_HELM(DHAROKS_HELM, DHAROKS_HELM_25, DHAROKS_HELM_50, DHAROKS_HELM_75, DHAROKS_HELM_100),
	ITEM_DHAROKS_PLATEBODY(DHAROKS_PLATEBODY, DHAROKS_PLATEBODY_25, DHAROKS_PLATEBODY_50, DHAROKS_PLATEBODY_75, DHAROKS_PLATEBODY_100),
	ITEM_DHAROKS_PLATELEGS(DHAROKS_PLATELEGS, DHAROKS_PLATELEGS_25, DHAROKS_PLATELEGS_50, DHAROKS_PLATELEGS_75, DHAROKS_PLATELEGS_100),
	ITEM_DHARKS_GREATEAXE(DHAROKS_GREATAXE, DHAROKS_GREATAXE_25, DHAROKS_GREATAXE_50, DHAROKS_GREATAXE_75, DHAROKS_GREATAXE_100),
	ITEM_GUTHANS_HELM(GUTHANS_HELM, GUTHANS_HELM_25, GUTHANS_HELM_50, GUTHANS_HELM_75, GUTHANS_HELM_100),
	ITEM_GUTHANS_PLATEBODY(GUTHANS_PLATEBODY, GUTHANS_PLATEBODY_25, GUTHANS_PLATEBODY_50, GUTHANS_PLATEBODY_75, GUTHANS_PLATEBODY_100),
	ITEM_GUTHANS_CHAINSKIRT(GUTHANS_CHAINSKIRT, GUTHANS_CHAINSKIRT_25, GUTHANS_CHAINSKIRT_50, GUTHANS_CHAINSKIRT_75, GUTHANS_CHAINSKIRT_100),
	ITEM_GUTHANS_WARSPEAR(GUTHANS_WARSPEAR, GUTHANS_WARSPEAR_25, GUTHANS_WARSPEAR_50, GUTHANS_WARSPEAR_75, GUTHANS_WARSPEAR_100),
	ITEM_TORAGS_HELM(TORAGS_HELM, TORAGS_HELM_25, TORAGS_HELM_50, TORAGS_HELM_75, TORAGS_HELM_100),
	ITEM_TORAGS_PLATEBODY(TORAGS_PLATEBODY, TORAGS_PLATEBODY_25, TORAGS_PLATEBODY_50, TORAGS_PLATEBODY_75, TORAGS_PLATEBODY_100),
	ITEM_TORAGS_PLATELEGS(TORAGS_PLATELEGS, TORAGS_PLATELEGS_25, TORAGS_PLATELEGS_50, TORAGS_PLATELEGS_75, TORAGS_PLATELEGS_100),
	ITEM_TORAGS_HAMMERS(TORAGS_HAMMERS, TORAGS_HAMMERS_25, TORAGS_HAMMERS_50, TORAGS_HAMMERS_75, TORAGS_HAMMERS_100),
	ITEM_VERACS_HELM(VERACS_HELM, VERACS_HELM_25, VERACS_HELM_50, VERACS_HELM_75, VERACS_HELM_100),
	ITEM_VERACS_BRASSARD(VERACS_BRASSARD, VERACS_BRASSARD_25, VERACS_BRASSARD_50, VERACS_BRASSARD_75, VERACS_BRASSARD_100),
	ITEM_VERACS_PLATESKIRT(VERACS_PLATESKIRT, VERACS_PLATESKIRT_25, VERACS_PLATESKIRT_50, VERACS_PLATESKIRT_75, VERACS_PLATESKIRT_100),
	ITEM_VERACS_FLAIL(VERACS_FLAIL, VERACS_FLAIL_25, VERACS_FLAIL_50, VERACS_FLAIL_75, VERACS_FLAIL_100),

	// Dragon equipment ornament kits
	ITEM_DRAGON_SCIMITAR(DRAGON_SCIMITAR, DRAGON_SCIMITAR_OR),
	ITEM_DRAGON_SCIMITAR_ORNAMENT_KIT(DRAGON_SCIMITAR_ORNAMENT_KIT, DRAGON_SCIMITAR_OR),
	ITEM_DRAGON_DEFENDER(DRAGON_DEFENDER_ORNAMENT_KIT, DRAGON_DEFENDER_T),
	ITEM_DRAGON_PICKAXE(DRAGON_PICKAXE, DRAGON_PICKAXE_12797, DRAGON_PICKAXEOR),
	ITEM_DRAGON_PICKAXE_OR(ZALCANO_SHARD, DRAGON_PICKAXEOR),
	ITEM_DRAGON_KITESHIELD(DRAGON_KITESHIELD, DRAGON_KITESHIELD_G),
	ITEM_DRAGON_KITESHIELD_ORNAMENT_KIT(DRAGON_KITESHIELD_ORNAMENT_KIT, DRAGON_KITESHIELD_G),
	ITEM_DRAGON_FULL_HELM(DRAGON_FULL_HELM, DRAGON_FULL_HELM_G),
	ITEM_DRAGON_FULL_HELM_ORNAMENT_KIT(DRAGON_FULL_HELM_ORNAMENT_KIT, DRAGON_FULL_HELM_G),
	ITEM_DRAGON_CHAINBODY(DRAGON_CHAINBODY_3140, DRAGON_CHAINBODY_G),
	ITEM_DRAGON_CHAINBODY_ORNAMENT_KIT(DRAGON_CHAINBODY_ORNAMENT_KIT, DRAGON_CHAINBODY_G),
	ITEM_DRAGON_PLATEBODY(DRAGON_PLATEBODY, DRAGON_PLATEBODY_G),
	ITEM_DRAGON_PLATEBODY_ORNAMENT_KIT(DRAGON_PLATEBODY_ORNAMENT_KIT, DRAGON_PLATEBODY_G),
	ITEM_DRAGON_PLATESKIRT(DRAGON_PLATESKIRT, DRAGON_PLATESKIRT_G),
	ITEM_DRAGON_SKIRT_ORNAMENT_KIT(DRAGON_LEGSSKIRT_ORNAMENT_KIT, DRAGON_PLATESKIRT_G),
	ITEM_DRAGON_PLATELEGS(DRAGON_PLATELEGS, DRAGON_PLATELEGS_G),
	ITEM_DRAGON_LEGS_ORNAMENT_KIT(DRAGON_LEGSSKIRT_ORNAMENT_KIT, DRAGON_PLATELEGS_G),
	ITEM_DRAGON_SQ_SHIELD(DRAGON_SQ_SHIELD, DRAGON_SQ_SHIELD_G),
	ITEM_DRAGON_SQ_SHIELD_ORNAMENT_KIT(DRAGON_SQ_SHIELD_ORNAMENT_KIT, DRAGON_SQ_SHIELD_G),
	ITEM_DRAGON_BOOTS(DRAGON_BOOTS, DRAGON_BOOTS_G),
	ITEM_DRAGON_BOOTS_ORNAMENT_KIT(DRAGON_BOOTS_ORNAMENT_KIT, DRAGON_BOOTS_G),

	// Rune ornament kits
	ITEM_RUNE_SCIMITAR_GUTHIX(RUNE_SCIMITAR, RUNE_SCIMITAR_23330),
	ITEM_RUNE_SCIMITAR_ORNAMENT_KIT_GUTHIX(RUNE_SCIMITAR_ORNAMENT_KIT_GUTHIX, RUNE_SCIMITAR_23330),
	ITEM_RUNE_SCIMITAR_SARADOMIN(RUNE_SCIMITAR, RUNE_SCIMITAR_23332),
	ITEM_RUNE_SCIMITAR_ORNAMENT_KIT_SARADOMIN(RUNE_SCIMITAR_ORNAMENT_KIT_SARADOMIN, RUNE_SCIMITAR_23332),
	ITEM_RUNE_SCIMITAR_ZAMORAK(RUNE_SCIMITAR, RUNE_SCIMITAR_23334),
	ITEM_RUNE_SCIMITAR_ORNAMENT_KIT_ZAMORAK(RUNE_SCIMITAR_ORNAMENT_KIT_ZAMORAK, RUNE_SCIMITAR_23334),
	ITEM_RUNE_DEFENDER(RUNE_DEFENDER, RUNE_DEFENDER_T),
	ITEM_RUNE_DEFENDER_ORNAMENT_KIT(RUNE_DEFENDER_ORNAMENT_KIT, RUNE_DEFENDER_T),

	// Godsword ornament kits
	ITEM_ARMADYL_GODSWORD(ARMADYL_GODSWORD, ARMADYL_GODSWORD_OR),
	ITEM_ARMADYL_GODSWORD_ORNAMENT_KIT(ARMADYL_GODSWORD_ORNAMENT_KIT, ARMADYL_GODSWORD_OR),
	ITEM_BANDOS_GODSWORD(BANDOS_GODSWORD, BANDOS_GODSWORD_OR),
	ITEM_BANDOS_GODSWORD_ORNAMENT_KIT(BANDOS_GODSWORD_ORNAMENT_KIT, BANDOS_GODSWORD_OR),
	ITEM_ZAMORAK_GODSWORD(ZAMORAK_GODSWORD, ZAMORAK_GODSWORD_OR),
	ITEM_ZAMORAK_GODSWORD_ORNAMENT_KIT(ZAMORAK_GODSWORD_ORNAMENT_KIT, ZAMORAK_GODSWORD_OR),
	ITEM_SARADOMIN_GODSWORD(SARADOMIN_GODSWORD, SARADOMIN_GODSWORD_OR),
	ITEM_SARADOMIN_GODSWORD_ORNAMENT_KIT(SARADOMIN_GODSWORD_ORNAMENT_KIT, SARADOMIN_GODSWORD_OR),

	// Jewellery ornament kits
	ITEM_AMULET_OF_TORTURE(AMULET_OF_TORTURE, AMULET_OF_TORTURE_OR),
	ITEM_TORTURE_ORNAMENT_KIT(TORTURE_ORNAMENT_KIT, AMULET_OF_TORTURE_OR),
	ITEM_NECKLACE_OF_ANGUISH(NECKLACE_OF_ANGUISH, NECKLACE_OF_ANGUISH_OR),
	ITEM_ANGUISH_ORNAMENT_KIT(ANGUISH_ORNAMENT_KIT, NECKLACE_OF_ANGUISH_OR),
	ITEM_OCCULT_NECKLACE(OCCULT_NECKLACE, OCCULT_NECKLACE_OR),
	ITEM_OCCULT_ORNAMENT_KIT(OCCULT_ORNAMENT_KIT, OCCULT_NECKLACE_OR),
	ITEM_AMULET_OF_FURY(AMULET_OF_FURY, AMULET_OF_FURY_OR),
	ITEM_FURY_ORNAMENT_KIT(FURY_ORNAMENT_KIT, AMULET_OF_FURY_OR),
	ITEM_TORMENTED_BRACELET(TORMENTED_BRACELET, TORMENTED_BRACELET_OR),
	ITEM_TORMENTED_ORNAMENT_KIT(TORMENTED_ORNAMENT_KIT, TORMENTED_BRACELET_OR),
	ITEM_BERSERKER_NECKLACE(BERSERKER_NECKLACE, BERSERKER_NECKLACE_OR),
	ITEM_BERSERKER_NECKLACE_ORNAMENT_KIT(BERSERKER_NECKLACE_ORNAMENT_KIT, BERSERKER_NECKLACE_OR),

	// Ensouled heads
	ITEM_ENSOULED_GOBLIN_HEAD(ENSOULED_GOBLIN_HEAD_13448, ENSOULED_GOBLIN_HEAD),
	ITEM_ENSOULED_MONKEY_HEAD(ENSOULED_MONKEY_HEAD_13451, ENSOULED_MONKEY_HEAD),
	ITEM_ENSOULED_IMP_HEAD(ENSOULED_IMP_HEAD_13454, ENSOULED_IMP_HEAD),
	ITEM_ENSOULED_MINOTAUR_HEAD(ENSOULED_MINOTAUR_HEAD_13457, ENSOULED_MINOTAUR_HEAD),
	ITEM_ENSOULED_SCORPION_HEAD(ENSOULED_SCORPION_HEAD_13460, ENSOULED_SCORPION_HEAD),
	ITEM_ENSOULED_BEAR_HEAD(ENSOULED_BEAR_HEAD_13463, ENSOULED_BEAR_HEAD),
	ITEM_ENSOULED_UNICORN_HEAD(ENSOULED_UNICORN_HEAD_13466, ENSOULED_UNICORN_HEAD),
	ITEM_ENSOULED_DOG_HEAD(ENSOULED_DOG_HEAD_13469, ENSOULED_DOG_HEAD),
	ITEM_ENSOULED_CHAOS_DRUID_HEAD(ENSOULED_CHAOS_DRUID_HEAD_13472, ENSOULED_CHAOS_DRUID_HEAD),
	ITEM_ENSOULED_GIANT_HEAD(ENSOULED_GIANT_HEAD_13475, ENSOULED_GIANT_HEAD),
	ITEM_ENSOULED_OGRE_HEAD(ENSOULED_OGRE_HEAD_13478, ENSOULED_OGRE_HEAD),
	ITEM_ENSOULED_ELF_HEAD(ENSOULED_ELF_HEAD_13481, ENSOULED_ELF_HEAD),
	ITEM_ENSOULED_TROLL_HEAD(ENSOULED_TROLL_HEAD_13484, ENSOULED_TROLL_HEAD),
	ITEM_ENSOULED_HORROR_HEAD(ENSOULED_HORROR_HEAD_13487, ENSOULED_HORROR_HEAD),
	ITEM_ENSOULED_KALPHITE_HEAD(ENSOULED_KALPHITE_HEAD_13490, ENSOULED_KALPHITE_HEAD),
	ITEM_ENSOULED_DAGANNOTH_HEAD(ENSOULED_DAGANNOTH_HEAD_13493, ENSOULED_DAGANNOTH_HEAD),
	ITEM_ENSOULED_BLOODVELD_HEAD(ENSOULED_BLOODVELD_HEAD_13496, ENSOULED_BLOODVELD_HEAD),
	ITEM_ENSOULED_TZHAAR_HEAD(ENSOULED_TZHAAR_HEAD_13499, ENSOULED_TZHAAR_HEAD),
	ITEM_ENSOULED_DEMON_HEAD(ENSOULED_DEMON_HEAD_13502, ENSOULED_DEMON_HEAD),
	ITEM_ENSOULED_AVIANSIE_HEAD(ENSOULED_AVIANSIE_HEAD_13505, ENSOULED_AVIANSIE_HEAD),
	ITEM_ENSOULED_ABYSSAL_HEAD(ENSOULED_ABYSSAL_HEAD_13508, ENSOULED_ABYSSAL_HEAD),
	ITEM_ENSOULED_DRAGON_HEAD(ENSOULED_DRAGON_HEAD_13511, ENSOULED_DRAGON_HEAD),

	// Imbued rings
	ITEM_BERSERKER_RING(BERSERKER_RING, BERSERKER_RING_I),
	ITEM_SEERS_RING(SEERS_RING, SEERS_RING_I),
	ITEM_WARRIOR_RING(WARRIOR_RING, WARRIOR_RING_I),
	ITEM_ARCHERS_RING(ARCHERS_RING, ARCHERS_RING_I),
	ITEM_TREASONOUS_RING(TREASONOUS_RING, TREASONOUS_RING_I),
	ITEM_TYRANNICAL_RING(TYRANNICAL_RING, TYRANNICAL_RING_I),
	ITEM_RING_OF_THE_GODS(RING_OF_THE_GODS, RING_OF_THE_GODS_I),
	ITEM_RING_OF_SUFFERING(RING_OF_SUFFERING, RING_OF_SUFFERING_I, RING_OF_SUFFERING_R, RING_OF_SUFFERING_RI),
	ITEM_GRANITE_RING(GRANITE_RING, GRANITE_RING_I),

	// Bounty hunter
	ITEM_GRANITE_MAUL(GRANITE_MAUL, GRANITE_MAUL_12848),
	ITEM_MAGIC_SHORTBOW(MAGIC_SHORTBOW, MAGIC_SHORTBOW_I),
	ITEM_MAGIC_SHORTBOW_SCROLL(MAGIC_SHORTBOW_SCROLL, MAGIC_SHORTBOW_I),
	ITEM_SARADOMINS_BLESSED_SWORD(SARADOMINS_TEAR, SARADOMINS_BLESSED_SWORD),

	// Jewellery with charges
	ITEM_RING_OF_WEALTH(RING_OF_WEALTH, RING_OF_WEALTH_I, RING_OF_WEALTH_1, RING_OF_WEALTH_I1, RING_OF_WEALTH_2, RING_OF_WEALTH_I2, RING_OF_WEALTH_3, RING_OF_WEALTH_I3, RING_OF_WEALTH_4, RING_OF_WEALTH_I4, RING_OF_WEALTH_I5),
	ITEM_RING_OF_WEALTH_SCROLL(RING_OF_WEALTH_SCROLL, RING_OF_WEALTH_I, RING_OF_WEALTH_I1, RING_OF_WEALTH_I2, RING_OF_WEALTH_I3, RING_OF_WEALTH_I4, RING_OF_WEALTH_I5),
	ITEM_AMULET_OF_GLORY(AMULET_OF_GLORY, AMULET_OF_GLORY1, AMULET_OF_GLORY2, AMULET_OF_GLORY3, AMULET_OF_GLORY5),
	ITEM_AMULET_OF_GLORY_T(AMULET_OF_GLORY_T, AMULET_OF_GLORY_T1, AMULET_OF_GLORY_T2, AMULET_OF_GLORY_T3, AMULET_OF_GLORY_T5),
	ITEM_SKILLS_NECKLACE(SKILLS_NECKLACE, SKILLS_NECKLACE1, SKILLS_NECKLACE2, SKILLS_NECKLACE3, SKILLS_NECKLACE5),
	ITEM_RING_OF_DUELING(RING_OF_DUELING8, RING_OF_DUELING1, RING_OF_DUELING2, RING_OF_DUELING3, RING_OF_DUELING4, RING_OF_DUELING5, RING_OF_DUELING6, RING_OF_DUELING7),
	ITEM_GAMES_NECKLACE(GAMES_NECKLACE8, GAMES_NECKLACE1, GAMES_NECKLACE2, GAMES_NECKLACE3, GAMES_NECKLACE4, GAMES_NECKLACE5, GAMES_NECKLACE6, GAMES_NECKLACE7),

	// Degradable/charged weaponry/armour
	ITEM_ABYSSAL_WHIP(ABYSSAL_WHIP, VOLCANIC_ABYSSAL_WHIP, FROZEN_ABYSSAL_WHIP),
	ITEM_KRAKEN_TENTACLE(KRAKEN_TENTACLE, ABYSSAL_TENTACLE),
	ITEM_TRIDENT_OF_THE_SEAS(UNCHARGED_TRIDENT, TRIDENT_OF_THE_SEAS),
	ITEM_TRIDENT_OF_THE_SEAS_E(UNCHARGED_TRIDENT_E, TRIDENT_OF_THE_SEAS_E),
	ITEM_TRIDENT_OF_THE_SWAMP(UNCHARGED_TOXIC_TRIDENT, TRIDENT_OF_THE_SWAMP),
	ITEM_TRIDENT_OF_THE_SWAMP_E(UNCHARGED_TOXIC_TRIDENT_E, TRIDENT_OF_THE_SWAMP_E),
	ITEM_TOXIC_BLOWPIPE(TOXIC_BLOWPIPE_EMPTY, TOXIC_BLOWPIPE),
	ITEM_TOXIC_STAFF_OFF_THE_DEAD(TOXIC_STAFF_UNCHARGED, TOXIC_STAFF_OF_THE_DEAD),
	ITEM_SERPENTINE_HELM(SERPENTINE_HELM_UNCHARGED, SERPENTINE_HELM, TANZANITE_HELM_UNCHARGED, TANZANITE_HELM, MAGMA_HELM_UNCHARGED, MAGMA_HELM),
	ITEM_DRAGONFIRE_SHIELD(DRAGONFIRE_SHIELD_11284, DRAGONFIRE_SHIELD),
	ITEM_DRAGONFIRE_WARD(DRAGONFIRE_WARD_22003, DRAGONFIRE_WARD),
	ITEM_ANCIENT_WYVERN_SHIELD(ANCIENT_WYVERN_SHIELD_21634, ANCIENT_WYVERN_SHIELD),
	ITEM_SANGUINESTI_STAFF(SANGUINESTI_STAFF_UNCHARGED, SANGUINESTI_STAFF),
	ITEM_SCYTHE_OF_VITUR(SCYTHE_OF_VITUR_UNCHARGED, SCYTHE_OF_VITUR),
	ITEM_TOME_OF_FIRE(TOME_OF_FIRE_EMPTY, TOME_OF_FIRE),
	ITEM_CRAWS_BOW(CRAWS_BOW_U, CRAWS_BOW),
	ITEM_VIGGORAS_CHAINMACE(VIGGORAS_CHAINMACE_U, VIGGORAS_CHAINMACE),
	ITEM_THAMMARONS_SCEPTRE(THAMMARONS_SCEPTRE_U, THAMMARONS_SCEPTRE),

	// Infinity colour kits
	ITEM_INFINITY_TOP(INFINITY_TOP, INFINITY_TOP_10605, INFINITY_TOP_20574, DARK_INFINITY_TOP, LIGHT_INFINITY_TOP),
	ITEM_INFINITY_TOP_LIGHT_COLOUR_KIT(LIGHT_INFINITY_COLOUR_KIT, LIGHT_INFINITY_TOP),
	ITEM_INFINITY_TOP_DARK_COLOUR_KIT(DARK_INFINITY_COLOUR_KIT, DARK_INFINITY_TOP),
	ITEM_INFINITY_BOTTOMS(INFINITY_BOTTOMS, INFINITY_BOTTOMS_20575, DARK_INFINITY_BOTTOMS, LIGHT_INFINITY_BOTTOMS),
	ITEM_INFINITY_BOTTOMS_LIGHT_COLOUR_KIT(LIGHT_INFINITY_COLOUR_KIT, LIGHT_INFINITY_BOTTOMS),
	ITEM_INFINITY_BOTTOMS_DARK_COLOUR_KIT(DARK_INFINITY_COLOUR_KIT, DARK_INFINITY_BOTTOMS),
	ITEM_INFINITY_HAT(INFINITY_HAT, DARK_INFINITY_HAT, LIGHT_INFINITY_HAT),
	ITEM_INFINITY_HAT_LIGHT_COLOUR_KIT(LIGHT_INFINITY_COLOUR_KIT, LIGHT_INFINITY_HAT),
	ITEM_INFINITY_HAT_DARK_COLOUR_KIT(DARK_INFINITY_COLOUR_KIT, DARK_INFINITY_HAT),

	// Miscellaneous ornament kits
	ITEM_DARK_BOW(DARK_BOW, DARK_BOW_12765, DARK_BOW_12766, DARK_BOW_12767, DARK_BOW_12768, DARK_BOW_20408),
	ITEM_ODIUM_WARD(ODIUM_WARD, ODIUM_WARD_12807),
	ITEM_MALEDICTION_WARD(MALEDICTION_WARD, MALEDICTION_WARD_12806),
	ITEM_STEAM_BATTLESTAFF(STEAM_BATTLESTAFF, STEAM_BATTLESTAFF_12795),
	ITEM_LAVA_BATTLESTAFF(LAVA_BATTLESTAFF, LAVA_BATTLESTAFF_21198),
	ITEM_TZHAARKETOM(TZHAARKETOM, TZHAARKETOM_T),
	ITEM_TZHAARKETOM_ORNAMENT_KIT(TZHAARKETOM_ORNAMENT_KIT, TZHAARKETOM_T),

	// Slayer helm/black mask
	ITEM_BLACK_MASK(
		BLACK_MASK, BLACK_MASK_I, BLACK_MASK_1, BLACK_MASK_1_I, BLACK_MASK_2, BLACK_MASK_2_I, BLACK_MASK_3, BLACK_MASK_3_I, BLACK_MASK_4, BLACK_MASK_4_I, BLACK_MASK_5,
		BLACK_MASK_5_I, BLACK_MASK_6, BLACK_MASK_6_I, BLACK_MASK_7, BLACK_MASK_7_I, BLACK_MASK_8, BLACK_MASK_8_I, BLACK_MASK_9, BLACK_MASK_9_I, BLACK_MASK_10_I,
		SLAYER_HELMET, SLAYER_HELMET_I, BLACK_SLAYER_HELMET, BLACK_SLAYER_HELMET_I, PURPLE_SLAYER_HELMET, PURPLE_SLAYER_HELMET_I, RED_SLAYER_HELMET, RED_SLAYER_HELMET_I,
		GREEN_SLAYER_HELMET, GREEN_SLAYER_HELMET_I, TURQUOISE_SLAYER_HELMET, TURQUOISE_SLAYER_HELMET_I, TWISTED_SLAYER_HELMET, TWISTED_SLAYER_HELMET_I, HYDRA_SLAYER_HELMET, HYDRA_SLAYER_HELMET_I),

	// Pharaoh's Sceptres
	ITEM_PHARAOHS_SCEPTRE_1(PHARAOHS_SCEPTRE, PHARAOHS_SCEPTRE_1),
	ITEM_PHARAOHS_SCEPTRE_2(PHARAOHS_SCEPTRE, PHARAOHS_SCEPTRE_2),
	ITEM_PHARAOHS_SCEPTRE_4(PHARAOHS_SCEPTRE, PHARAOHS_SCEPTRE_4),
	ITEM_PHARAOHS_SCEPTRE_5(PHARAOHS_SCEPTRE, PHARAOHS_SCEPTRE_5),
	ITEM_PHARAOHS_SCEPTRE_6(PHARAOHS_SCEPTRE, PHARAOHS_SCEPTRE_6),
	ITEM_PHARAOHS_SCEPTRE_7(PHARAOHS_SCEPTRE, PHARAOHS_SCEPTRE_7),
	ITEM_PHARAOHS_SCEPTRE_8(PHARAOHS_SCEPTRE, PHARAOHS_SCEPTRE_8),

	// Revertible items
	ITEM_HYDRA_LEATHER(HYDRA_LEATHER, FEROCIOUS_GLOVES),
	ITEM_HYDRA_TAIL(HYDRA_TAIL, BONECRUSHER_NECKLACE),
	ITEM_DRAGONBONE_NECKLACE(DRAGONBONE_NECKLACE, BONECRUSHER_NECKLACE),
	ITEM_BOTTOMLESS_COMPOST_BUCKET(BOTTOMLESS_COMPOST_BUCKET, BOTTOMLESS_COMPOST_BUCKET_22997),
	ITEM_BASILISK_JAW(BASILISK_JAW, NEITIZNOT_FACEGUARD),
	ITEM_HELM_OF_NEITIZNOT(HELM_OF_NEITIZNOT, NEITIZNOT_FACEGUARD),
	ITEM_TWISTED_HORNS(TWISTED_HORNS, TWISTED_SLAYER_HELMET, TWISTED_SLAYER_HELMET_I),
	ITEM_ELDRITCH_ORB(ELDRITCH_ORB, ELDRITCH_NIGHTMARE_STAFF),
	ITEM_HARMONISED_ORB(HARMONISED_ORB, HARMONISED_NIGHTMARE_STAFF),
	ITEM_VOLATILE_ORB(VOLATILE_ORB, VOLATILE_NIGHTMARE_STAFF),
	ITEM_NIGHTMARE_STAFF(NIGHTMARE_STAFF, ELDRITCH_NIGHTMARE_STAFF, HARMONISED_NIGHTMARE_STAFF, VOLATILE_NIGHTMARE_STAFF),

	// Crystal items
	ITEM_CRYSTAL_TOOL_SEED(CRYSTAL_TOOL_SEED, CRYSTAL_AXE, CRYSTAL_AXE_INACTIVE, CRYSTAL_HARPOON, CRYSTAL_HARPOON_INACTIVE, CRYSTAL_PICKAXE, CRYSTAL_PICKAXE_INACTIVE),
	ITEM_CRYSTAL_AXE(DRAGON_AXE, CRYSTAL_AXE, CRYSTAL_AXE_INACTIVE),
	ITEM_CRYSTAL_HARPOON(DRAGON_HARPOON, CRYSTAL_HARPOON, CRYSTAL_HARPOON_INACTIVE),
	ITEM_CRYSTAL_PICKAXE(DRAGON_PICKAXE, CRYSTAL_PICKAXE, CRYSTAL_PICKAXE_INACTIVE),
	ITEM_BLADE_OF_SAELDOR(BLADE_OF_SAELDOR_INACTIVE, BLADE_OF_SAELDOR, BLADE_OF_SAELDOR_C),
	ITEM_CRYSTAL_BOW(CRYSTAL_WEAPON_SEED, CRYSTAL_BOW, CRYSTAL_BOW_24123, CRYSTAL_BOW_INACTIVE),
	ITEM_CRYSTAL_HALBERD(CRYSTAL_WEAPON_SEED, CRYSTAL_HALBERD, CRYSTAL_HALBERD_24125, CRYSTAL_HALBERD_INACTIVE),
	ITEM_CRYSTAL_SHIELD(CRYSTAL_WEAPON_SEED, CRYSTAL_SHIELD, CRYSTAL_SHIELD_24127, CRYSTAL_SHIELD_INACTIVE),

	// Bird nests
	ITEM_BIRD_NEST(BIRD_NEST_5075, BIRD_NEST, BIRD_NEST_5071, BIRD_NEST_5072, BIRD_NEST_5073, BIRD_NEST_5074, BIRD_NEST_7413, BIRD_NEST_13653, BIRD_NEST_22798, BIRD_NEST_22800, CLUE_NEST_EASY, CLUE_NEST_MEDIUM, CLUE_NEST_HARD, CLUE_NEST_ELITE),

	// Ancestral robes
	ITEM_ANCESTRAL_HAT(ANCESTRAL_HAT, TWISTED_ANCESTRAL_HAT),
	ITEM_ANCESTRAL_ROBE_TOP(ANCESTRAL_ROBE_TOP, TWISTED_ANCESTRAL_ROBE_TOP),
	ITEM_ANCESTRAL_ROBE_BOTTOM(ANCESTRAL_ROBE_BOTTOM, TWISTED_ANCESTRAL_ROBE_BOTTOM);

	private static final Multimap<Integer, Integer> MAPPINGS = HashMultimap.create();
	private final int tradeableItem;
	private final int[] untradableItems;

	static
	{
		for (final ItemMapping item : values())
		{
			for (int itemId : item.untradableItems)
			{
				MAPPINGS.put(itemId, item.tradeableItem);
			}
		}
	}

	ItemMapping(int tradeableItem, int... untradableItems)
	{
		this.tradeableItem = tradeableItem;
		this.untradableItems = untradableItems;
	}

	/**
	 * Get collection of items that are mapped from single item id.
	 *
	 * @param itemId the item id
	 * @return the collection
	 */
	public static Collection<Integer> map(int itemId)
	{
		final Collection<Integer> mapping = MAPPINGS.get(itemId);

		if (mapping == null || mapping.isEmpty())
		{
			return Collections.singleton(itemId);
		}

		return mapping;
	}

	/**
	 * Map an item from its untradeable version to its tradeable version
	 *
	 * @param itemId
	 * @return
	 */
	public static int mapFirst(int itemId)
	{
		final Collection<Integer> mapping = MAPPINGS.get(itemId);

		if (mapping == null || mapping.isEmpty())
		{
			return itemId;
		}

		return mapping.iterator().next();
	}
}
