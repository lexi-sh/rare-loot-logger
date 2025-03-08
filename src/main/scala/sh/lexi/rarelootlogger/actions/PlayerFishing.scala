package sh.lexi.rarelootlogger.actions

import net.runelite.api.AnimationID
import net.runelite.api.ItemID


case class PlayerFishing(fishingLevel: Int) {
  def heronChance(fishItemId: Int): Option[Double] = {
    PlayerFishing.itemIdToBasePercentChanceMapping.get(fishItemId).map(baseChance => {
      baseChance
    })
  }
}

object PlayerFishing {
  private val heronAnimationIds = Set(
    AnimationID.FISHING_BARBTAIL_HARPOON,
    AnimationID.FISHING_BAREHAND,
    AnimationID.FISHING_BAREHAND_CAUGHT_SHARK_1,
    AnimationID.FISHING_BAREHAND_CAUGHT_SHARK_2,
    AnimationID.FISHING_BAREHAND_CAUGHT_SWORDFISH_1,
    AnimationID.FISHING_BAREHAND_CAUGHT_SWORDFISH_2,
    AnimationID.FISHING_BAREHAND_CAUGHT_TUNA_1,
    AnimationID.FISHING_BAREHAND_CAUGHT_TUNA_2,
    AnimationID.FISHING_BAREHAND_WINDUP_1,
    AnimationID.FISHING_BAREHAND_WINDUP_2,
    AnimationID.FISHING_BIG_NET,
    AnimationID.FISHING_CAGE,
    AnimationID.FISHING_CRYSTAL_HARPOON,
    AnimationID.FISHING_DRAGON_HARPOON,
    AnimationID.FISHING_DRAGON_HARPOON_OR,
    AnimationID.FISHING_HARPOON,
    AnimationID.FISHING_INFERNAL_HARPOON,
    AnimationID.FISHING_TRAILBLAZER_HARPOON,
    AnimationID.FISHING_KARAMBWAN,
    AnimationID.FISHING_NET,
    AnimationID.FISHING_OILY_ROD,
    AnimationID.FISHING_POLE_CAST,
    AnimationID.FISHING_PEARL_ROD,
    AnimationID.FISHING_PEARL_FLY_ROD,
    AnimationID.FISHING_PEARL_BARBARIAN_ROD,
    AnimationID.FISHING_PEARL_ROD_2,
    AnimationID.FISHING_PEARL_FLY_ROD_2,
    AnimationID.FISHING_PEARL_BARBARIAN_ROD_2,
    AnimationID.FISHING_PEARL_OILY_ROD,
    AnimationID.FISHING_BARBARIAN_ROD
  )

  private val itemIdToBasePercentChanceMapping: Map[Int, Double] = Map(
    ItemID.SHRIMPS -> 1.0/435165,
    ItemID.ANCHOVIES -> 1.0/435165,
    ItemID.RAW_KARAMBWANJI -> 1.0/443697,
  )



}
