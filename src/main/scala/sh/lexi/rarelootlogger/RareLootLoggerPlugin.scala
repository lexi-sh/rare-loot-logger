package sh.lexi.rarelootlogger;

import com.google.inject.Provides

import javax.inject.Inject
import lombok.extern.slf4j.Slf4j
import net.runelite.api.{ChatMessageType, Client, GameState, Skill}
import net.runelite.api.events.{GameStateChanged, StatChanged}
import net.runelite.client.config.ConfigManager
import net.runelite.client.eventbus.Subscribe
import net.runelite.client.plugins.Plugin
import net.runelite.client.plugins.PluginDescriptor
import org.slf4j.{Logger, LoggerFactory}
import sh.lexi.rarelootlogger.actions.PlayerFishing

@PluginDescriptor(
	name = "Rare Loot Logger"
)
class RareLootLoggerPlugin extends Plugin
{
	@Inject
	var client: Client = null

	@Inject
	var config: RareLootLoggerConfig = null

	var playerFishing: PlayerFishing = PlayerFishing(1)


	private val log: Logger = LoggerFactory.getLogger(getClass.getName)

	override def startUp(): Unit = {
		log.info("Rare Loot Logger started!");

		val playerFishingLevel = client.getBoostedSkillLevel(Skill.FISHING)
		playerFishing = PlayerFishing(playerFishingLevel)
	}

	@Override
	override def shutDown(): Unit = {
		log.info("Rare Loot Logger stopped!");
	}

	@Subscribe
	def onGameStateChanged(gameStateChanged: GameStateChanged ): Unit = {
		if (gameStateChanged.getGameState == GameState.LOGGED_IN)
		{
			
		}
	}

	@Provides
	def provideConfig(configManager: ConfigManager): RareLootLoggerConfig = {
		configManager.getConfig(classOf[RareLootLoggerConfig]);
	}

	@Subscribe
	def onStatChanged(statChanged: StatChanged): Unit =
	{
		if (statChanged.getSkill == Skill.FISHING) {
			playerFishing = PlayerFishing(statChanged.getBoostedLevel)
		}
//
//		agilityLevel = statChanged.getBoostedLevel();
//
//		// Determine how much EXP was actually gained
//		int agilityXp = statChanged.getXp();
//		int skillGained = agilityXp - lastAgilityXp;
//		lastAgilityXp = agilityXp;
//
//		log.debug("Gained {} xp at {}", skillGained, client.getLocalPlayer().getWorldLocation());
//
//		// Get course
//		Courses course = Courses.getCourse(client.getLocalPlayer().getWorldLocation().getRegionID());
//		if (course == null
//			|| !config.showLapCount()
//			|| Arrays.stream(course.getCourseEndWorldPoints()).noneMatch(wp -> wp.equals(client.getLocalPlayer().getWorldLocation()))) {
//			return;
//		}
//
//		trackSession(course);
	}

}
