package sh.lexi.rarelootlogger;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import org.slf4j.{Logger, LoggerFactory}

@PluginDescriptor(
	name = "Rare Loot Logger"
)
class RareLootLoggerPlugin extends Plugin
{
	@Inject
	var client: Client = null

	@Inject
	var config: RareLootLoggerConfig = null


	private val log: Logger = LoggerFactory.getLogger(getClass.getName)

	override def startUp(): Unit = {
		log.info("Rare Loot Logger started!");
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
}
